package EulerProject;

public class TriangularNumbers {

    public static void main(String[] args) {
        long n=20;
        int triangularNr;
        for(int i=1; i<n;i++){
            triangularNr=(i*(i+1))/2;
            System.out.println(i+"  Triangular Number = "+triangularNr);
        }
    }
}
