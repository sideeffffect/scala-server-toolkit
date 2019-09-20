import sbt._

object Dependencies {

  val catsEffect = "org.typelevel" %% "cats-effect" % "2.0.0"
  val kindProjector = "org.typelevel" %% "kind-projector" % "0.10.3"
  val pureConfig = "com.github.pureconfig" %% "pureconfig" % "0.12.0"
  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.8" % Test
  val zio = "dev.zio" %% "zio" % "1.0.0-RC12-1"
  val zioInteropCats = "dev.zio" %% "zio-interop-cats" % "2.0.0.0-RC3"

}