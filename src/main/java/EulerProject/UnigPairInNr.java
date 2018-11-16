package EulerProject;

import com.sun.deploy.util.StringUtils;

public class UnigPairInNr {
    public static void main(String...args) {
//        String numberInit = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";


//        String lastChar = myString.substring(myString.length() - 1);
//        StringUtils.substring("abc", 0, 4) = "abc"
//        String s ="abc";
//        ArrayList<String> wordList = new ArrayList<String>();
//        wordList.add("foo");
//
//
//        // Create a regex to match the banned words.... in this case it will be "foo|carrots|parrots", case insensitive
//        String regex = Arrays.toString(wordList.toArray());
//        regex = regex.substring(1, regex.length()-1).replaceAll(", ", "|");
//        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
//        System.out.println("Regex: " + p);

//
//}
//        Long x=Long.parseLong(str1.replace(",|\\[|\\]",""));

        String elements = "123456789";
        int pas=2;
        for(int j =0; j <2;j++) {
            for (int i = j; i < elements.length() - 1; i += pas) {
                String element1 = elements.substring(i, i + 2);
                Long x=Long.parseLong(element1);

                System.out.println("a= " + x);
            }
        }



        int n = 123456789;
        int count = 9;
        int nrDigitOfNum = count;
        int nrDigitOfPair = 2;
        int digiComparator = (int) Math.pow(10, nrDigitOfPair - 1);
        int pair;
        int maxProdus=0;
        int produs = 1;



        for (int i = 0; i < count - nrDigitOfPair; i++) {

            int init = n;
            init=(int) (n / Math.pow(10, i));
//            System.out.println(init);

            while (!(init < digiComparator)) {
                pair = (int) (init % Math.pow(10, nrDigitOfPair));
                init = (int) (init / Math.pow(10, nrDigitOfPair));
                System.out.println(pair);
                produs = 1;
                while (!(pair ==0)) {
                    produs = produs * (pair % 10);
                    pair = pair / 10;
//                  System.out.println("produs= "+ produs);
//                    System.out.println("pair= "+pair);
                }

                if (produs > maxProdus) {
                    maxProdus = produs;
                    System.out.println("maxProdus= "+maxProdus);
                }

            }


        }
    }




    public static int getPair(long n, int digiComparator, int nrDigitOfPair){

        int pair=0;
        while (!(n < digiComparator)) {
            pair = (int) (n % Math.pow(10, nrDigitOfPair));
            n = (int) (n / Math.pow(10, nrDigitOfPair));
//

        }

        return pair;
    }


public static int getDigiNr(long n){

        long inv=0;
        int count=0;
        while(n!=0){
            inv=inv*10+n%10;
            n=n/10;
            count++;
          }
        return count;}




//        if(init==inv){
//            System.out.println("Nr "+init+" is palindrome");
//        }
//        else{
//            System.out.println("Nr " +init+" is not palindrome");
//        }


}
