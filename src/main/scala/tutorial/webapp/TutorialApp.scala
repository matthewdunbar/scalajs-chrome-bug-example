package tutorial.webapp

object TutorialApp {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10000) {
      upickle.default.write("Hello world!")
    }

    println("Hello world!")
  }
}
