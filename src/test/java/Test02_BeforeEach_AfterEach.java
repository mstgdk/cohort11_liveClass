import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test02_BeforeEach_AfterEach {
    String str;
    @BeforeEach
    void beforeEach(){
        str = "junit ile test";
        System.out.println("beforeEach() çalıştı..");
    }
    @AfterEach
    void afterEach(){
        str="";
        System.out.println("afterEach() çalıştı..");
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
