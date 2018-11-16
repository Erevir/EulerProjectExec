package EulerProject;

public class exec7 {
    //10 001st prime number?

    public static void main(String[] args) {
        int nst = 10001;
        int count = 0;
        int primeNr;
        int num = 0;

        while (!(count == nst)) {
            num = num + 1;

            if (isPrime(num)) {
                count++;
//                System.out.println(num);
//                System.out.println(count);
            }


        }

        primeNr = num;
        System.out.println(nst + "st prime number is: " + primeNr);
    }


    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6) {

            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}



//        double limit = Math.sqrt(n);
//        for (int i = 2; i <= limit; i++) {
//            if (n % i == 0)
//                return false;
//        }
//        return true;

