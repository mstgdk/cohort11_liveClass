package lambda_stream.lambda;

public class Lambda01 {

    @FunctionalInterface
    interface Printer{
        void print();
        //void print2();
    }

    @FunctionalInterface
    interface Greeting{
        String greet(String name);
    }
}
