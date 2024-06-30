@main
def main(): Unit = {
  var num1: Int = 18
  var num2: Int = 23

  printf("Arithmetic Mean : %.2f", arithmeticMean(num1, num2))
}

def arithmeticMean(n1: Int, n2: Int): Double = {
  (n1 + n2) / 2.0 // Divided by 2.0 to avoid truncation
}
