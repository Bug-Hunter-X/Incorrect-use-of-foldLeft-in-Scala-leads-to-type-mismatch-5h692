```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Correct usage of foldLeft to sum integers
  val sum = list.foldLeft(0)((accumulator, element) => accumulator + element)
  println(s"Sum of list elements: $sum") // Output: Sum of list elements: 15

  //Alternative using sum method
  val sum2 = list.sum
  println(s"Sum of list elements using sum method: $sum2") //Output: Sum of list elements using sum method: 15
}
```