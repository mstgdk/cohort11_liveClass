package ascii;

public class AsciiTable {
    public static void main(String[] args) {
        //American Standart Code For Information Interchange

        char a = 'A';
        System.out.println("a = " + a);
        int ascii = a;
        System.out.println("ascii = " + ascii);

        System.out.println('A'+5);
        System.out.println("correctName(\"mesut\") = " + correctName("Mesut"));
        /*
        Kulanıcıdan alınan ismin ilk harfinin büyük harf ile başlayıp başlamadığını kontrol et,
        Küçük ile başlıyorsa büyük harfe çeviren bir algoritma yaz
         */

    }
    public static String correctName(String name){
        if (name!=null && !name.isEmpty()){
            char firstChar = name.charAt(0);
            if (firstChar>='a' && firstChar<='z'){
               char correctedFirstChar = (char) (firstChar - 32);
               name = correctedFirstChar + name.substring(1);
            }
        }
        return name;
    }
}
