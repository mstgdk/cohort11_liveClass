package exceptions.unChecked_runTime.samples;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        // ArithmeticException: Sayılarla yapılan sıfıra bölme işlemi sırasında oluşur
        //int result = 10 / 0; // Bu satırda ArithmeticException meydana gelir


        try {
            // ArithmeticException: Sayılarla yapılan sıfıra bölme işlemi sırasında oluşur
            int result = 10 / 0; // Bu satırda ArithmeticException meydana gelir
        } catch (ArithmeticException e) {
            System.out.println("Hata: Sıfıra bölme hatası!"); // Exception yakalandığında bu mesajı yazdırır
        }
        System.out.println("uygulama çalışmaya devam etti");
    }
}
