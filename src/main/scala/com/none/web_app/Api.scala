package com.none.web_app

import java.lang.management.ManagementFactory

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer
import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.LazyLogging
import scala.concurrent.Await
import scala.concurrent.duration._
import scala.util.{Failure, Success}

object Api extends App with LazyLogging {

  //Initiate config first
  //And context
  lazy val config = ConfigFactory.load()

  lazy val host = config.getString("http.host")

  logger.info(s"Setted hostname: $host")

  lazy val port = config.getInt("http.port")

  logger.info(s"Setted port: $port")

  //Then environment context
  implicit val system = ActorSystem("my-system")

  implicit val materializer = ActorMaterializer()

  implicit val executionContext = system.dispatcher

  //Routes
  lazy val route = RouteOne().route ~ RouteTwo().route

  //Start Http server
  Http().bindAndHandle(route, host, port).onComplete {
    case Success(it) =>
      logger.info(s"Binded on $host:$port")

      logger.info("Server is up")

      sys.addShutdownHook {

        Await.result(it.unbind(), 10 seconds)

        materializer.shutdown()

        Await.result(system.terminate(), 10 seconds)

        logger.info(s"Set free $host:$port")

      }

    case Failure(err) =>
      logger.error("On server up something went wrong", err)

      materializer.shutdown()

      Await.result(system.terminate(), Duration.Inf)

      logger.info("Bye !!!")

      System.exit(0)

  }

  logger.info(
    s"Main thread id: ${ManagementFactory.getRuntimeMXBean().getName.split("@")(0)}"
  )

}
