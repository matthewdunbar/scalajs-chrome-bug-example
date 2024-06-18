enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.13.14" // or a newer version such as "3.4.2", if you like

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += "com.lihaoyi" %%% "upickle" % "3.3.1"
