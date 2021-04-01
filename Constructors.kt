fun main(args: Array<String>) {
    println("person1 is instantiated")
    val person1 = Person("joe", 25)

    println("person2 is instantiated")
    val person2 = Person("Jack")

    println("person3 is instantiated")
    val person3 = Person()
}

class Person(fName: String = "Unknown", personAge: Int = 20) {
    val firstName: String
    var age: Int

    // initializer block
    init {
        firstName = fName.capitalize()
        age = personAge

        println("First Name = $firstName")
        println("Age = $age")
    }
}