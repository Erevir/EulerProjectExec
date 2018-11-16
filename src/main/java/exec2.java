import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exec2 {

    public static void main(String[] args) {

        int[] fibo = new int[4];
        fibo[0] = 1;
        fibo[1] = 2;
        fibo[2] = 3; //fibo[0] + fibo[1];
        fibo[3] = 0; //fibo n -3

        while (fibo[2] <= 4000000) {
            fibo[3] = fibo[0];
            fibo[0] = fibo[1];
            fibo[1] = fibo[2];
            fibo[2] = fibo[0] + fibo[1];

        }

        System.out.println("Fibonaci n-2=  " + fibo[3]);
        System.out.println("Fibonaci n-1=  " + fibo[0]);
        int rezFibo = fibo[3] + fibo[0];
        System.out.println("Fibonaci n=  " + rezFibo);

        System.out.println("Next Fibonaci   " + fibo[2]);

    }
}





