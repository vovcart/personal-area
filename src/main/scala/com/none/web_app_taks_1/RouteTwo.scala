package com.none.web_app_taks_1

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.{Route}

object RouteTwo {

  case class Page(id: Int, page: String, perpage: String)

  case class Pages(pages: List[Page])

  val pages = Pages(List(Page(1, "page1", "perpage1"), Page(2, "page2", "perPage2"), Page(3, "page3", "perPage3")))

  def route(): Route = {
    path("routetwo")
    concat(
      get {
        path("routetwo")
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
        pathPrefix("routetwo" / LongNumber) {
          id => {
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
