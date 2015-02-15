val ScalaVersion = "2.11.5"

val jsoup = "org.jsoup" % "jsoup" % "1.8.1"
val reflect = "org.scala-lang" % "scala-reflect" % ScalaVersion
val slf4j = "org.clapper" %% "grizzled-slf4j" % "1.0.2"

lazy val root = (project in file(".")).
  settings(
    name := "scraper-helper",
    version := "0.1.0",
    scalaVersion := ScalaVersion,
    libraryDependencies ++= Seq(jsoup, slf4j, reflect)
  )
