fun main(args: Array<String>){
    val p = Personn()
    p.name = "Jack"
    println("${p.name}")
    val Maria = Girl()
    Maria.actualAge = 15
    Maria.age = 15
    println("Maria: Actual age = ${Maria.actualAge}")
    println("Maria: Pretended age = ${Maria.age}")

    val Marina = Girl()
    Marina.actualAge = 35
    Marina.age = 35
    println("Marina: Actual age = ${Marina.actualAge}")
    println("Marina: Pretended age = ${Marina.age}")
}

class Personn{
    var name: String = "defaultValue"

    get() = field

    set(value){
        field = value
    }
}

class Girl{
    var age: Int = 0
    get() = field
    set(value){
        field = if(value < 18)
            18
        else if(value >= 18 && value <= 30)
            value
        else
            value-3
    }
    var actualAge: Int = 0
}