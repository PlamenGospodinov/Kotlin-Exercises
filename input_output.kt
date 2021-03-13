import java.util.Scanner

fun main(args: Array<String>){
    //creates an istant which takes input from standart input(keyboard)
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    //nextInt() reads the next integer from the keyboard
    var integer: Int = reader.nextInt()

    println("You entered $integer")
}