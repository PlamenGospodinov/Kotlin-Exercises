fun main(args: Array<String>){
    validateInput("Mike")
    validateInput(null)
}

fun validateInput(name:String?){
    val validated:String = name!!

    println(validated.count())
}