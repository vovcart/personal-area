package com.none.web_app_taks_1

import akka.http.scaladsl.server.Directives._
import akka.actor.{ActorSystem}
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer

object Main extends App {
  implicit val system = ActorSystem("my-system")
  implicit val materializer = ActorMaterializer()

  val routes = concat(
    RouteOne.route(), RouteTwo.route()
  )
  val route = Http().bindAndHandle(routes, "localhost", 8080)
}
