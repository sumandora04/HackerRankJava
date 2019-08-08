class InBetweenNumbers {
    fun findRangeAndPrint(a:Int, b:Int){

        for (i in a.rangeTo(b)){
            print("$i ")
        }
    }
}

fun main(args:Array<String>){
    val x = InBetweenNumbers()
    x.findRangeAndPrint(5,10)
}