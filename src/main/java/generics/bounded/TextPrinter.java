package generics.bounded;

public class TextPrinter<T extends CharSequence> {
    private  T text;

    public TextPrinter(T text) {
        this.text = text;
    }

    public void  printInfo(){
        System.out.println("text : " + text);
        System.out.println("text leng: " + text.length());
    }

    public static void main(String[] args) {
        TextPrinter<String> strPrinter = new TextPrinter<>("patika");
        strPrinter.printInfo();

        TextPrinter<StringBuilder> sbPrinter = new TextPrinter<>(new StringBuilder("patika"));
        sbPrinter.printInfo();

        //TextPrinter<Integer> intPrinter = new TextPrinter<>();
    }
}
