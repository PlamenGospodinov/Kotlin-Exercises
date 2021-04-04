abstract class PersonAb(name:String){
    init{
        println("My name is $name")
    }

    fun displaySSN(ssn: Int){
        println("My SSN is $ssn")
    }

    abstract fun displayJob(description: String)
}

class Teacher(name: String) : PersonAb(name){
    override fun displayJob(description: String) {
        println(description)
    }
}

fun main(args: Array<String>){
    val jack = Teacher("Jack Smith")
    jack.displayJob("I am a physics teacher.")
    jack.displaySSN(23123)
}