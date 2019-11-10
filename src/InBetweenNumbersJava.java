public class InBetweenNumbersJava {

    private static void findRange(int n1, int n2){
        while (n1<=n2){
            System.out.print(n1+" ");
            n1++;
        }
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        findRange(a,b);
    }
}
