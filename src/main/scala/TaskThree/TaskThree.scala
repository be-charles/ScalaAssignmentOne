package TaskThree

import scala.util.Sorting.quickSort

object TaskThree {

  def main(args: Array[String]): Unit = {
    val setOne: Array[Double] = Array(99, 10, 5, 5, 7, 10, 1)
    val setTwo: Array[Double] = Array(10, 30.0, 50, 4, 5)
    val mergedArray = setOne ++ setTwo

    println("Unsorted Merged Array")
    printArrayFirstMiddleLastElements(mergedArray)

    println("Sorted Merged Array")
    val sortedMergedArray = mergedArray
    quickSort(sortedMergedArray)
    printArrayFirstMiddleLastElements(sortedMergedArray)
  }

  def printArrayFirstMiddleLastElements(array: Array[Double]): Unit = {
    val first = array(0)
    val mid = array(array.length / 2)
    val last = array.last

    println(s"First: $first")
    println(s"Middle: $mid")
    println(s"Last: $last")
  }
}
