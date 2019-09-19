public class PrimeNumbers {

    public static String checkForPrime(int number) {
        String result = "";
        int m = (int) Math.sqrt(number);
        int flag = 0;
        if (number == 0 || number == 1) {
            // result = number+" is not prime.";
            flag = 1;
        } else {
            for (int k = 2; k < m; k++) {
                if (number % k == 0) {
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 0) {
            result = number + " is prime.";
        } else {
            result = number + " is not prime.";
        }

        return result;
    }

    public static void getRangeOfPrimeNumbers(int low, int range) {
        int m;
        for (int i = low; i < range; i++) {

            if (i == 0 || i == 1) {
                continue;
            }

            int flag = 0;

           // m = (int) Math.sqrt(i);

            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(i);
            }
        }

        /*while (low < range) {
            int flag = 0;
            for (int i = 2; i <= m; i++) {
             //   System.out.println("Inside for: "+i);
                if (low % i == 0){
                    flag =1;
                    break;
                }
            }

            if (flag==0){
                System.out.println(low);
            }

            low++;
        }*/
    }

    public static void main(String[] args) {
        //  System.out.println(PrimeNumbers.checkForPrime(7));

        PrimeNumbers.getRangeOfPrimeNumbers(0, 20);
    }
}
