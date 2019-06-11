import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       /* for (int i = 1; sc.hasNext(); i++) {
            String str = sc.nextLine();
            System.out.println(i+" "+str);
        }*/

        int i = 0;
        while (sc.hasNext()){
            System.out.println((i+1)+" "+sc.nextLine());
            i++;
        }
    }
}
