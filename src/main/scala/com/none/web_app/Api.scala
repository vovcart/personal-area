package com.none.web_app

import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import com.typesafe.config.ConfigFactory

object Api extends App {

  //Initiate config first
  //And context
  lazy val config = ConfigFactory.load()

  lazy val host = config.getString("http.host")

  lazy val port = config.getInt("http.port")

  //Then environment context
  implicit val system = ActorSystem("my-system")

  implicit val materializer = ActorMaterializer()

  //Routes
  lazy val routes =
    RouteOne().route ~
    pathPrefix("routetwo") { RouteTwo().route }


  //Start Http server
  val route = Http().bindAndHandle(routes, host, port)

  //TODO check if server is up
  //In case of fail do shutdown stuff (read AKKA-HTTP suggestions for that) ... shutdown main thread
}
