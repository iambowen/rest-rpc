organization := "com.thoughtworks"

name := "rest-rpc"

version := "1.0"

scalaVersion := "2.11.7"


lazy val sample = Project(id = "rest-rpc-sample", base = file("rest-rpc-sample")) dependsOn(play)
lazy val play = Project(id = "rest-rpc-play", base = file("rest-rpc-play")) dependsOn(core)
lazy val core = Project(id = "rest-rpc-core", base = file("rest-rpc-core"))