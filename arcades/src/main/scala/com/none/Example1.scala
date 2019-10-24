package com.none

import java.time.temporal.ChronoField

import scala.concurrent.{ExecutionContext, Future}
import scala.concurrent.blocking
import scala.util.{Failure, Success}

object Example1 extends App {
  implicit val ec = ExecutionContext.global
  //  for (i <- 1 to 100) {
  //    val thread = new Thread {
  //      override def run {
  //       println(i)
  //      }
  //    }
  //    thread.start()
  //  }
  //  def a(f: Future[Int]) = {
  //    f.onComplete {
  //      case Success(value) => println(value)
  //    }
  //  }
    Future {
      for (i <- 0 to 100) {
        i
      }
    }

}
