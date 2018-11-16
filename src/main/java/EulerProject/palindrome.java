package EulerProject;

public class palindrome {

    public static void main(String...args){
        int n=1245421;
        int init=n;
        int inv=0;

        while(n!=0){
            inv=inv*10+n%10;
            n=n/10;
        }
        if(init==inv){
            System.out.println("Nr "+init+" is palindrome");
        }
        else{
            System.out.println("Nr " +init+" is not palindrome");
        }
    }


}
