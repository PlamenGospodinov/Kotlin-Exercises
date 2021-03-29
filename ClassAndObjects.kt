class Lamp{
    private var isOn: Boolean = false;
    fun turnOn(){
        isOn = true;
    }

    fun turnOff(){
        isOn = false;
    }

    fun displayLightStatus(lamp: String) {
        if (isOn == true)
            println("$lamp lamp is on.")
        else
            println("$lamp lamp is off.")
    }
}

fun main(args: Array<String>) {
    var l1 = Lamp()
    var l2 = Lamp()
    l1.turnOn()

    l1.displayLightStatus("l1")
    l2.displayLightStatus("l2")
}