open class Personn(){
    open fun displayAge(age:Int){
        println("My age is $age")
    }
}

class Girl : Personn(){
    override fun displayAge(age: Int) {
        super.displayAge(age)
        println("My fake age is ${age-5}")
    }
}

fun main(args: Array<String>){
    val girl = Girl()
    girl.displayAge(35)
}