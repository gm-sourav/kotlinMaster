fun printHello(name:String) {
    println("Hello $name")
}

fun sum(a:Int, b:Int) : Int {
    var sumt = a + b
    return sumt
}

fun main() {
    printHello("Sourov")
    printHello("John")
    println(sum(2,3))
}