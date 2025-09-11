import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test07_MethodSource {
    @ParameterizedTest
    @MethodSource("stringLength")
    void testLength(String input, int expectedLength){
        assertEquals(expectedLength, input.length());
    }

    static Stream<Arguments> stringLength(){
       return Stream.of(
                Arguments.of("java",4),
                Arguments.of("dev",3),
                Arguments.of("junit",5)

        );
    }
}
