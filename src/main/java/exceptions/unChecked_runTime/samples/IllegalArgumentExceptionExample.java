package exceptions.unChecked_runTime.samples;

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        // genellikle kendi yazdığımız bir metodun beklenmeyen ya da geçersiz bir parametre alması durumunda fırlatılır.
        int age = -1;
        if (age < 0) {
            throw new IllegalArgumentException("Yaş negatif olamaz!"); // Bu satırda IllegalArgumentException meydana gelir
        }
        /*
        try {
            // IllegalArgumentException: Geçersiz bir argümanla metot çağrıldığında oluşur
            int age = -1;
            if (age < 0) {
                throw new IllegalArgumentException("Yaş negatif olamaz!"); // Bu satırda IllegalArgumentException meydana gelir
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage()); // Exception yakalandığında hata mesajını yazdırır
        }
         */

        System.out.println("uygulama çalışmaya devam etti");

    }
}
