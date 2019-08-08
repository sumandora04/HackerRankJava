import java.util.*

class SumOfTwoArrays {
    fun findThirdArray(arr1:Array<Int>, arr2:Array<Int>){
        val size = arr1.size
        val arr3 = Array<Int>(size) { i->i*0}

        for (i in 0 until arr1.size){
            arr3[i] = arr1[i]+ arr2[i]
        }

        print(Arrays.toString(arr3))
    }
}

fun main(args:Array<String>){
    val arr1 = arrayOf(1,2,3)
    val arr2 = arrayOf(1,2,3)

    SumOfTwoArrays().findThirdArray(arr1,arr2)
}