import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test08_Performance {
    @Test
    void testPerformance1(){
        assertTimeout(Duration.ofMillis(19),
                ()-> IntStream.range(1,1000).forEach(System.out::print)
                );
    }

    @Test
    @Timeout(1)
    void testPerformance2(){
        Long sum= IntStream.range(1,1000).mapToLong(n->n*n).sum();
        assertTrue(sum>1000);
    }
}
