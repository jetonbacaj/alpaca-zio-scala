Global / onChangedBuildSource := ReloadOnSourceChanges

val scala3Version = "3.5.2"
val zioVersion = "2.1.11"
val zioHttpVersion = "3.0.1"
val zioSchemaVersion = "1.5.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "alpaca-zio-scala",
    
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
        "org.scalameta" %% "munit" % "1.0.0" % Test
      , "dev.zio" %% "zio" % zioVersion
      , "dev.zio" %% "zio-streams" % zioVersion
      , "dev.zio" %% "zio-schema-json" % zioSchemaVersion
      , "dev.zio" %% "zio-http" % zioHttpVersion
    )
  )
