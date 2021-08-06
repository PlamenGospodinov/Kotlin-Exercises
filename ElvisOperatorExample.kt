import java.lang.IllegalArgumentException

fun main(Args:Array<String>){

}

fun processName(name:String?) : String{
    val processedName:String = name?:"empty"
    return processedName
}

fun stringLength(input:String?) = input?.length?:0

fun validateName(name:String?) : String{
    return name ?: throw IllegalArgumentException("Name must not be null")
}