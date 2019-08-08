import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet

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

    val myList = mutableListOf<String>()
    myList.add("Two")
    //myList.removeAt(0)

    print("$myList ")


    val arrList = arrayListOf<Int>()
    arrList.add(45)
    arrList.add(4105)
    arrList.add(4104)
    arrList.add(4104)

    print("$arrList ")

    var uniqueHashSet = hashSetOf<Int>()
    uniqueHashSet.addAll(arrList)
    println()
    println("Unique $uniqueHashSet")

    var map = HashMap<Int,Int>()
    map.put(1,4152)
    map.put(2,4152)
    map.put(4,412)

    val arrayToArrayList = Arrays.asList(*arr1)
    println(arrayToArrayList)

    println(map.replace(2,45123))

    println("Map: ${map.values}")

    SumOfTwoArrays().findThirdArray(arr1,arr2)



    println("Filter and Map:")
    var numbers = arrayListOf<Int>(2,3,4,5,6,7,8,9)

    var smallNum = numbers.filter {
        it<7
    }
    println(smallNum)

    val square = numbers.map {
        it*it
    }

    println(square)

    println("small square: ${numbers.filter { it<7 }
            .map { it*it }}")
}