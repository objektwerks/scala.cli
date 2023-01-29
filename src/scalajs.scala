package objektwerks

import scala.scalajs.js

object ScalaJs:
  def main(args: Array[String]): Unit =
    val console = js.Dynamic.global.console
    val message = "I am a ScalaJs source file and app!"
    console.log(message)