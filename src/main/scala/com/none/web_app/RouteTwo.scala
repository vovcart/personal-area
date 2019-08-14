package com.none.web_app

import akka.http.scaladsl.server.{Directives, Route}

object RouteTwo extends Directives with JsonSuport {

  val pages = Pages(List(Page(1, "page1", "perpage1"), Page(2, "page2", "perPage2"), Page(3, "page3", "perPage3")))

  val listC: List[A] = List(A("p1", 1, 1.00, B(List("l1.1", "l1.2", "l1.3"), List(1, 2, 3))),
    A("p2", 2, 2.00, B(List("l2.1", "l2.2", "l3.3"), List(4, 5, 6))),
    A("p3", 3, 3.00, B(List("l3.1", "l2.2", "l3.3"), List(7, 8, 9))),
    A("p4", 4, 4.00, B(List("l4.1", "l2.2", "l3.3"), List(10, 11, 12))))

  val objectC = C(listC)

  def route(): Route = {
    path("routetwo")
    concat(
      get {
        pathSingleSlash(
          complete(
            objectC
          )
        )
      },
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
