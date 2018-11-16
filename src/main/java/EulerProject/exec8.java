package EulerProject;

public class exec8 {
    public static void main(String[] args) {


        String elements = "123456789";
        int pas = 3;

//        int count = 9;
//        int nrDigitOfNum = count;
        int nrDigitOfPair = 2;
        int digiComparator = (int) Math.pow(10, nrDigitOfPair - 1);
//        long pair;
        long maxProdus=0;
        long produs;

        for (int j = 0; j < 2; j++) {
            for (int i = j; i < elements.length() - 1; i += pas) {
                String element1 = elements.substring(i, i + pas);
                Long x = Long.parseLong(element1);
//                System.out.println("x="+x);
                produs=1;
                while (!(x ==0)) {
                    produs = produs * (x % 10);
                    x = x / 10;
//                  System.out.println("produs= "+ produs);
//                    System.out.println("pair= "+pair);
                }

                if (produs > maxProdus) {
                    maxProdus = produs;
//                    System.out.println("maxProdus= "+maxProdus);
                }



            }
        }
        System.out.println("maxProdus= "+maxProdus);

    }
}
