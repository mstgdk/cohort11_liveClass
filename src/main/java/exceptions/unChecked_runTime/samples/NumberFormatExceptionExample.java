package exceptions.unChecked_runTime.samples;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        // NumberFormatException: Sayıya dönüştürülemeyen bir metinle işlem yapılmaya çalışıldığında oluşur
        String str = "abc";
        int number = Integer.parseInt(str); // Bu satırda NumberFormatException meydana gelir
        /*
        try {
            // NumberFormatException: Sayıya dönüştürülemeyen bir metinle işlem yapılmaya çalışıldığında oluşur
            String str = "abc";
            int number = Integer.parseInt(str); // Bu satırda NumberFormatException meydana gelir
        } catch (NumberFormatException e) {
            System.out.println("Hata: Sayıya dönüştürülemeyen metin!"); // Exception yakalandığında bu mesajı yazdırır
        }
         */

        System.out.println("uygulama çalışmaya devam etti");

    }
}
