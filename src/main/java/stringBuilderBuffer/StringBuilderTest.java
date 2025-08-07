package stringBuilderBuffer;

public class StringBuilderTest {
    public static void main(String[] args) {
        int n = 100000;

        //String
        String str = "";
        long startString = System.currentTimeMillis();
        for (int i =0 ; i<n ; i++){
            str+="java";
        }
        long endString = System.currentTimeMillis();


        //StringBuilder
        StringBuilder sb = new StringBuilder("");
        long startStringBuilder = System.currentTimeMillis();
        for (int i =0 ; i<n ; i++){
            sb.append("java");
        }
        long endStringBuilder = System.currentTimeMillis();

        System.out.println("String süresi        : "+(endString-startString)+ " ms");
        System.out.println("StringBuilder süresi : "+(endStringBuilder-startStringBuilder)+ " ms");
    }
}
