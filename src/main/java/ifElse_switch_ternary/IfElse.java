package ifElse_switch_ternary;

public class IfElse {
    public static void main(String[] args) {
        int a = 8;

        if (a==9 ){
            System.out.println("a eşitttir 9");
        } else if (a==8) {
            System.out.println("a eşittir 8");
        }else {
            System.out.println("1a hiç birine eşit değil");
        }
        //2

        if (a==9){
            System.out.println("a eşitttir 9");
        }if (a==8){
            System.out.println("a eşittir 8");
        }if (a==7){
            System.out.println("a eşittir 7");
        }
    }
}
