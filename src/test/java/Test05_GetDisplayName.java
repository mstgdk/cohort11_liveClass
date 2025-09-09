import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test05_GetDisplayName {
    @Test
    @DisplayName("girilen stringi integere ceviren metot testi.....")
    void girilen_stringi_integere_ceviren_metot_testi(){
        String str = "java";
        assertThrows(NumberFormatException.class, ()->{
            Integer.parseInt(str);
        });
    }
}
