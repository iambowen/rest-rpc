logLevel := Level.Warn

lazy val plugins = project in file(".") dependsOn(restRpc)

lazy val restRpc = project in file("sbt-rest-rpc")

addSbtPlugin("com.qifun" % "sbt-haxe" % "1.3.0")