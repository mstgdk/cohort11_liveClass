package lambda_stream.streams;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamRunners {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,3,5,4,6,9,16,17,24));
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ali","sarper", "arda","asena","enes","bora","bora","bora","zeynep"));

        //Stream01.printNumbers(nums);
        //System.out.println();
        //Stream01.printNumbers2(nums);
        //System.out.println();
        Stream02.printNumbers66(nums);
        //Stream02.topla(nums);
        //Stream02.carpma(nums);
        //Stream02.printNumbers8(nums);
        //Stream02.ortalama(nums);

        Stream03.printNames1(list);
        System.out.println();
        //System.out.println(Stream03.printNames2(list));
        //Stream03.allMatch(list);
        //Stream03.noneMatch(list);
        //Stream03.anyMatch(list);
        //Stream03.limit(list);
        //Stream03.count(list);
        Stream03.skip(list);
    }
}
