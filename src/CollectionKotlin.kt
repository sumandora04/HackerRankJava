fun main(args: Array<String>) {
    val list = listOf<Int>(1, 2, 23, 4, 55)
    println(list)
    for (element in list) {
        print(element)
    }

    println()
    for (index in 0 until list.size - 1) {
        print(list[index])
    }

    println()
    for (index in list.indices) {
        print(list.get(index))
    }

    println()

    // list.[1] = 20 // error -> Immutable


    var mutableList = mutableListOf<Int>()// mutableListOf<Int>(1,3,4,57,6)//
    val arrayList = ArrayList<Int>(list)
    arrayList.add(45)
    println(arrayList)
    val arrayList1 = arrayListOf(list)
    //arrayList1.add(24)//Error.. need list.. because the arrayList1 takes List<Int>
    println(arrayList1)

    val smallNumber = arrayList.filter { num -> num < 6 }
    println("Small numbers: $smallNumber")

    val squareNumber = arrayList.map { num -> num * num }
    println("Square numbers: $squareNumber")
    val smallSquare = arrayList.filter { num -> num < 10 }.map { num -> num * num }

    val applyFun = arrayList.filter { it < 10 }.map { it * it }
    println("Small numbers square: $smallSquare")
    println("Small numbers square: $applyFun")

    val predicate = { num: Int -> num > 10 }
    val check = arrayList.all { it > 10 }
    println("All:$check")

    val check1 = arrayList.any { it > 10 }
    println("Any:$check1")
    val check2 = arrayList.count { it > 10 }
    println("Count:$check2")
    val check3 = arrayList.find { it > 10 }
    println("Find:$check3")
    
}