package com.none.web_app

import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import com.typesafe.config.ConfigFactory

object Main extends App {
  implicit val system = ActorSystem("my-system")
  implicit val materializer = ActorMaterializer()

  val routes = concat(
    RouteOne.route(), RouteTwo.route()
  )

  val host = ConfigFactory.load().getString("http.host")
  val port = ConfigFactory.load().getInt("http.port")
  val route = Http().bindAndHandle(routes, host, port)
}
