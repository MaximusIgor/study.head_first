package oop.mixed;

public class Mixed2 extends Object {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        System.out.println(c.getClass());
        System.out.println(c.hashCode());
        System.out.println(c.toString());
        String name;

        b.m1();
        c.m2();
        a.m3();
        System.out.println();

        c.m1();
        c.m2();
        c.m3();
        System.out.println();

        a.m1();
        b.m2();
        c.m3();
        System.out.println();

        a2.m1();
        a2.m2();
        a2.m3();
    }
}
