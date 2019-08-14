package com.none

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import spray.json.DefaultJsonProtocol

package object web_app {

  case class Page(id: Long, page: String, perpage: String)

  case class Pages(pages: List[Page])

  case class A(p1: String, p2: Int, p3: Double, p4: B)

  case class B(list1: List[String], list2: List[Int])

  case class C(list: List[A])

  trait JsonSuport extends DefaultJsonProtocol with SprayJsonSupport {
    implicit val bFormat = jsonFormat2(B)
    implicit val aFormat = jsonFormat4(A)
    implicit val cFormat = jsonFormat1(C)
  }

}
