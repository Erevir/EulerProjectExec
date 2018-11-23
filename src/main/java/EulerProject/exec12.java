package EulerProject;

public class exec12 {

    public static void main(String[] args) {
        int countDivisors = 0;
        int count =0;
        int sum = 0;
        int i = 1;

        while (!(count == 501)) {

            sum = sum + i;
            System.out.println("suma de i + " + i + " = " + sum);

            count = 0;
            for (int j = 1; j <= sum; j++) {

                if (sum % j == 0) {
                    count = count + 1;
                    System.out.println("divisor " + sum + "= " + j + " total divizor = " + count);
                }

            }
//

            i++;

        }
    }


}
