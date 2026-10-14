fun printHello(name:String = "guest") {
    println("Hello $name")
}

fun sum(a:Int, b:Int) : Int {
   return a+b
}

fun createUser(name:String , age:Int) {
    println("Name is $name")
    println("Age is $age")
}

fun main() {

    createUser("Alice", 29)
//    printHello()
//    printHello("Sourov")
//    printHello("John")
//    val result = sum(2,3)
//    println("The result is $result")
}