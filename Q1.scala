import scala.io.StdIn.readLine

@main
def main(): Unit = {
  print("Enter the String to be Reversed : ")
  val orgStr = readLine()
  val revStr = reverseString(orgStr)
  println(s"Original String : $orgStr")
  println(s"Reversed String : $revStr")
}

def reverseString(s: String): String = {
  if (s.isEmpty) s
  else reverseString(s.tail) + s.head
}
