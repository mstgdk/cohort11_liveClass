package generics.genericInterface02;

public class InterfaceRunner {
    public static void main(String[] args) {
        StringRepository s1 = new StringRepository();
        s1.add("patika");
        System.out.println("s1.get() = " + s1.get());
    }
}
