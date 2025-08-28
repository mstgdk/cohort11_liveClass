package lambda_stream.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;

public class Stream02 {
    //map
    //TASK-3: StreamAPI ile list elemanlarinin  cift olanlarının KARELERİNİ aynı
    // satırda aralarına boşluk bırakarak print ediniz.
    public static void printNumbers6(ArrayList<Integer> list) {
        list.stream()
                .filter(t -> t % 2 == 0)
                .map(t -> t * t)//akıştan giren eleman kadar çıkan olacak
                .forEach(Stream01::yazdir);
    }
    //TASK-4: StreamAPI ile list elemanlarinin  tek elemanlarının  küplerinin bir fazlasinı aynı satırda aralarına boşluk bırakarak print ediniz.
    public static void printNumbers66(ArrayList<Integer> list) {
        list.stream()
                .filter(t -> t % 2 != 0)
                .map(t -> (t * t * t)+1)//akıştan giren eleman kadar çıkan olacak
                .forEach(Stream01::yazdir);
    }
    //REDUCE-Eğer sonuç tek bir değer ise reduce kullanılabilir
    //Task-5 : Listin en büyük elemanını yazdırınız
    public static void printNumbers7(ArrayList<Integer> list) {
        Optional<Integer> maxSayi = list.stream().reduce(Math::max);//Math::min
        System.out.println("maxSayi = " + maxSayi);
        System.out.println("maxSayiget() = " + maxSayi.get());//güvenli değil
        maxSayi.ifPresent(System.out::print);//güvenli
    }

    public static void printNumbers77(ArrayList<Integer> list) {
        Optional<Integer> maxSayi = list.stream().reduce(Integer::max);
        System.out.println("maxSayi = " + maxSayi);
        System.out.println("maxSayiget() = " + maxSayi.get());//güvenli değil
        maxSayi.ifPresent(System.out::print);//güvenli
    }

    //sum
    public static void topla(ArrayList<Integer> list) {
        Integer toplam = list.stream().reduce(0, (a, b) -> a + b);

        Integer toplam2 = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("toplam : " + toplam);
        System.out.println("toplam2 = " + toplam2);
    }

    //çarpma
    public static void carpma(ArrayList<Integer> list) {
        Integer result = list.stream().reduce(1, (a, b) -> a * b);
        Optional<Integer> result2 = list.stream().reduce(Math::multiplyExact);
        System.out.println("result2 = " + result2);
        System.out.println("result = " + result);
    }
//    public static void bolme(ArrayList<Integer> list) {
//        Integer result = list.stream().reduce(1,(a,b)->a/b);
//        System.out.println("result = " + result);
//    }

    //SORTED
    // Task-11 : list'in cift  elemanlarını  kucukten buyuge print ediniz.
    public static void printNumbers8(ArrayList<Integer> list) {
        list.stream()
                .filter(t -> t % 2 == 0)
                //.sorted()
                .sorted(Comparator.reverseOrder())
                .forEach(Stream01::yazdir);
    }
    //AVARAGE
    // TASK-12: List elemanlarının ortalamasını yazdırınız
    public static void ortalama(ArrayList<Integer> list) {
        OptionalDouble ortalama = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println("ortalama = " + ortalama);

        double ortalama2 = list.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0);

    }


}