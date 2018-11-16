package EulerProject;

public class exec5 {

    // 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    //What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    public static void main(String[] args) {

        int n = 20;
        int numD = n;
        int count = 0;

        while (!(count == n)) {
            count=0;
            for (int j = 1; j <= n; j++) {

                if (numD % j == 0) {
                    count++;
//                    System.out.println(count);
                    if (count == n) {
                        System.out.println("The smallest  number that is evenly divisible by all of the numbers from 1 to " + n + " = " + numD);
                        break;
                    }
                }

            }
            numD++;

        }
    }
}

