package com.none.wep_app_task_2

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

object RouteTwo {

  case class Page(id: Int, page: String, perpage: String)

  case class Pages(pages: List[Page])

  val pages = Pages(List(Page(1, "page1", "perpage1"), Page(2, "page2", "perPage2"), Page(3, "page3", "perPage3")))

  def route(): Route = {
    val routetwo: Route = {
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
        }
      )
    }
    routetwo
  }
}
