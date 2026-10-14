fun printHello(name:String) {
    println("Hello $name")
}

fun sum(a:Int, b:Int) : Int {
   return a+b
}

fun main() {
    printHello("Sourov")
    printHello("John")
    val result = sum(2,3)
    println("The result is $result")
}