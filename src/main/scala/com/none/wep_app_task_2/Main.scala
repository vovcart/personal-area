package com.none.wep_app_task_2

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer

object Main extends App {
  implicit val system = ActorSystem("my-system")
  implicit val materializer = ActorMaterializer()
  //  implicit val executionContext = system.dispatcher
  val routes = concat(
    RouteOne.route(), RouteTwo.route()
  )


  val route = Http().bindAndHandle(routes, "localhost", 8080)
}
