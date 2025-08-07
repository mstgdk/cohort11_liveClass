package stringBuilderBuffer;

public class StringBuilders {
    public static void main(String[] args) {
        //StringBuilder - mutable (değiştirilebilir)
        //String -> immutable (değiştirilemez)
        String s = "java";//literal
        String s2 = new String("java");
        s2 = s2.concat("dev");
        System.out.println(s2);

        //oluşturma
        StringBuilder sb = new StringBuilder();
        sb.append("java dev");
        StringBuilder sb1 = new StringBuilder("patika");
        sb1.append(" plus");
        System.out.println("sb1 = " + sb1);

        //karakter sayısı
        System.out.println("sb1.length() = " + sb1.length());

        //setCahrAt() -- belli indeksteki char'ı update eder
        sb1.setCharAt(2,'T');
        System.out.println(sb1);

        //delete
        sb1.delete(0,3);//3 hariç
        System.out.println(sb1);

        //deleteCharAt()
        sb1.deleteCharAt(0);
        System.out.println(sb1);

        //reverse
        System.out.println(sb.reverse());

        //stringBuilder -> string
        StringBuilder sb3 = new StringBuilder("patikaPlusStudents");
       String str = sb3.toString();
        System.out.println("str = " + str);
        System.out.println("str.getClass() = " + str.getClass());
        System.out.println("sb3.getClass() = " + sb3.getClass());

        //string --> strinBuilder
        String str2 = "mesut";
        StringBuilder sb4 = new StringBuilder(str2);
        System.out.println("sb4 = " + sb4);
        System.out.println("sb4.getClass() = " + sb4.getClass());

        //insert
        StringBuilder sb5 = new StringBuilder("abcdefgh");
        //sb5.insert(2,33);
        sb5.insert(2,"ABCDEF",1,4);
        System.out.println("sb5 = " + sb5);

        //compareTo
        StringBuilder sb6 = new StringBuilder("alia");
        StringBuilder sb7 = new StringBuilder("ali");
        System.out.println("sb6.compareTo(sb7) = " + sb6.compareTo(sb7));




    }
}
