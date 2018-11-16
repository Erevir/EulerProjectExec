package EulerProject;

public class exec3 {
    public static void main(String... args) {

        long n = 25000; // 600851475143

        for (long y = n; y > 1; y--) {
            if (n % y == 0) {
//                boolean isntFound = true;

                for(int i=2; i<=n; i++){
                    boolean isPrime = true;
                    for(int j=2; j<i-1;j++){
                        if(i%j==0) {
                            isPrime = false;
                        }
                    }
                    if(isPrime) {
                        System.out.println("Largest prime factor of the number: " + "[ " + n + " ]" + " is " + i);;
                    }
                }

//                for (long i = n; i >= 2; i--){
////                    if (isntFound) {
//                        boolean isPrime = true;
//
//                        for (int j = 2; j < i - 1; j++) {
//                            if (i % j == 0) {
//                                isPrime = false;
//                            }
//                        }
//
//                            if (isPrime) {
//                                System.out.println("Largest prime factor of the number: " + "[ " + n + " ]" + " is " + i);
////                                isntFound = false;
//                            }
//
//
////                    }
//                }
            }
        }
    }



}



