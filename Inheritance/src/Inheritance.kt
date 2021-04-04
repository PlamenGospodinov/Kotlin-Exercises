open class Person(age: Int,name:String){
    init{
        println("My name is $name.")
        println("My age is $age.")
    }
}

class MathTeacher(age: Int,name:String) : Person(age,name){
    fun teachMaths(){
        println("I teach in a primary school.")
    }
}

class Footballer(age: Int,name: String) : Person(age,name){
    fun playFootball(){
        println("I play in LA Galaxy")
    }
}

open class Log{
    var data: String = ""
    var numberOfData = 0
    constructor(_data: String){

    }

    constructor(_data: String, _numberOfData: Int){
        data = _data
        numberOfData = _numberOfData
        println("$data: $numberOfData times")
    }
}

class AuthLog : Log{
    constructor(_data: String) : this("From AuthLog -> $_data", 10){

    }

    constructor(_data: String,_numberOfData: Int) : super(_data,_numberOfData){

    }
}

fun main(args: Array<String>){
    val t1 = MathTeacher(25,"Jack")
    t1.teachMaths()

    println()

    val f1 = Footballer(29,"Cristiano")
    f1.playFootball()

    println()

    val p1 = AuthLog("Bad Password")
}