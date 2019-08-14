package com.none.web_app

import akka.http.scaladsl.server.{Directives, Route}

object RouteOne extends Directives with JsonSuport {

  val pages = Pages(List(Page(1, "page1", "perpage1"), Page(2, "page2", "perPage2"), Page(3, "page3", "perPage3")))

  val listC: List[A] = List(A("p1", 1, 1.00, B(List("l1.1", "l1.2", "l1.3"), List(1, 2, 3))),
    A("p2", 2, 2.00, B(List("l2.1", "l2.2", "l3.3"), List(4, 5, 6))),
    A("p3", 3, 3.00, B(List("l3.1", "l2.2", "l3.3"), List(7, 8, 9))),
    A("p4", 4, 4.00, B(List("l4.1", "l2.2", "l3.3"), List(10, 11, 12))))

  val objectC = C(listC)

  def route(): Route = {
    path("routeone")
    concat(

      get {
        pathSingleSlash(
          complete(
            objectC
          )
        )
      },
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
        pathPrefix("routeone" / LongNumber) {
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
