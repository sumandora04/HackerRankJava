import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet
import kotlin.collections.LinkedHashMap

/* Check the String rotation:*/
fun checkStringRotation(originalString: String, rotationCheckString: String): Boolean {
    if (originalString.length != rotationCheckString.length)
        return false

    val concatenatedString: String = originalString.plus(originalString)
    println(concatenatedString)

    return concatenatedString.indexOf(rotationCheckString) != -1
}

/* Occurrence of a character in a string: */
fun characterOccurrenceInAStringUsingMap(string: String, charToSearch: Char): Int? {
    val hashMap: HashMap<Char, Int> = HashMap()
    val charArray = string.toCharArray()

    for (character in charArray) {
        //If the hashmap has the key, update the number of occurrence
        if (hashMap.containsKey(character)) {
            val value = hashMap.get(character)
            value?.let {
                hashMap.put(character, it + 1)
            }

        }
        //The hash map has no such key. input a new key value.
        else {
            hashMap.put(character, 1)
        }
    }

    println(hashMap)

    return hashMap.get(charToSearch)
}


/* Check the sub string occurrence in the main string: */
fun checkSubStringOccurrenceRecursive(mainString: String, subString: String): Int? {
    val mainSize = mainString.length
    val subSize = subString.length

    if (mainSize == 0 || mainSize < subSize) {
        return 0
    }

    return if (mainString.substring(0, subSize).equals(subString)) { // Checking if the first substring matches
        checkSubStringOccurrenceRecursive(mainString.substring(subSize - 1), subString)?.plus(1)
    } else { // Otherwise, return the count from the remaining index
        checkSubStringOccurrenceRecursive(mainString.substring(subSize - 1), subString)
    }
}

/* Get the First Non-Repeated-Char: */
fun getFirstNonRepeatedChar(string: String): Char? {
    /*
    * Step 1: get character array and loop through it to build a hash table with char and their count.
    * Step 2: loop through LinkedHashMap to find an entry with value 1, that's your first non-repeated character,
    * as LinkedHashMap maintains insertion order.
    * */

    var linkedHashMap: LinkedHashMap<Char, Int> = LinkedHashMap()
    for (char in string.toCharArray()) {
        if (linkedHashMap.containsKey(char)) {
            val value = linkedHashMap.get(char)
            value?.let {
                linkedHashMap.put(char, it + 1)
            }
        } else {
            linkedHashMap.put(char, 1)
        }
    }

    for (entry in linkedHashMap) {
        if (entry.value == 1) {
            return entry.key
        }
    }
    throw RuntimeException("No non-repeated character")
}


/* * Finds first non repeated character in a String in just one pass.
* It uses two storage to cut down one iteration, standard space vs time
* trade-off.Since we store repeated and non-repeated character separately,
* at the end of iteration, first element from List is our first non repeated character from String.
* */

fun getFirstNonRepeatingCharacterInSingleLoop(word: String): Char? {
    var repeatingCharacterHashSet = HashSet<Char>()
    var nonRepeatingList = ArrayList<Char>()
    for (char in word.toCharArray()) {
        if (repeatingCharacterHashSet.contains(char)) {
            continue
        }

        if (nonRepeatingList.contains(char)) {
            nonRepeatingList.remove(char)
            repeatingCharacterHashSet.add(char)
        } else {
            nonRepeatingList.add(char)
        }
    }
    return nonRepeatingList[0]
}


fun getFirstNonRepeatingCharacterUsingLinkedHashMap(word: String): Char? {
    val characterMap = LinkedHashMap<Char, Int>()
    for (char in word.toCharArray()) {
        if (characterMap.containsKey(char)) {
            val value = characterMap.get(char)
            value?.let {
                characterMap.put(char, it + 1)
            }
        } else {
            characterMap.put(char, 1)
        }
    }
    for (item in characterMap) {
        if (item.value == 1) {
            return item.key
        }
    }
    throw RuntimeException("No Repeating character")
}

fun reverseAStringRecursively(string: String): String {
    if (string.length < 2) {
        return string
    }

    return reverseAStringRecursively(string.substring(1)) + string[0]
}

fun reverseStringWithLoop(word: String): String {
    var string: String = ""

    for (sub in word.length - 1 downTo 0) {
        string += word[sub]
    }
    return string

    /*var stack = Stack<Char>()
    for (sub in word) {
        stack.push(sub)
    }
    var rev = ""
    for (item in 0 until stack.size) {
        rev = rev + stack.pop()
    }
    return rev*/
}

fun checkLambdaUse(a: Int, b: Int, lambda: (Int) -> Unit) {
    val sum = a + b
    lambda(sum)
}

fun checkLambda2(a: Int, b: Int, lambda: (Int, Int) -> Int) {
    val result = lambda(a, b)
    println(result)
}

fun checkClosure(a: Int, b: Int, lambda: (Int, Int) -> Unit) {
    lambda(a, b)
}

fun reverseStringLambda(string: String, lambda: (String) -> String) {
    println(lambda(string))
}

fun reverse2(string: String, lambda: (String) -> Unit) {
    lambda(string)
}

fun main(args: Array<String>) {
    // println("Hello")
//    println(checkStringRotation("India Vs England ","England India Vs "))

//    println(characterOccurrenceInAStringUsingMap("malayalam", 'm'))

//    println(checkSubStringOccurrenceRecursive("geeksforgeeks","geek"))

//    println(getFirstNonRepeatedChar("Hey Hello Bye Challo"))
//    println(getFirstNonRepeatingCharacterInSingleLoop("Hey Hello Bye Challo"))
//    println(getFirstNonRepeatingCharacterUsingLinkedHashMap("Hey Hello Bye Challo"))

//    println(reverseAStringRecursively("...hello..."))
//    println(reverseStringWithLoop("...hello..."))

    /* val myLambda = { s: Int -> println(s) }

     checkLambdaUse(2, 3, myLambda)
     checkLambdaUse(4, 6, { s: Int -> println(s) })

     checkLambdaUse(7, 8) { s: Int -> println(s) }

     var myLambda2: (Int, Int) -> Int = { x, y -> x + y }
     checkLambda2(10, 11, myLambda2)
     checkLambda2(2, 22) { x, y -> x + y }
     checkLambda2(12, 8, { x, y -> x + y })
     */

    /*  var result: Int = 0
      checkClosure(33, 11) { x, y ->
          result = x + y
      }
      println(result)

      reverseStringLambda("Hello") { str ->
          str.reversed()
          //  println(it.reversed())
      }


      reverse2("Mango") {
          println(it.reversed())
      }*/

    /*val person = Person()
    person.name = "ABC"
    person.age = 23

    person.startRunning()

    with(person){
        this.name = "XYZ"
        age =33
    }
    person.startRunning()

    person.apply {
        name = "MNOP"
        age = 25
    }.startRunning()
    */


    val array = arrayOfNulls<Int>(5)
    for (i in array.indices) {
        array[i] = i * 1
    }
    println(Arrays.toString(array))

    val array1 = Array(10) { i -> i * 2 }
    println("Array1: ${Arrays.toString(array1.reversedArray())}")


    val peopleList = listOf<Person>(Person("Suman",25),Person("Anjali",24),Person("Pooja",25))
    val name = peopleList.filter { it.name.startsWith("A") }.map { it.name.toUpperCase() }
    println(name)
    val ageComparision = peopleList.filter { it.age>24 }.map { it.name.toUpperCase() }
    println(ageComparision)
}


class Person(var name: String = "",
             var age: Int = -1) {

    fun startRunning() {
        println("$name is running")
    }
}