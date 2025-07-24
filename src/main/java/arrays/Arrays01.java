package arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //aynı data tipinde çoklu data tutmaya imkan sağlar.

        //Array tanımlama
        int nums[] = new int[5]; //1
        int[] nums2 = new int[5]; //1

        //eleman ekleme
        nums[0] = 12;
        nums[1] = 10;
        nums[2] = 8;
        nums[3] = 16;
        nums[4] = 3;
        nums[0] = 99;
        //nums[5] = 55;

        //array yazdırma
        System.out.println(nums);//[I@3feba861
        System.out.println(Arrays.toString(nums));//[12, 10, 8, 16, 3]

        //her hangibir elemanı yazdırma
        System.out.println(nums[3]);//16

        //kısa yoldan eleman ekleme
        String[] str = {"a","mn","rt","ls"};
        System.out.println(Arrays.toString(str));
        str[3] = "ali";
        System.out.println(Arrays.toString(str));

        //uzunluk (eleman sayısı) bulma
        int elemanSyisi = nums.length;
        System.out.println("elemanSyisi "+elemanSyisi);

        //sıralama
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        // SORU - 1) Array deki en küçük ve en büyük elemanın toplamını ekrana yazınız
        Arrays.toString(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        System.out.println(min+max);

        // SOUR-2) nums Array i içindeki tüm elemanların toplanını
        //ekrana yazdıran kodu yazdırınız
        int sum = 0;
        for (int i =0 ; i < nums.length ; i++){
           sum= sum+nums[i];
        }
        System.out.println("sum = " + sum);

        //binarySearch
        int[] arr = {1,3,7,4,6,9,11,55};
        int a = 2;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr,a);
        System.out.println("index = " + index);

        //array kopyalama
        Integer[] original = {1,2,3};
        Integer[] copy = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.toString(copy));

        //eleman atamadan yazdırsak
        int[] nums3 = new int[4];
        System.out.println(nums3[1]);
        System.out.println(Arrays.toString(nums3));

        Integer[] nums4 = new Integer[4];
        System.out.println(nums4[1]);
        System.out.println(Arrays.toString(nums4));


    }
}
