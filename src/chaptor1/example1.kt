package chaptor1

fun main() {
  var str1 : String? = "Hello Kotlin"
  var num: Int? = null
  //str1 = null
  println("str1: $str1, num: $num")
  //println("str1: $str1, length: ${str1!!.length}")

  println("str1: $str1, length: ${str1?.length ?:-1}")
}