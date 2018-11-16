package EulerProject;

public class exec31 {

    public static void main(String... args) {

        long num = 150000; // 600851475143//13195

        for (long y = num/2 + 1; y > 1; y--) {

            if (num % y == 0) {

                if (isPrime(y)) {
                    System.out.println("Largest prime factor of the number: " + "[ " + num + " ]" + " is " + y);

                    break;
                }

            }

        }

    }

    private static boolean isPrime(long n) {
        if (n <= 1)             return false;
        if (n <= 3)             return true;

        if (n % 2 == 0 || n % 3 == 0)             return false;

        for (int i = 5; i * i <= n; i = i + 6) {

            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }



//    private static boolean isPrime(long n) {
//        double limit = Math.sqrt(n);
//        for (int i = 2; i <= limit; i++) {
//            if (n % i == 0)
//                return false;
//        }
//        return true;
//    }
}