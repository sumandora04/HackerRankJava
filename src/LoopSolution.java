import java.util.Arrays;
import java.util.Scanner;

public class LoopSolution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int[] array = new int[n];
            int tempSum = a;

            for (int j = 0; j < n; j++) {
                tempSum = tempSum + ((int) Math.pow(2, j) * b);
                array[j] = tempSum;
            }

            int m = 0;
            do {
                System.out.print(array[m] + " ");
                m++;
            }
            while (m != n);

            System.out.println();

        }
        in.close();
    }
}
