import scala.sys.process.Process
import Dependencies._

scalaVersion in ThisBuild := "2.12.8"

lazy val global = project
  .in(file("."))
  .settings(settings)
  .aggregate(arcades, repository, models, service, api)

lazy val arcades = project
  .enablePlugins(BuildInfoPlugin)
  .settings(metaBuildSettings: _*)
  .settings(
    name := "arcades",
    commonSettings,
    settings,
    assemblySettings,
    libraryDependencies ++= Seq(scalaTest)
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

lazy val models = project
  .enablePlugins(BuildInfoPlugin)
  .settings(metaBuildSettings: _*)
  .settings(
    name := "models",
    commonSettings,
    settings,
    assemblySettings,
    )

lazy val repository = project
  .enablePlugins(BuildInfoPlugin)
  .settings(metaBuildSettings: _*)
  .settings(
    name := "repository",
    commonSettings,
    settings,
    assemblySettings,
    libraryDependencies ++= databaseDependencies
    )

lazy val service = project
  .enablePlugins(BuildInfoPlugin)
  .settings(metaBuildSettings: _*)
  .settings(
    name := "service",
    commonSettings settings,
    assemblySettings,
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
    BuildInfoKey.action("lastCommit")(lastCommit),
    ),
  buildInfoObject := "MetaInfo",
  buildInfoPackage := "MetaInfo"
  )

def branch = Process(s"git rev-parse --abbrev-ref HEAD").lineStream.head
def lastCommit = Process(s"git rev-parse --short HEAD~0").lineStream.head

scalafmtOnCompile := true

lazy val assemblySettings = Seq(
  assemblyJarName in assembly := name.value + ".jar",
  assemblyMergeStrategy in assembly := {
    case PathList("META-INF", xs@_*) => MergeStrategy.discard
    case _ => MergeStrategy.first
  }
  )
//Run a command on compile
//lazy val serverStart= taskKey[Unit]("start server")
//serverStart := {Process(s"docker start company-db").run}
//(compile in Compile):=((compile in Compile).dependsOn(serverStart)).value
