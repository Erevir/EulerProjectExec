package chapter11;

public class ExTestDrive {
    public static void main(String[] args) {
        String test = args[0];


        try {
            System.out.print("t");
            doRiskys(test);
            System.out.println("o");

        } catch (MyEx e) {
            System.out.println("a");

        } finally {
            System.out.println("w");
        }
        System.out.println("s");}

        static void doRiskys (String t) throws MyEx {
            System.out.print("h");
            if ("yes".equals(t)) {
                throw new MyEx();
            }
            System.out.println("r");


    }


}

