package CustomUtils2

import CustomUtils1._

object CustomUtils2 extends App {
  def runU2(): Unit = {
    CustomUtils1.runU1()
    println("Util 2 helper")
  }

  runU2()
}