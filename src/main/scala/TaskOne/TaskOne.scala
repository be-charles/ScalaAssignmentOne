package TaskOne

import scala.collection.mutable.ListBuffer

object TaskOne {

  def main(args: Array[String]): Unit = {
    val numbers:ListBuffer[Int] = getNumbers()
    print(numbers)
  }
  def getNumbers(): ListBuffer[Int] = {
    val lb = new ListBuffer[Int]
    for(i <- 50 to 100){ lb.addOne(i) }
    lb
  }
}
