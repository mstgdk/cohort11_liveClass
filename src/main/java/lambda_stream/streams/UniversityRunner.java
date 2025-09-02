package lambda_stream.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniversityRunner {
    public static void main(String[] args) {
        University uni1 = new University("A","math",1000,75);
        University uni2 = new University("B","tr",800,84);
        University uni3 = new University("C","eng",750,79);
        University uni4 = new University("D","math",1200,99);
        University uni5 = new University("E","com",600,60);
        University uni6 = new University("F","com",500,50);
        University uni7 = new University("G","math",1000,75);

        List<University> unv = new ArrayList<>(Arrays.asList(uni1,uni2,uni3,uni4,uni5,uni6,uni7));

//        System.out.println("Stream04.university1(unv) = " + Stream04.university1(unv));
//        System.out.println("Stream04.university2(unv) = " + Stream04.university2(unv));
//        System.out.println("Stream04.stuCounter(unv) = " + Stream04.stuCounter(unv));
  //      System.out.println("Stream04.university3(unv) = " + Stream04.university3(unv));
        System.out.println("Stream04.university4(unv) = " + Stream04.university4(unv));
    }
}
