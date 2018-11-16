package EulerProject;

public class exec4 {
    public static void main(String[] args) {

        boolean isntFound = true;

        for (int i = 999; i >= 900; i--) {
            if(isntFound){
            for (int j = 999; j >= 900; j--) {

                int n = i * j;
                int init = n;
                int inv = 0;

                while (n != 0) {
                    inv = inv * 10 + n % 10;
                    n = n / 10;
//                    System.out.println(inv);
                }
                if (init == inv) {
                    isntFound = false;
                    System.out.println("i= "+i+"  j= "+j);
                    System.out.println("Nr " + init + " is palindrome");
                }
            }
            }
        }


    }
}



