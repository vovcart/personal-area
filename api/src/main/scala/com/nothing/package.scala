package com

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
  
  //Test Data
  val pages = Pages(
    List(
      Page(1, "page1", "perpage1"),
      Page(2, "page2", "perPage2"),
      Page(3, "page3", "perPage3")
      )
    )
  
  val listC: List[A] = List(
    A("p1", 1, 1.00, B(List("l1.1", "l1.2", "l1.3"), List(1, 2, 3))),
    A("p2", 2, 2.00, B(List("l2.1", "l2.2", "l3.3"), List(4, 5, 6))),
    A("p3", 3, 3.00, B(List("l3.1", "l2.2", "l3.3"), List(7, 8, 9))),
    A("p4", 4, 4.00, B(List("l4.1", "l2.2", "l3.3"), List(10, 11, 12)))
    )
  
  val objectC = C(listC)
  
}
