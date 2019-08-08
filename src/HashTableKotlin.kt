class HashTableKotlin {

    class HashEntry(var key: String, var value: String) {
        var next: HashEntry? = null
    }

    var INITIAL_SIZE = 10
    var data = arrayOfNulls<HashEntry>(INITIAL_SIZE)

    fun getIndex(key: String):Int{
        val hashCode = key.hashCode()
        val index = (hashCode and 0x7fffffff)% INITIAL_SIZE
        return index
    }

    fun saveData(key: String,value: String){
        val index = getIndex(key)
        println("Index is $index")

        val newEntry = HashEntry(key,value)
        if (data[index]==null){
            //Save in that index:
            data[index] = newEntry
        }else{
            println("Collision...")
            var allEntries = data[index]
            while (allEntries?.next!= null){
                allEntries = allEntries.next
            }

            allEntries?.next = newEntry
        }
    }

    fun getData(key: String):String?{
        val index = getIndex(key)
        var allEntries = data[index]

        if (allEntries!=null){
            while (allEntries?.key.equals(key) && allEntries?.next!=null){
                allEntries = allEntries.next
            }
            return allEntries?.value
        }else{
            return null
        }
    }
}

fun main(args:Array<String>){
    val hashTable = HashTableKotlin()
     hashTable.saveData("Suman","1234569870")
     hashTable.saveData("Suma","1234569870")
     hashTable.saveData("Suan","1234569870")
     hashTable.saveData("Sumn","1234569870")
     hashTable.saveData("Suma4n","1234569870")
     hashTable.saveData("Shekh5ar","7895469870")
     hashTable.saveData("Shekar","7895469870")
     hashTable.saveData("Shkhar","7895469870")
     hashTable.saveData("Shehar","7895469870")
     hashTable.saveData("Shekha","7895469870")

    println(hashTable.getData("Suman"))
    println(hashTable.getData("Shekha"))
}