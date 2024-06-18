package boardcrud.example.toyproject.service;

import boardcrud.example.toyproject.dto.UserDto;
import boardcrud.example.toyproject.model.User;
import boardcrud.example.toyproject.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public UserDto createUser(UserDto userdto) {
        User user = new User();
        user.setUserId(userdto.getUserId());
        user.setUserName(userdto.getUsername());
        user.setPassword(userdto.getPassword());

        user = userRepository.save(user);

        return new UserDto(user.getUserId(), user.getUserName(), user.getPassword());
    }

}
