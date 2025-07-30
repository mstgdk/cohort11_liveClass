package StringManipulations;

import java.util.Arrays;

public class StringManipulations01 {
    public static void main(String[] args) {
        //length()
        String s = "Java";
        System.out.println("s.length() = " + s.length());

        //equals()
        String s1 = "javA";
        String s2 = "java";
        boolean isEqual = s1.equals(s2);
        System.out.println("isEqual = " + isEqual);

        //equalIgnocase()
        String s3 = "javA";
        String s4 = "java";
        boolean isEqual2 = s3.equalsIgnoreCase(s4);
        System.out.println("isEqual = " + isEqual2);

        //toLowerCase() - toUpperCase
        String s5 = "MeSuT";
        System.out.println("s5.toLowerCase() = " + s5.toLowerCase());
        System.out.println("s5.toUpperCase() = " + s5.toUpperCase());


        //charAt()
        String s6 = "Patika";
        System.out.println("s6.charAt(2) = " + s6.charAt(2));
        //bir stringin ilk ve son karakterini ekrana basınız
        char first = s6.charAt(0);
        char last = s6.charAt(s6.length() - 1);
        System.out.println(first + "  " + last);

        //subString() - bir stringin belli bir bölümünü almaya yarar
        //1.kullanım
        String s7 = "PatikaDev";
        System.out.println("s7.substring(2) = " + s7.substring(2));//2 dahil, sonrasını alır

        //2.kullnım
        System.out.println("s7.substring(1,4) = " + s7.substring(1, 4)); //ilk index dahil, ikinci dahil değil. 1 dahil, 4 dahilş değil

        //contains
        String s8 = "Patika java";
        System.out.println("s8.contains(\"a\") = " + s8.contains("java"));

        //split
        String s9 = "Ali ata bak";
        String[] arr = s9.split(",");
        System.out.println(Arrays.toString(arr));

        //replace()
        String s10 = "Ali ata bak";
        String newStr = s10.replace(" ", "");
        System.out.println("newStr = " + newStr);

        //Bir stringde space hariç kaç karakter olduğunu buylunuz
        int num = s10.replace(" ", "").length();
        System.out.println("num = " + num);

        //indexOf() -- verilen karakter ya da karakterlerin ilk görüldüğü yerin indexini verir
        int idx = s10.indexOf("bak"); // eğer kelime nin indeksi bulunmak istenirse ilk bulunan kelimenin ilk harfinin indeksini verir
        System.out.println("idx = " + idx);

        //lastIndex()
        int idx2 = s10.lastIndexOf("a");
        System.out.println("idx2 = " + idx2);

        //Bir String'deki bir character'in tekrarlı veya tekrarsız olup olmadigini gosteren kodu yaziniz
        String a = "Ankara";
        char c = 'a';
        if (a.indexOf(c) == a.lastIndexOf(c)) {
            System.out.println("tekrarsız");
        } else System.out.println("tekrarlı");

        //isEmpty() -- space'i karakter olarak algılar
        String em = " ";
        System.out.println("em.isEmpty() = " + em.isEmpty());

        //isBlank()
        String bl = " ";
        System.out.println("bl.isBlank() = " + bl.isBlank());

        //startsWith() -- endsWith()
        String s11 = "Hi patika";
        System.out.println("s11.startsWith(\"H\") = " + s11.startsWith("Hi"));
        System.out.println("s11.endsWith(\"patika\") = " + s11.endsWith("patika"));

        //trim()
        String s12 = "    java   ";
        System.out.println("s12.length() = " + s12.length());
        String trimmed = s12.trim();
        System.out.println("trimmed = " + trimmed);
        System.out.println("trimmed.length() = " + trimmed.length());

        //repeat
        String s13 = "hi ";
        System.out.println("s13.repeat(4) = " + s13.repeat(4));

        //join
        String joined = String.join("-", "Java", "patika", "dev", "plus");
        System.out.println("joined = " + joined);

        //compareTo()
        /*
        negatif ->a1 daha önce gelir
        pozitif ->b1 daha önce gelir
         */
        String a1 = "ali";
        String b1 = "bursa";
        int diff = a1.compareTo(b1);
        System.out.println("diff = " + diff);


    }
}
