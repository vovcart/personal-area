import scala.sys.process.Process

scalaVersion in ThisBuild := "2.12.8"

lazy val global = project
  .in(file("."))
  .settings(settings)
  .aggregate(arcades, repository, model, service, api)

lazy val arcades = project
  .enablePlugins(BuildInfoPlugin)
  .settings(metaBuildSettings: _*)
  .settings(
    name := "arcades",
    commonSettings,
    settings,
    assemblySettings
  )

lazy val api = project
  .enablePlugins(BuildInfoPlugin)
  .settings(metaBuildSettings: _*)
  .settings(
    name := "api",
    commonSettings,
    settings,
    assemblySettings,
    libraryDependencies ++= commonDependencies
  )

lazy val model = project
  .enablePlugins(BuildInfoPlugin)
  .settings(metaBuildSettings: _*)
  .settings(
    name := "model",
    commonSettings,
    settings,
    assemblySettings,
    libraryDependencies ++= commonDependencies
  )

lazy val repository = project
  .enablePlugins(BuildInfoPlugin)
  .settings(metaBuildSettings: _*)
  .settings(
    name := "repository",
    commonSettings,
    settings,
    assemblySettings,
    libraryDependencies ++= commonDependencies
  )

lazy val service = project
  .enablePlugins(BuildInfoPlugin)
  .settings(metaBuildSettings: _*)
  .settings(
    name := "service",
    commonSettings settings,
    assemblySettings,
    libraryDependencies ++= commonDependencies
  )

lazy val commonSettings = List(
  scalacOptions := "-unchecked" ::
    "-target:jvm-1.8" :: Nil
)

lazy val settings = Seq(
  scalacOptions ++= Seq(
    "-unchecked",
    "-feature",
    "-language:existentials",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-language:postfixOps",
    "-deprecation",
    "-encoding",
    "utf8"
  ),
  resolvers ++= Seq(
    "Local Maven Repository" at "file://" + Path.userHome.absolutePath + "/.m2/repository",
    Resolver.sonatypeRepo("releases"),
    Resolver.sonatypeRepo("snapshots")
  )
)

lazy val metaBuildSettings = List(
  buildInfoKeys := Seq(
    scalaVersion,
    BuildInfoKey.action("branch")(branch),
    BuildInfoKey.action("lastCommit")(lastCommit)
  ),
  buildInfoObject := "MetaInfo",
  buildInfoPackage := "MetaInfo"
)

def branch = Process(s"git rev-parse --abbrev-ref HEAD").lineStream.head
def lastCommit = Process(s"git rev-parse --short HEAD~0").lineStream.head

scalafmtOnCompile := true

lazy val dependencies = new {
  val akkahttp = "com.typesafe.akka" %% "akka-http" % "10.1.9"
  val akkaStream = "com.typesafe.akka" %% "akka-stream" % "2.5.23"
  val typesafeConfig = "com.typesafe" % "config" % "1.3.4"
  val akkaHttpSprayJson = "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.9"
  val logback = "ch.qos.logback" % "logback-classic" % "1.2.3"
  val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
}

lazy val commonDependencies = Seq(
  dependencies.akkahttp,
  dependencies.akkaStream,
  dependencies.typesafeConfig,
  dependencies.akkaHttpSprayJson,
  dependencies.logback,
  dependencies.scalaLogging
)

lazy val assemblySettings = Seq(
  assemblyJarName in assembly := name.value + ".jar",
  assemblyMergeStrategy in assembly := {
    case PathList("META-INF", xs @ _*) => MergeStrategy.discard
    case _                             => MergeStrategy.first
  }
)
