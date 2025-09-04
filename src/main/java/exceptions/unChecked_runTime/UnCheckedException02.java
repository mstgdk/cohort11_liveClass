package exceptions.unChecked_runTime;

import java.util.Scanner;

public class UnCheckedException02 {
    public static void main(String[] args) {
        System.out.println("uygulama çalışmaya başladı");
        Scanner scan = new Scanner(System.in);
        System.out.println("yaş giriniz");
        int age = scan.nextInt();
        if (age<16){
            throw new RuntimeException("yaş 16dan büyük olmalı");
        }
        System.out.println("ugulamayı kullanmaya devam ediyoruz");

    }
}
