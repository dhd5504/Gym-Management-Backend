package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.User;
import manager.gym.Gym.Manager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
