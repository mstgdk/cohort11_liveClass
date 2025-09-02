package varargs;

public class Varargs02 {
    public static void main(String[] args) {
        printMessaages("Mesajlar", "merhaba","nasılsın","selam","java", "patika");
    }

    static void printMessaages(String prefix, String... messages){
        System.out.println(prefix+ " : ");
        for (String msg : messages){
            System.out.println(" -" + msg);
        }
    }
}
