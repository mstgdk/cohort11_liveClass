package methods;

public class MethodDefine {

    public void myFirstMethod () {
        System.out.println("Patika plus");
    }

    public String printMyName(){
        return "mesut";
    }

    public int topla(int a, int b ){
        int toplam = a+b;

        return toplam;
    }

    //static
    public static int topla2(int a, int b ){
        int toplam = a+b;

        return toplam;
    }

}
