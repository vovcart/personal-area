package com.none.web_app

import java.lang.management.ManagementFactory

import akka.http.scaladsl.server.Directives._
import akka.actor.{ActorSystem, Terminated}
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.Logger
import akka.http.scaladsl.Http.ServerBinding

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}

object Api extends App {

  val log = Logger(Api.getClass)
  //Initiate config first
  //And context
  lazy val config = ConfigFactory.load()

  lazy val host = config.getString("http.host")
  log.info("Setted hostname: {}", host)

  lazy val port = config.getInt("http.port")
  log.info("Setted port: {}", port)

  //Then environment context
  implicit val system = ActorSystem("my-system")

  implicit val materializer = ActorMaterializer()

  implicit val executionContext = system.dispatcher

  //Routes
  lazy val route = RouteOne().route ~ RouteTwo().route

  //Start Http server
  val bindingFuture: Future[ServerBinding] = Http().bindAndHandle(route, host, port)
  log.info("binded with {}: {}! ", host, port)
  log.info("Server is up")

  sys.addShutdownHook {
    val terminate: Future[Terminated] = system.terminate()
    Await.result(terminate, Duration("10 seconds"))
    log.info("Server is not up")
  }

  log.info("Main thread id: "+ManagementFactory
    .getRuntimeMXBean()
    .getName()
    .split("@")(0)
  )
}
