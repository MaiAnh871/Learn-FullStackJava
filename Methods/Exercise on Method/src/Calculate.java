public class Calculate {
    public static Boolean isPrime(int par) {
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= par / 2; i++) {
            temp = par % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static Boolean isPrime(double par) {
        return false;
    }
}
