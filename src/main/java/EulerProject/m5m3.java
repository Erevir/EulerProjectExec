package EulerProject;

public class m5m3 {
    public static void main(String[] args) {
        int n = 1000;
        int a = 3;
        int b = 5;
        int sum5 = 0;
        int sum3 = 0;
        for (int i = 3; i < n; i++) {

            if (i % a == 0) {
                sum3=sum3+i;
                System.out.println("nr "+i+ "  m3" );
                System.out.println("total sum of m3 as:  " +sum3);
            }
            if (i % b == 0) {
                sum5 = sum5 + i;
                System.out.println("nr "+i+ "  m5" );
                System.out.println("total sum of m5 as:  " +sum5);
            }
        }
        int sumTotal = sum3+sum5;
        System.out.println("sumTotal=  " +sumTotal);

    }
}
