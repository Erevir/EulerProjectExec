package EulerProject;

public class MaxDigitNr {

    public static void main(String... args) {
        int n = 2387246;
        int max = 0;
        while (n != 0) {
            int c = n % 10;
            System.out.println(c);
            if (c > max) {
                max = c;
            }
            n=n/10;
        }
        System.out.println("MaxDigit_Of_Nr="+max);
    }

}
