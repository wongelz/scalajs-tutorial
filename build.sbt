enablePlugins(ScalaJSPlugin, SbtWeb)

name := "Scala.js Tutorial"
scalaVersion := "2.12.4"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.5"
libraryDependencies += "org.querki" %%% "jquery-facade" % "1.2"

skip in packageJSDependencies := false
jsDependencies +=
  "org.webjars" % "jquery" % "2.2.1" / "jquery.js" minified "jquery.min.js"

JsEngineKeys.engineType := JsEngineKeys.EngineType.Trireme

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

// uTest settings
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.6.3" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")
