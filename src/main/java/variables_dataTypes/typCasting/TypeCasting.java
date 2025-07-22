package variables_dataTypes.typCasting;

public class TypeCasting {
    public static void main(String[] args) {
        //Genişletme (Widining)
        int num = 10;
        System.out.println("num = " + num);
        double ondalik = num;
        System.out.println("ondalik = " + ondalik);

        byte num2 = 5;
        short shortNum = num2;
        System.out.println("shortNum = " + shortNum);

        //daraltma (narrowing)
        double double1 = 10.5;
        int num3 = (int) double1;
        System.out.println("num3 = " + num3);

        //
        //char c = (char) '0'+1;
    }
}
