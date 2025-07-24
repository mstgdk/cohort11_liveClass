package loops;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        /*
        Koşula bağlı olarak çalışır.
        Döngüye girmeden önce koşul kontrol edilir
        Koşulu sağladığı sürece döngü çalışır
         */
        int i = 1;
        while(i<=3){
            System.out.println(i);
            i++;
        }
         /*
        kullanıcdan sayı al. 5 den küçük olduğu sürece ekrana "geçerli sayı girdiniz" yaz
         */
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("sayı gir");
        num = scan.nextInt();

        while (num<5){
            System.out.println("geçerli sayı girdiniz");
            System.out.println("yeni sayı gir");
            num = scan.nextInt();
        }
        System.out.println("döngünün dışına çıktı");


    }
}
