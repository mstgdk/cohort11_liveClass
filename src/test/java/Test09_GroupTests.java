import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test09_GroupTests {

    @Nested
    class Group1{
        @Test
        void testNotEquals1(){
            String actual = "Merhaba Dunya";
            String expected = "Merhaba Dunya";
            assertNotEquals(expected,actual,"stringler aynı ");
        }
        //assertTrue
        @Test
        void testTrue2(){
            int a = 15;
            int b = 12;

            assertTrue(a>b , "testten geçemedi");
        }
    }
    @Nested
    class Group2{
        //@Test
        @RepeatedTest(4)
        void testNotEquals3(){
            String actual = "Merhaba Dunya";
            String expected = "Merhaba Dunya";
            assertNotEquals(expected,actual,"stringler aynı ");
        }
        //assertTrue
        @Test
        @Disabled
        void testTrue4(){
            int a = 15;
            int b = 12;

            assertTrue(a>b , "testten geçemedi");
        }
    }
    @Nested
    class Group3{
        @Test
        void testNotEquals5(){
            String actual = "Merhaba Dunya";
            String expected = "Merhaba Dunya";
            assertNotEquals(expected,actual,"stringler aynı ");
        }
        //assertTrue
        @Test
        void testTrue6(){
            int a = 15;
            int b = 12;

            assertTrue(a>b , "testten geçemedi");
        }
    }

}
