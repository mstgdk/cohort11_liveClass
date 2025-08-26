package lambda_stream.lambda;

public class Lambda01Runner {
    public static void main(String[] args) {
        Lambda01.Printer printer1 = new Lambda01.Printer() {
            @Override
            public void print() {
                System.out.println("print metot classic olarak çalıştı");
            }
        };
        printer1.print();

        //tek satır
        Lambda01.Printer printer2 = () -> System.out.println("print metot lambda olarak çalıştı");
        printer2.print();

        //çok saatır
        Lambda01.Printer printer3 = () -> {
            System.out.println("print metot lambda olarak çalıştı");
            System.out.println("print metot lambda olarak çalıştı");
        };
        printer3.print();

        Lambda01.Greeting greeting1 = name -> {
            System.out.println("greet metot lambda olarak çalıştı");
            return "Hello " + name;
        };
        System.out.println("greeting1.greet(\"mesut\") = " + greeting1.greet("mesut"));


    }
}
