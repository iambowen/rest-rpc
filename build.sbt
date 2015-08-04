organization := "com.thoughtworks"

name := "rest-rpc"

version := "1.0"

scalaVersion := "2.11.7"

lazy val sample = Project("rest-rpc-sample", file("rest-rpc-sample")) dependsOn(play)
lazy val play = Project("rest-rpc-play", file("rest-rpc-play")) dependsOn(core)
lazy val core = Project("rest-rpc-core", file("rest-rpc-core"))