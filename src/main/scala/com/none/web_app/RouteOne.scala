package com.none.web_app

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.{RequestContext, Route, RouteResult}

object RouteOne extends {

  case class Page(id: Long, page: String, perpage: String)

  case class Pages(pages: List[Page])

  val pages = Pages(List(Page(1, "page1", "perpage1"), Page(2, "page2", "perPage2"), Page(3, "page3", "perPage3")))

  def route(): Route = {
    val routeOne: Route = {
      concat(
        get {
          path("routeone")
          parameters('page, 'perpage) {
            (page: String, perPage: String) =>
              complete {
                pages.pages.find(f => {
                  f.page == page && f.perpage == perPage
                }).get.toString
              }
          }
        },
        get {
          pathPrefix("routeone" / LongNumber) {
            id => {
              complete {
                pages.pages.find(_.id == id).get.toString
              }
            }
          }
        }
        ,
        delete {
          path("routeone")
          println("route one on DELETE!")
          complete("route one on DELETE!")
        }
        ,
        put {
          path("routeone")
          println("route one on PUT!")
          complete("route one on PUT!")
        }
        ,
        patch {
          path("routeone")
          println("route one on PATCH!")
          complete("route one on PATCH!")
        }
        ,
        post {
          path("routeone")
          println("route one on POST!")
          complete("route one on POST!")
        }
      )
    }
    routeOne
  }
}
