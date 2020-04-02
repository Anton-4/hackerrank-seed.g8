ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.1.1" % Test,
      "org.scalacheck" %% "scalacheck" % "1.14.3" % Test,
      "org.scalatestplus" %% "scalatestplus-scalacheck" % "1.0.0-M2" % Test
    ),
    scalacOptions += "-deprecation"
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
