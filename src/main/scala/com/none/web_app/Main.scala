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

  val configLoad = ConfigFactory.load()
  val route = Http().bindAndHandle(routes,configLoad.getString("http.host"),configLoad.getInt("http.port"))
}
