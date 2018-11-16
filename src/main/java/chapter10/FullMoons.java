package chapter10;
import static java.lang.System.out;
import java.util.*;
import java.io.*;

public class FullMoons {

    static int DAY_IM = 1000*60 * 60 * 24;

        public static void main(String [] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2004,0,7,15,40);
        long day1 = calendar.getTimeInMillis();

        for (int x = 0; x < 12; x++) {   //12 mounth
            day1 += (DAY_IM * 29.52);
            calendar.setTimeInMillis(day1);
            out.println(String.format("full moon on %tc", calendar));
        }

}
}
