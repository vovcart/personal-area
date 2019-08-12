package com.none.web_app

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.{RequestContext, Route, RouteResult}

import scala.concurrent.Future

object RouteTwo extends {

  def route(): Route = {
    val routetwo: Route = path("routetwo") {
      concat(
        get {
          println("route two on GET!")
          complete("route two on GET!")
        },
        delete {
          println("route two on DELETE!")
          complete("route two on DELETE!")
        },
        put {
          println("route two on PUT!")
          complete("route two on PUT!")
        },
        patch {
          println("route two on PATCH!")
          complete("route two on PATCH!")
        },
        post {
          println("route two on POST!")
          complete("route two on POST!")
        }
      )
    }
    routetwo
  }
}
