@main
def main(): Unit = {
  var numList: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  println(s"Sum : ${calculateSum(numList)}")
}

def calculateSum(numList: List[Int]): Int = {
  var sum = 0
  numList.foreach { num => sum += num }
  return sum
}
