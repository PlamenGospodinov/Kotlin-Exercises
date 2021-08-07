fun main(args:Array<String>){

}

class StudentTwo(val name:String)

class SomeActivity{
    private var student:StudentTwo? = null

    fun onCreate(){
        student = StudentTwo("Mike")
    }

    fun onResume(){
        val nameOne:String = student!!.name

        val nameTwo:String? = student?.name
    }
}

class AnotherActivity{
    private lateinit var student:StudentTwo
    fun onCreate(){
        student = StudentTwo("Mike")
    }

    fun onResume(){
        val nameLString = student.name
    }
}
