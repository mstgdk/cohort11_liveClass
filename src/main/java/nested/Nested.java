package nested;

public class Nested {
    int a = 12;

    static class StaticInner{
        int a = 13;
    }

    class NonStaticInner{
        int a = 14;
    }
    //localClass1
    void myMethod(){
        int localVar = 9;
        class LocalInner{
            void show(){
                System.out.println(localVar);
            }

        }
        LocalInner in = new LocalInner();
        in.show();
    }
    //localClass2
    void myMethod2(String name){

        class LocalInner{
            void show(){
                System.out.println(name);
            }

        }
        LocalInner in = new LocalInner();
        in.show();
    }

}
