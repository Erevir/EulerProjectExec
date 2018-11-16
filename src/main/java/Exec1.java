public class Exec1 {

    public static void main(String[] args) {

        int n = 1000;
        int a = 3;
        int b = 5;
        int sum = 0;

        for (int i = 3; i < n; i++) {

            if (i % a == 0|| i % b == 0) {
                sum = sum + i;
//            }
//            if (i % b == 0) {
//                sum = sum + i;
            }
        }
            System.out.println(sum);

        }

}
