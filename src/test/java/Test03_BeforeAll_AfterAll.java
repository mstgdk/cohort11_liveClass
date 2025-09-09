import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test03_BeforeAll_AfterAll {
    static String str;
    @BeforeAll
    static void beforeAll(){
        str = "junit ile test";
        System.out.println("beforeAll çalıştı");
    }

    @AfterAll
    static void afterAll(){
        str = "";
        System.out.println("After çalıştı");
    }
    @Test
    void testArrays(TestInfo info){
        String[] actualArray = str.split(" ");
        String[] expectedArray = {"java","patika","dev"};

        System.out.println(info.getDisplayName()+ " çalıştı");
        assertArrayEquals(actualArray,expectedArray);
    }
    @Test
    void testLength(TestInfo info){
        String str = "Merhaba Dunya";
        int actual = str.length();
        int expected = 13;
        System.out.println(info.getTestClass()+ " çalıştı");
        assertEquals(expected, actual);
    }
}
