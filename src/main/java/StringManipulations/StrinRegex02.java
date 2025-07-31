package StringManipulations;

public class StrinRegex02 {
    public static void main(String[] args) {
        //regex - regular expressions

        //stringdeki tüm rakamları # ile değiştiriniz
        String s = "abc1234asdf";
        String result = s.replaceAll("[0-9]", "#");
        System.out.println("result = " + result);

        //stringdeki tüm rakam olmayan karakterleri # ile değiştiriniz
        String s1 = "abc1234asdf";
        String result2 = s.replaceAll("[^0-9]", "#");
        System.out.println("result2 = " + result2);


        //matche
        String s3 = "rtrtew";
        System.out.println("s3.matches(\"[0-9]+\") = " + s3.matches("[0-9]+"));// + olması en az bir tane olmalı
    }
    /*"Regex" Regular Expressions
        1) Tüm rakamlar ==> [0-9]
        2)Tüm küçük harfler==> [a-z]
        3)tüm büyük harfler==> [A-Z]
        4)tüm harfler ==> [a-zA-Z]
        5)Sesli harfler ==> [aeiouAEIOU]
        6) Tüm rakamlar ve tüm harfler ==> [0-9a-zA-Z]
        7) Space ==> [ ]
        8) Tüm noktalama işaretleri     \\p{Punct}

        1)Rakamlar hariç tüm karakterler ==> [^0-9]
        2) Küçük harfler hariç tüm karakterler ==> [^a-z]
        3)büyük harfler hariç tüm karakterler==> [^A-Z]
        4)tüm harfler hariç tüm karakterler ==> [^a-zA-Z]
         5) Space hariç tüm karakterl ==> [^ ]

*/
}
