import java.util.Arrays;

public class Segregate0And1 {

    private static int[] segregationProcess(int[] array){
        int size = array.length;

        int indexL = 0;
        int indexR = size-1;

        while (indexL<indexR){
            while (array[indexL]==0 && indexL<indexR){
                indexL++;
            }

            while (array[indexR]==1 && indexL<indexR){
                indexR--;
            }

            if (indexL<indexR){
                int temp = array[indexL];
                array[indexL] = array[indexR];
                array[indexR] = temp;

                indexL++;
                indexR--;
            }
        }

        return array;
    }


    public static void main(String[] args) {
        int[] array ={1,0,1,0,1,0,1,0,1,1,0,0};
        int[] arraySorted = Segregate0And1.segregationProcess(array);

        System.out.println(Arrays.toString(arraySorted));
    }
}
