import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test04_Exceptions {
    @Test
    public void testException(){
        int a = 2;
        int b =0;
        assertThrows(ArithmeticException.class, ()-> System.out.println(a/b));
    }
}
