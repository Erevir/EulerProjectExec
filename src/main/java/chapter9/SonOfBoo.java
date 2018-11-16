package chapter9;

import chapter7.Boat;

public class SonOfBoo extends Boo {

    public SonOfBoo() {
        super("boo");
    }
    public SonOfBoo(int i) {
        super("Fred");
    }
    public SonOfBoo(String s) {
        super(42);
    }
    public SonOfBoo(int i, String s)    {
            }
    public SonOfBoo(String a, String b, String c) {
        super(a,2);
    }
    public SonOfBoo(int i, int j) {
        super("man", j);   }

    public SonOfBoo(int i, int x, int y) {
        super("fls", 27);   }
}
