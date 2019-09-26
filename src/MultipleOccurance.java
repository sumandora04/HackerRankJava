import java.util.*;

public class MultipleOccurance {

    public static void get1stOccuranceOfUniqueCharacter(String str){
        char[] array = str.toCharArray();
        ArrayList list = new ArrayList();

        for (int i = 0; i < array.length; i++) {
            int counter =0;
            for (int j = 0; j <array.length ; j++) {
                if (i==j){
                    continue;
                }

                if (array[i]== array[j]){
                    counter++;
                }
            }
            if (counter==0){
                list.add(array[i]);
            }
        }

        System.out.println(list.get(0));
    }


    private static  void getUnique1st(String string){
        String[] arr = string.split("");
        List list = Arrays.asList(arr);
        System.out.println(list);
        List uniqueList = new LinkedList();

        for (String str :
                arr) {
            int count = Collections.frequency(list, str);

            if (count==1){
                uniqueList.add(str);
            }
        }

        System.out.println(uniqueList.get(0));

    }

    public static void main(String[] args) {
        getUnique1st("HelloHi");
     //   MultipleOccurance.get1stOccuranceOfUniqueCharacter("Helloworld");

        //Set:
        System.out.println();
        System.out.println("======================= SET =========================");
        String[] arr = {"z","b","m","d","f","c","d","k","c"};
        List<String> list = Arrays.asList(arr);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>(list);
        System.out.println(linkedHashSet);  //[z, b, m, d, f, c, k]

        HashSet<String> set = new HashSet<String>(list);
        System.out.println(set); //[b, c, d, f, z, k, m]


        SortedSet<String> sortedSet = new TreeSet<>(list);
        System.out.println(sortedSet); //[b, c, d, f, k, m, z]
        System.out.println(sortedSet.first()); //b

        TreeSet<String> treeSet = new TreeSet<>(list);
        System.out.println(treeSet); //[b, c, d, f, k, m, z]
        System.out.println(treeSet.last()); //z

        TreeSet treeSet1 = new TreeSet();
        treeSet1.add(1);
        treeSet1.add(2);

        System.out.println(treeSet1); //[1, 2] --> not heterogenos


        /* Map */
        System.out.println();
        System.out.println("======================= MAP =========================");
        HashMap hashMap = new HashMap();
        hashMap.put(1,"a");
        hashMap.put(2,"g");
        hashMap.put(3,"k");
        hashMap.put(4,"f");

        System.out.println(hashMap); //[1=a, 2=g, 3=k, 4=f]

        HashMap<Integer,String> hashMap1 = new HashMap<Integer, String>(hashMap);
        System.out.println(hashMap1); //[1=a, 2=g, 3=k, 4=f]
        System.out.println(hashMap1.entrySet()); //[1=a, 2=g, 3=k, 4=f]
        System.out.println(hashMap.put(1,"z")); //a --> previous value --> Duplicate value not allowed.
        System.out.println(hashMap1.get(2)); //g
    }
}
