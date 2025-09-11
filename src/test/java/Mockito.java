import org.junit.jupiter.api.Test;
import unitTest.mockito.User;
import unitTest.mockito.UserRepository;
import unitTest.mockito.UserService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Mockito {
   @Test
    void testGetName(){
       UserRepository mockRepo = mock(UserRepository.class);//mock oluşturduk

       //davranış tanımla
       when(mockRepo.findById(1)).thenReturn(new User(1,"mesut"));

       UserService service = new UserService(mockRepo);

      String nameActual = service.getUserName(1);
      assertEquals("mesut", nameActual);
   }


}
