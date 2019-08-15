package com.none.web_app

import akka.http.scaladsl.server.Directives._

final case class RouteOne() extends JsonSuport {

  def route = pathPrefix("routeone") {
    concat(
      get {
        pathEndOrSingleSlash(
          complete(
            objectC
          )
        )
      }
      ,
      get {
        parameters('page, 'perpage) {
          (page: String, perPage: String) => {
            complete {
              pages.pages.find(f => {
                f.page == page && f.perpage == perPage
              }).get.toString
            }
          }
        }
      },
      get {
        pathPrefix(LongNumber) {
          id => {
            complete {
              pages.pages.find(_.id == id).get.toString
            }
          }
        }
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
}
