package lambda_stream.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Stream04 {
    //task 01--> Bütün üniversitelerin not ortalamalarının 74' den buyuk olup olmadığını kontrol edeniz.
    public static boolean university1(List<University> list){
       return list.stream().allMatch(t->t.getGpa()>40);
    }

    //TASK-2: Üniversitelerin her hangibirinde matematik bölümü olup olmadığını kontrol eden kod yazın
    public static boolean university2(List<University> list){
        return list.stream().anyMatch(t->t.getDepartment().equalsIgnoreCase("math"));
    }
    //task 03-->universite'leri ögrenci  sayilarina gore büyükten->küçüpe sıralayınız.
    public static List<University> stuCounter(List<University> list){
       return list.stream()
                .sorted(Comparator.comparing(University::getNumOfStudents).reversed())
                .toList();
    }
    // TASK-4 : Kaç tane üniversitede MAtematik bölümü olduğunu yazdırınız
    public static long university3(List<University> list){
        return list.stream()
                .filter(t->t.getDepartment().equalsIgnoreCase("math"))
                .count();

    }
    //TASK 5 : Öğrenci sayıları 550 den fazla olan üniversitelerin en yüksek not ortalamasını bulunuz
    public static Optional<Integer> university4(List<University> list){
        return list.stream()
                .filter(t->t.getNumOfStudents()>550 )
                .map(t->t.getGpa())
                .reduce(Math::max);

    }
}
