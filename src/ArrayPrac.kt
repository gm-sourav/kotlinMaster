fun main() {

    println("Enter array size - ")
    val n = readln().toInt()

    val arr = IntArray(n)

    println("Enter elements - ")
    for (i in 0 until n) {
        arr[i] = readln().toInt()
    }

    println("The elements are")

    for (x in arr) {
        print(" $x")
    }
}