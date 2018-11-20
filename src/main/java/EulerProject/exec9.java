package EulerProject;

public class exec9 {

    public static void main(String[] args) {

        int sum = 1000;
        int produsul;
        int a;
        int b;
        int c;
        for (int i = 1; i < sum + 1; i++) {
            a = i;
            for (int j = 1; j < sum; j++) {
                b = j;
                for (int y = 1; y < sum; y++) {
                    c = y;

                    int a2 = (int) Math.pow(a, 2);
                    int b2 = (int) Math.pow(b, 2);
                    int c2 = (int) Math.pow(c, 2);
                    int comp = a2 + b2;

//            System.out.println("comp = " + comp);
//            System.out.println("Math.sqrt(comp)=  "+Math.sqrt(comp));
//            System.out.println("a2= " +a2+ "  b2= " + b2 + "  c2= " + c2);
                    if (comp == c2) {
                        if ((a + b + c) == sum) {
                            System.out.println("a= " + a + "b= " + b + "c= " + c);
                            produsul = a * b * c;
                            System.out.println("Produsul axbxc = " + produsul);
                        }
                    }
                }
            }
        }
    }
}
