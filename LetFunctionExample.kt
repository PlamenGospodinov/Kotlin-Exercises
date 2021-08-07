fun main(args: Array<String>){
    val data:String? = "Important data"
    if(data != null){
        processData(data)
    }

    data?.let{processData(it)}

    val moreData:String? = null
    moreData?.let{processData(it)}
}

fun processData(data:String){
    println("Processing $data")
}