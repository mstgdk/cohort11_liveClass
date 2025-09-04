package exceptions.unChecked_runTime;

import java.io.IOException;

//final, finally , finalize
public class UnCheckedException01 {
    public static void main(String[] args) {
        System.out.println("uygulama başladı");

        try {
            int a = 12;
            int b = 0;
            System.out.println("ugulama çalışmaya devam ediyor-1");

            System.out.println(a/b);

            System.out.println("işlem yapılıyor");
        }catch (ArithmeticException e){
            System.out.println("aritmetikExc çalıştı");
        }
        catch (Exception e) {
            System.out.println("---catch blok çalıştı-----");
            System.out.println("e.getMessage() = " + e.getMessage());//hatanın ne olduğunu kısa bir şekilde veren teknik mesaaj
            e.printStackTrace();//detaylı teknik mesaj
            System.err.println("Teknik olmayan renkli mesaj");
        }finally {
            System.out.println("finally çalıştı!!");
        }

        System.out.println("ugulamayı kullanmaya devam ediyoruz");


    }
}
