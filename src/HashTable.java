public class HashTable {

    public class HashEntry {
        String key;
        String value;
        HashEntry next;

        public HashEntry(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private int INITIAL_SIZE = 16;
    private HashEntry[] data;

    public HashTable() {
        this.data = new HashEntry[INITIAL_SIZE];
    }

    // Create index:

    private int getIndex(String key){
        int hashCode = key.hashCode();

        int index = (hashCode & 0x7fffffff) % INITIAL_SIZE;

        return index;
    }

    //Store data into hash table:
    private void saveData(String key, String value){
        int index = getIndex(key);

        //Create a new entry:
        HashEntry newEntry = new HashEntry(key,value);

        //There is no index in data -- no collision:
        if (data[index]==null){
            data[index] = newEntry; // Saving the new entry at that index
        }else {
            //This index already exist -- Collision:
            //Do chaining to avoid the collision
            //Get all the entries at that index:
            //Walk through the list and add the new one to the end of the list:
             HashEntry allEntries = data[index];

             while (allEntries.next!=null){//List end is not reached:
                 allEntries = allEntries.next;// Go to next
             }
             //End reached:
            allEntries.next = newEntry;

        }
    }


    private String getData(String key){
        int index = getIndex(key);
        //Get all entries at that index:
        HashEntry allEntries = data[index];
        //If entries are not empty:
        if (allEntries!=null){

            while (!allEntries.key.equals(key)&& allEntries.next!=null){
                allEntries = allEntries.next;
            }

            return allEntries.value;
        }else {
           return null;
        }
    }


    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.saveData("Suman","1234567890");
        hashTable.saveData("Shekhar","3334567890");

        System.out.println(hashTable.getData("Suman"));
        System.out.println(hashTable.getData("Shekhar"));
    }
}
