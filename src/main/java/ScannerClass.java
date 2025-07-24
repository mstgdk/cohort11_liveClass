import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //String
        System.out.println("adınızı giriniz");
        String name = input.nextLine();
        System.out.println("name = " + name);

        //int
        System.out.println("sayı giriniz");
        int num = input.nextInt();
        System.out.println("num = " + num);

        //double
        System.out.println("double sayı giriniz");
        double doubnum = input.nextDouble();
        System.out.println("doubnum = " + doubnum);

        //boolean
        System.out.println("doğru mu yanlış mı");
        boolean answer = input.nextBoolean();
        System.out.println(answer);

        System.out.println("int değer gir");
        int i = input.nextInt();
        System.out.println(i);
        input.nextLine();
        System.out.println("Strin gir");
        String b = input.nextLine();

    }
}
