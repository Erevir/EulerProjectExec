package chapter7;

public class Mixed2 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();
        ClassA a2 = new ClassA();


        b.m1();//bs m1
        c.m2();//As m2
        a.m3();//As m3

        c.m1();//Bs m1
        c.m2();//As m2
        c.m3();//Cs m3, 13



    }
}
