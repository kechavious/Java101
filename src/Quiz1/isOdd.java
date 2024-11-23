package Quiz1;

public class isOdd {

    public static void main(String[] args) {
        int result = 0;
        for(int i = 0; i <= 5; i++) {
            if (isOdd(i) && isPrime(i)) {
                result += i;
                System.out.println(i);
            }
        }
        System.out.println(result);
    }

    public static boolean isOdd(int x) {
        return x % 2 != 0;
    }

    public static boolean isPrime(int x) {
        if (x <= 1) return false;
        if (x == 2) return true;

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}

