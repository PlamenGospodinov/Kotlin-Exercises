fun main(args: Array<String>) {
    val a = 12
    val b = 5

    println("Enter operator-either +,-,*, or /")
    val operator = readLine()

    val result = when(operator){
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator is invalid operator"
    }

    println("The result is: $result")

    //the next one is more detailed one
    val g = 15
    val k = 9

    println("Enter operator-either +,-,*, or /")
    val operator2 = readLine()

    when(operator2){
        "+" -> println("$g + $k = ${g+k}")
        "-" -> println("$g - $k = ${g-k}")
        "*" -> println("$g * $k = ${g*k}")
        "/" -> println("$g / $k = ${g/k}")
        else -> "$operator2 is invalid operator"
    }

    //few possibilities
    val n = -1
    when(n){
        1,2,3 -> println("n is positive number less than 4")
        0 -> println("n is zero")
        -1,-2 -> println("n is a negative number greater than -3")
    }

    //check value in range
    val t = 100
    when(a){
        in 1..10 -> println("A positive number less than 11")
        in 10..100 -> println("A positive number between 10 and 100(inclusive)")
    }

    //value type check
    print("Enter your string here: ")
    val x = readLine()
    when(x){
        is String -> println(x.length + 1)
    }
}