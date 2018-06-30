name := "chat"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.6"

lazy val versions = new {
  val finatra = "18.6.0"
  val guice = "4.2.0"
  val mockito = "2.19.0"
  val scalatest = "3.0.5"
}

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra-http" % versions.finatra,
//  "com.twitter" %% "finatra-slf4j" % versions.finatra,
  "com.github.seratch" %% "awscala" % "0.5.+",
  "org.slf4j" % "slf4j-simple" % "1.7.21",

  "com.twitter" %% "finatra-http" % versions.finatra % "test",
  "com.twitter" %% "inject-server" % versions.finatra % "test",
  "com.twitter" %% "inject-app" % versions.finatra % "test",
  "com.twitter" %% "inject-core" % versions.finatra % "test",
  "com.twitter" %% "inject-modules" % versions.finatra % "test",
  "com.google.inject.extensions" % "guice-testlib" % versions.guice % "test",

  "com.twitter" %% "finatra-http" % versions.finatra % "test" classifier "tests",
  "com.twitter" %% "inject-server" % versions.finatra % "test" classifier "tests",
  "com.twitter" %% "inject-app" % versions.finatra % "test" classifier "tests",
  "com.twitter" %% "inject-core" % versions.finatra % "test" classifier "tests",
  "com.twitter" %% "inject-modules" % versions.finatra % "test" classifier "tests",

  "org.mockito" % "mockito-core" % versions.mockito % "test",
  "org.scalatest" %% "scalatest" % versions.scalatest % "test",
  "junit" % "junit" % "4.12" % "test"
)