fun main() {
//    println("Enter your name-- ")
//    var name : String  = "Rahim"
//    println("Name is $name")


//    var name1 : String? = "Rahim"
//    println(name1)
//
//    name1 = null
//    println("Name is $name1")


//    var name : String? = "null"
//    println(name?.length)

    var name : String? = null

    name?.let{
        println("Name = $it")
        println(name?.length)
    }

    println("Done")









}