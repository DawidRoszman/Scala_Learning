@main
def main() =

  val doubleFunction : Function1[Int,Int] = x => 2 * x

  println(doubleFunction(2))
