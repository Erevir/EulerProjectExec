package chapter10;

import java.util.Calendar;

public class TestBox {
    Integer i;
    int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go() {
       Integer  j= i;//compare two objects
//       i=j;// compare to primitives
//        j=i; // Exception in thread "main" java.lang.NullPointerException
        Calendar calendar=Calendar.getInstance();
        double d = 42.5;
        String doubleString = Double.toString(d);
        System.out.println(j);
        System.out.println(i);
        System.out.println(doubleString);
        System.out.println(calendar.getTimeZone());

    }
}

