

import java.util.*;

public class Collection implements Comparable {


    @Override
    public int compareTo(Object o) {
        return 1;
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(19);
        list.add(5);
        list.add(2);

        //   System.out.println(list);

        int[] num = {1, 2, 3, 4, 5};

        List aList = new ArrayList<>();
        aList = Arrays.asList(Arrays.toString(num));
        List bList = Collections.singletonList(Arrays.toString(num));

        System.out.println(aList);

        Iterator itr = bList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
