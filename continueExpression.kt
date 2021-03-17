fun main(args: Array<String>) {
 for (i in 1..5) {
    println("$i Always printed.")
    if (i > 1 && i < 5) {
        continue
    }
    println("$i Not always printed.")
 }

    var number: Int
    var sum = 0

    for (i in 1..6) {
        print("Enter an integer: ")
        number = readLine()!!.toInt()

        if (number <= 0)
            continue

        sum += number
    }
    println("sum = $sum")

    here@ for (i in 1..5) {
        for (j in 1..4) {
            if (i == 3 || j == 2)
                continue@here
            println("i = $i; j = $j")
        }
    }
}