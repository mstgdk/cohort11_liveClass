package lambda_stream.lambda;

import java.time.LocalTime;
import java.util.function.*;

public class BuiltInInterfaces {
    public static void main(String[] args) {
        //Supplier Tedarik eder
        Supplier<String> name =() -> "Mesut";
        System.out.println("name.get() = " + name.get());

        Supplier<LocalTime> time =()-> LocalTime.now();
        System.out.println("time.get() = " + time.get());

        //Consumer
        Consumer<String> printName = name2 -> System.out.println("Merhaba " + name2);
        printName.accept("Mesut");

        BiConsumer<String,Integer> printNAmeAge = (name3, age) -> System.out.println(name3+age);
        printNAmeAge.accept("patika",3);

        //Predicate
        Predicate<Integer> isEven = number->number% 2 ==0;
        System.out.println("isEven.test(9) = " + isEven.test(9));

        BiPredicate<String,String> startsWith = (str, prf) -> str.startsWith(prf);
        System.out.println("startsWith.test(\"patika\",\"p\") = " + startsWith.test("patika", "p"));

        //Function<T,U> T tipinde girdi vardır, U tipinde çıktı vardır
        Function<String,String> toUpperCase = s->s.toUpperCase();
        System.out.println("toUpperCase.apply(\"patika\") = " + toUpperCase.apply("patika"));

        //BiFunction<T,U,R>
        BiFunction<Integer,Integer,String> sum =(a,b) -> "Toplam : " + (a+b);
        System.out.println("sum.apply(3,9) = " + sum.apply(3, 9));
    }
}
