import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test01_Assertions {

    @Test
    public void test(){

    }
    //assertEquals
    @Test
    void testLength(){
        String str = "Merhaba Dunya";
        int actual = str.length();
        int expected = 13;
        assertEquals(expected, actual);
    }
    @Test
    void testContains(){

        assertEquals(false, "Java".contains("b"));
    }

    //assertNotEquals
    @Test
    void testNotEquals(){
        String actual = "Merhaba Dunya";
        String expected = "Merhaba Dunya";
        assertNotEquals(expected,actual,"stringler aynı ");
    }
    //assertTrue
    @Test
    void testTrue(){
        int a = 15;
        int b = 12;

        assertTrue(a>b , "testten geçemedi");
    }
    //assertFalse
    @Test
    void testFalse(){
        int a = 15;
        int b = 122;

        assertFalse(a>b , "testten geçemedi");
    }
    //assertNull / assertNotNull
    @Test
    void testNull(){
        String name = null;

        assertNotNull(name, "geçemedi");
    }
    // assertNotSame
    @Test
    void testObjects(){
        String a = "java";
        String b = "java";
        String c = new String("java");
        String d = new String("java");

       // assertSame(d,c);
        assertNotSame(d,c);
    }
    //
    @Test
    void testArray(){
        String str = "java patika dev";
        String[] actualArray = str.split(" ");
        String[] expectedArray = {"java","patika","dev"};

        //assertTrue(Arrays.equals(actualArray,expectedArray));
        assertArrayEquals(actualArray,expectedArray);

    }

}
