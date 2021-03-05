fun main(args: Array<String>){
    println("Hello IntelliJ!")

    //variables
    val language = "French" //val cannot be changed later
    var score: Int = 95 //var can be changed later
    score = 15
    //number types
    val range: Byte = 112
    println("$range")
    val temperature: Short = -11245
    println("$temperature")
    println("$score")
    val highestScore: Long = 9999
    println("$highestScore")
    val distance = 999.5
    println("$distance")
    // distance is of type Float
    val distanceF = 19.5F
    println("$distanceF")
    var test: Number = 12.2 //casts to any number type
    println("$test")
    //char
    val letter: Char
    letter = 'k'
    println("$letter")
    //boolean
    val flag = true
    println("$flag")

}