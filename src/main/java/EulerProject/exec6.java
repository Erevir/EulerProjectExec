package EulerProject;

public class exec6 {

    public static void main(String[] args) {
        int n = 100;
        int sumSquares = 0;
        int sumSum2 = 0;
        int Diff = 0;

        for (int i = 1; i <= n; i++) {
            int s2 = i * i;
            sumSquares = sumSquares + s2;
            sumSum2 = sumSum2 + i;
        }

        Diff = sumSum2 * sumSum2 - sumSquares;
        System.out.println("Difference between the sum of the squares of the first one hundred natural numbers and the square of the sum = " + Diff);

    }
}
