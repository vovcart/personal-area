import scala.sys.process.Process

scalaVersion := "2.12.8"

lazy val metaBuildSettings = (project in file(".")).
  enablePlugins(BuildInfoPlugin).
  settings(
    buildInfoKeys := Seq(
      BuildInfoKey.action("branch")(branch),
      BuildInfoKey.action("lastCommit")(lastCommit),
      version),
    buildInfoPackage := "com.none",
    buildInfoObject:= "MetaInfo"
  )
def branch = Process(s"git rev-parse --abbrev-ref HEAD").lineStream.head
def lastCommit=Process(s"git rev-parse --short HEAD~0").lineStream.head


scalafmtOnCompile := true

libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.1.9"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.5.23"
libraryDependencies += "com.typesafe" % "config" % "1.3.4"
libraryDependencies += "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.9"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"