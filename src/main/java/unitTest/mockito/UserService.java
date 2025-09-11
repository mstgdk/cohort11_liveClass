package unitTest.mockito;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserName(int id){
        User user = userRepository.findById(id);
                if(user!=null){
                    return user.getName();
                }
        return null;
    }
}
