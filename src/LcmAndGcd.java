public class LcmAndGcd {
    private static int findLcm(int n1, int n2){
        int lcm = n1>n2 ? n1:n2;

        while (true){
            if (lcm%n1==0 && lcm%n2==0){
                break;
            }
            lcm++;
        }
        return lcm;
    }

    private static int findGcd(int n1, int n2){
        int gcd = 1;
        for (int i = 1; (i <= n1) && (i <= n2); i++) {
            if (n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(LcmAndGcd.findLcm(3,6));
        System.out.println(LcmAndGcd.findGcd(48,8));
    }
}
