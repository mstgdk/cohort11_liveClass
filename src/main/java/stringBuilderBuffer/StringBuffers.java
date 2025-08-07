package stringBuilderBuffer;

public class StringBuffers {
    public static void main(String[] args) {
        // thread safe
        StringBuffer sb = new StringBuffer("java");
        sb.append("dev");
        System.out.println("sb = " + sb);
    }
}
