import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test06_ParameterizedTest {
    @Test
    void testLength(){
        assertTrue("mesut".length()>0);
        assertTrue("veli".length()>0);
        assertTrue("ali".length()>0);
        assertTrue("enes".length()>0);
        assertTrue("ismail".length()>0);
        assertTrue("sarper".length()>0);
    }
    @ParameterizedTest
    @ValueSource(strings = {"mesut","ali","veli","can"})
    void testLength2(String str){
        assertTrue(str.length()>0);
    }
    @Test
    void testToUpperCase(){
        String str1 = "merhaba";
        String str2 = "java";
        String str3 = "test";

        assertEquals("MERHABA",str1.toUpperCase());
        assertEquals("JAVA",str2.toUpperCase());
        assertEquals("TEST",str3.toUpperCase());
    }
    //CSV
    @ParameterizedTest
    @CsvSource(value = {"MERHABA, merhaba", "JAVA, java"})
    void testToUpperCase2(String str1, String str2){
        assertEquals(str1, str2.toUpperCase());
    }

    @ParameterizedTest
    @CsvSource(value = {"true, merhaba, a", "true, JAVA, V"})
    void testContains(boolean b, String str1, String str2){
        assertEquals(b, str1.contains(str2));
    }
   //enes
   /* @ParameterizedTest
    @CsvSource(value = {"MERHABA, merhaba, merhaba", "JAVA, java"})
    void testToUpperCase3( String... str2){
        assertEquals(str1, str2.toUpperCase());
    }*/
}
