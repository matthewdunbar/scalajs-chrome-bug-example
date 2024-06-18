# ScalaJS Chrome Bug Example

To replicate this bug:

- run `sbt fastOptJS`
- Load `scalajs-tutorial-fastopt.html` in Chrome v126 on an ARM device
- Notice the `println("Hello world!")` is never executed
