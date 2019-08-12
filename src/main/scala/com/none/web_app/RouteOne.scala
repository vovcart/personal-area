package com.none.web_app

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.{RequestContext, Route, RouteResult}

import scala.concurrent.Future

object RouteOne extends {

  def route(): Route = {
    val routeOne: Route = path("routeone") {
      concat(
        get {
          println("route one on GET!")
          complete("route one on GET!")
        },
        delete {
          println("route one on DELETE!")
          complete("route one on DELETE!")
        },
        put {
          println("route one on PUT!")
          complete("route one on PUT!")
        },
        patch {
          println("route one on PATCH!")
          complete("route one on PATCH!")
        },
        post {
          println("route one on POST!")
          complete("route one on POST!")
        }
      )
    }
    routeOne
  }

}
