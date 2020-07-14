package main.scala

object TaskTwo {

  def main(args: Array[String]): Unit = {
    val setOne = Array(11, 13, 15, 20, 10)
    val setTwo = Array(10, 7, 8, 19, 10)

    printSameElements(setOne, setTwo)
    printDifferentElements(setOne, setTwo)
  }
  def printSameElements(arrayOne: Array[Int], arrayTwo: Array[Int]):Unit = {
    println("Print Same Elements")
    for(num <- arrayOne){
      if(arrayTwo.contains(num)){
        println(num)
      }
    }
  }
  def printDifferentElements(arrayOne: Array[Int], arrayTwo: Array[Int]): Unit = {
    println("Print Different Elements")
    for(num <- arrayOne){
      if(!arrayTwo.contains(num)){
        println(num)
      }
    }
    for(num <- arrayTwo){
      if(!arrayOne.contains(num)){
        println(num)
      }
    }
  }
}
