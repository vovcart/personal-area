package com.nothing.routes

import akka.http.scaladsl.server.Directives._
import com.web_app.JsonSuport
import com.web_app._

final case class RouteTwo() extends JsonSuport {

  def route = pathPrefix("routetwo") {
    concat(
      get {
        pathEndOrSingleSlash(
          complete(
            objectC
          )
        )
      },
      get {
        parameters('page, 'perpage) { (page: String, perPage: String) =>
          {
            complete {
              pages.pages
                .find(f => {
                  f.page == page && f.perpage == perPage
                })
                .get
                .toString
            }
          }
        }
      },
      get {
        pathPrefix(LongNumber) { id =>
          {
            complete {
              pages.pages.find(_.id == id).get.toString
            }
          }
        }
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
}
