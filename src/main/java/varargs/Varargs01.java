package varargs;

public class Varargs01 {
    public static void main(String[] args) {
        add(2,32);
        add(2,3,6);
        add(5,6,9,8);
       int res = addVarArgs(2,5,9,8,7,4,6,9);
        System.out.println("res = " + res);
    }

    //2 sayının toıplamını veren metot yaz
    public static int add(int a, int b){
        return a+b;
    }
    //3 sayının toıplamını veren metot yaz
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    //4 sayının toıplamını veren metot yaz
    public static int add(int a, int b, int c, int d){
        return a+b+c+d;
    }

    public static int addVarArgs(int... a){
        int sum = 0;
        for (int w : a){
            sum+=w;
        }
        return sum;
    }
}
