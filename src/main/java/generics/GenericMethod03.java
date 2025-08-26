package generics;

public class GenericMethod03 {

    public static <T> void printArray(T[] array){
        for (T item : array){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        printArray(new String[]{"ali","ayşe"});
        printArray(new Integer[]{1,9,4,9});
    }
}
