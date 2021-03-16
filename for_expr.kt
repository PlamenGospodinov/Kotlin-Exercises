fun main(args: Array<String>) {
    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)

    println()

    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             // prints nothing

    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)

    println()

    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)

    println()

    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)

    var language = arrayOf("Ruby", "Koltin", "Python", "Java")

    for (item in language)
        println(item)

    var text= "Kotlin"

    for (item in text.indices) {
        println(text[item])
    }

    var text1= "Kotlin"

    for (letter in text1) {
        println(letter)
    }
}