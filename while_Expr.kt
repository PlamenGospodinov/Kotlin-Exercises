fun main(args: Array<String>) {
    var sum1 = 0
    var i1 = 100

    while (i1 != 0) {
        sum1 += i1     // sum = sum + i;
        --i1
    }
    println("sum = $sum1")

    var sum: Int = 0
    var input: String

    do {
        print("Enter an integer: ")
        input = readLine()!!
        sum += input.toInt()

    } while (input != "0")

    println("sum = $sum")
}