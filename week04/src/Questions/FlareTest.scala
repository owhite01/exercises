package Questions

object FlareTest {
  def main(args: Array[String]) {
    val flare = new Flare
    val f1 = flare.light()
    assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)
  }

}
