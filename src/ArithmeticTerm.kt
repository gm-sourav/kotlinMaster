fun main() {
    var result1 = add(10,20)
    println(result1)
    var result2 = sub(10,20)
    println(result2)
    var result3 = mult(10,20)
    println(result3)
    var result4 = div(10,20)
    println(result4)




}

fun add(a: Int, b: Int): Int {
    return a+b
}

fun sub(a: Int, b: Int): Int {
    return a-b
}
fun mult(a: Int, b: Int): Int {
    return a*b
}
fun div(a: Int, b: Int): Int {
    return a/b
}

