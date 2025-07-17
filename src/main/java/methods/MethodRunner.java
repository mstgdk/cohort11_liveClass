package methods;

public class MethodRunner {
    public static void main(String[] args) {
        //1
        MethodDefine md = new MethodDefine();
        //md.myFirstMethod();
        //System.out.println(md.printMyName());
        System.out.println(md.topla(3, 6));
        System.out.println("md.topla(3, 6) = " + md.topla(3, 6));
       int sonuc = md.topla(9,8);
        System.out.println("sonuc = " + sonuc);

        //2.yöntem
        System.out.println("//static yöntem");
        System.out.println(MethodDefine.topla2(6, 7));


    }
}
