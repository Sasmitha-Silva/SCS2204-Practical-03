@main
def main(): Unit = {
  var stringList: List[String] = List("AB", "ABCDEF", "CFEeDS", "JKS", "AEANAA")

  println(s"List :  ${filterStrings(stringList)}")
}

def filterStrings(strList: List[String]): List[String] = {
  strList.filter(str => str.length() > 5)
}

// Method 02 - filterStrings Function

// def filterStrings(strList: List[String]): List[String] = {
//   var strList2: List[String] = List()
//   strList.foreach { str =>
//     if (str.length() > 5) then strList2 = strList2 :+ str
//   }
//   strList2
// }
