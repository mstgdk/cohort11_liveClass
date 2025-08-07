package stringBuilderBuffer;

public class StringAndStringBuilders {
    public static void main(String[] args) {
        String s = "java";
        s = s.concat(" 21");
        System.out.println(s);

        StringBuilder sb = new StringBuilder("java");
        sb.append(" 21");
        System.out.println(sb);
    }
}
