package nested;

public class NestedRunner {
    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println("nested.a = " + nested.a);

        Nested.StaticInner inner1 = new Nested.StaticInner();
        System.out.println("inner1.a = " + inner1.a);

        Nested nested2 = new Nested();
       Nested.NonStaticInner inner2 = nested2.new NonStaticInner();
        System.out.println("inner2.a = " + inner2.a);

        nested2.myMethod();
        nested2.myMethod2("mesut");

    }
}
