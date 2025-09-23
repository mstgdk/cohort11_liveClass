public class HeapAndStack {
    public static void main(String[] args) {
        String a = "patika";
        String b = "patika";
        String c = new String("patika");
        String d = new String("patika");

        System.out.println(a==b);//true
        System.out.println(a==c);//false
        System.out.println(c==d);//false

        System.out.println("//equals");
        System.out.println(a.equals(b));//true
        System.out.println(a.equals(c));//true
        System.out.println(c.equals(d));//true

        System.out.println("System.identityHashCode(a.hashCode()) = " + System.identityHashCode(a));
        System.out.println("System.identityHashCode(b.hashCode()) = " + System.identityHashCode(b));
        System.out.println("System.identityHashCode(c.hashCode()) = " + System.identityHashCode(c));
        System.out.println("System.identityHashCode(d.hashCode()) = " + System.identityHashCode(d));


    }
}
