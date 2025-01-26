```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Incorrect usage of foldLeft, attempting to sum integers while accumulating a String
  val result = list.foldLeft("")((acc, elem) => acc + elem)
  println(result) // Output: 12345

  //Correct usage
  val correctResult = list.foldLeft(0)((acc, elem) => acc + elem)
  println(correctResult) //Output: 15
}
```