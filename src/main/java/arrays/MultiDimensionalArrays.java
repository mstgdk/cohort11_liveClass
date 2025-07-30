package arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        //tanımlama
        int arr[][] = new int[3][2];
        //int[][] arrd = new int[3][2];
        //eleman ekleme
        arr[0][0] = 3;
        arr[0][1] = 5;
        arr[1][0] = 4;
        arr[1][1] = 8;
        arr[2][0] = 7;
        arr[2][1] = 0;

        //yazdırma
        System.out.println(Arrays.deepToString(arr));

        //multi elemanlardan yalnızca birinş yazdırmak
        System.out.println(Arrays.toString(arr[0]));

        //iç arraydeki bir elemanı yazdırma
        System.out.println(arr[1][1]);

        for (int[] a : arr){
            for (int b : a){
                System.out.print(b +" ");
            }
            System.out.println();
        }


    }
}
