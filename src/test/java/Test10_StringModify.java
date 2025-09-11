import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import unitTest.StringModify;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test10_StringModify {
    StringModify stringModify;
    @BeforeEach
    void beforeEach(){
        stringModify = new StringModify();
        System.out.println("beforeEach() çalıştı..");
    }
    @AfterEach
    void afterEach(){
        stringModify=null;
        System.out.println("afterEach() çalıştı..");
    }

    @ParameterizedTest
    @CsvSource(value = {"MESUT,mesut", "KEREM, kerem"})
    void modifyTest(String ex, String ac){
        assertEquals(ex,stringModify.modify(ac) );
        System.out.println(ex +" için çalıştı");
    }
}
