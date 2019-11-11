import java.util.*

fun main(args: Array<String>) {
    println("Size of array")
    // val input = Scanner(System.`in`)
    // val size = input.nextInt()

    val input = readLine()
    val size = input?.toInt() ?: 0

    val array = arrayOfNulls<Int>(size)

    println("Input array elements:")

    for (i in 0 until size) {
        val elements = readLine()
        array[i] = elements?.toInt() ?: 0

        //array[i] = input.nextInt()
    }

    println(Arrays.toString(array))

    reverseArray(array)
}

fun reverseArray(array: Array<Int?>) {
    val size = array.size
    val range = size - 1 downTo 0
    for (i in range) {
        print("${array[i]} ")
    }
}