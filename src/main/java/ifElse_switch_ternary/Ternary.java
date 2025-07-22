package ifElse_switch_ternary;

public class Ternary {
    public static void main(String[] args) {
        int age = 20;
        String message = age > 18 ? "reşitsiniz" : "reşit değilsiniz";
        System.out.println("message = " + message);


        int puan = 85;
        boolean success = puan>=50 ? true : false;
        System.out.println("success = " + success);

        int x = 10, y =20;
        int max = x>y ? x : y;
        System.out.println("max = " + max);
    }
}
