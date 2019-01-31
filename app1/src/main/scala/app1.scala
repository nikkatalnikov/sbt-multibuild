package app1

import CustomUtils2._
import org.apache.avro._
import scala.io.Source

object app1 extends App {
  def runApp(): Unit = {
    CustomUtils2.runU2()
    println("Util application")

    val input = Source
      .fromFile(getClass.getResource("/example.avsc").getFile)
      .mkString

    val schema = new Schema.Parser().parse(input)
  }

  runApp()
}