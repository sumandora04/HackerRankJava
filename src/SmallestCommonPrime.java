public class SmallestCommonPrime {
    private static int findGcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; (i <= n1) && (i <= n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD is: "+gcd);
        return gcd;
    }



    public static int getTheSmallestCommonPrime(int low, int range, int num1, int num2) {
        int m=-1;
        boolean numberExist = false;
        for (int i = 2; i <= range; i++) {


            int flag = 0;

            // m = (int) Math.sqrt(i);

            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                //System.out.println(i);
                if (num1 % i == 0 && num2 % i == 0) {
                    System.out.println("Number is "+i);
                    m=i;
                    numberExist = true;
                    break;
                }
            }
        }

        if (!numberExist){
            System.out.println("Such number does not exist");
        }

        return m;
    }

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 28;
        int gcd = findGcd(num1, num2);

        System.out.println("Smallest common prime divisor is: "+getTheSmallestCommonPrime(0, gcd, num1, num2));
    }
}

