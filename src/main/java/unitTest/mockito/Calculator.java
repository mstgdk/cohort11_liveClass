package unitTest.mockito;

public class Calculator {
    public int sum(int... numbers) {
        return java.util.Arrays.stream(numbers).sum();
    }
}