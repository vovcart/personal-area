import sbt._

object Dependencies {

  lazy val commonDependencies = Seq(
    akkahttp,
    akkaStream,
    typesafeConfig,
    akkaHttpSprayJson,
    scalaLogging,
    scalaTest,
    logback
    )
  lazy val databaseDependencies = Seq(
    mysqlConnector,
    flyWay,
    slick,
    logback,
    scalaLogging,
    scalaTest
    )

  val akkahttp = "com.typesafe.akka" %% "akka-http" % "10.1.9"
  val akkaStream = "com.typesafe.akka" %% "akka-stream" % "2.5.23"
  val typesafeConfig = "com.typesafe" % "config" % "1.3.4"
  val akkaHttpSprayJson = "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.9"
  val logback = "ch.qos.logback" % "logback-classic" % "1.2.3"
  val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.1" % "test"
  val mysqlConnector = "mysql" % "mysql-connector-java" % "5.1.44"
  val flyWay = "org.flywaydb" %% "flyway-play" % "5.3.3"
  val slick = "com.typesafe.slick" %% "slick" % "3.3.2"
}
