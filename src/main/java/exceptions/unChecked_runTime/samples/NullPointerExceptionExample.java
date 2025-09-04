package exceptions.unChecked_runTime.samples;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        // NullPointerException: Null olan bir nesne üzerinden işlem yapılmaya çalışıldığında oluşur
        String str = null;
        if (str!=null){
            System.out.println(str.length()); // Bu satırda NullPointerException meydana gelir
        }


        /*
        try {
            // NullPointerException: Null olan bir nesne üzerinden işlem yapılmaya çalışıldığında oluşur
            String str = null;
            System.out.println(str.length()); // Bu satırda NullPointerException meydana gelir
        } catch (NullPointerException e) {
            System.out.println("Hata: Null nesne üzerinden işlem yapılamaz!"); // Exception yakalandığında bu mesajı yazdırır
        }
         */

        System.out.println("uygulama çalışmaya devam etti");
    }
}
