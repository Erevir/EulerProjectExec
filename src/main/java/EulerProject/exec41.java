package EulerProject;

public class exec41 {

    public static void main(String[] args) {

        int max = 0;

        for (int i = 999; i >= 100; i--) {

            for (int j = 999; j >= 100; j--) {

                int n = i * j;
                int init = n;
                int inv = 0;

                while (n != 0) {
                    inv = inv * 10 + n % 10;
                    n = n / 10;
//                    System.out.println(inv);
                }

                if (init == inv) {
                    if (inv > max) {
                        max = inv;

                        System.out.println("i= " + i + "  j= " + j);
                        System.out.println("Nr " + max + " is palindrome");
                    }

                }

            }

        }

    }


}

