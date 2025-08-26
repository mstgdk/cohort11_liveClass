package generics.genericClass01;

public class BookRunner {
    public static void main(String[] args) {
        Book<String> stringBook = new Book<>();
        stringBook.setValue("patika");
        System.out.println("stringBook = " + stringBook);

        Book<Integer> intBook = new Book<>();
        intBook.setValue(12345);
        System.out.println("intBook = " + intBook);
    }
}
