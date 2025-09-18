import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import unitTest.mockito.Calculator;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({
            "2,2,4",     // 2+2 = 4
            "5,5,10",    // 5+5 = 10
            "1,2,3,6"    // 1+2+3 = 6
    })
    void testSum(String csvLine) {
        int[] numbers = java.util.Arrays.stream(csvLine.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(Arrays.toString(numbers));

        int expected = numbers[numbers.length - 1];
        int[] input = java.util.Arrays.copyOf(numbers, numbers.length - 1);

        int result = calculator.sum(input);

        assertEquals(expected, result);
    }
}