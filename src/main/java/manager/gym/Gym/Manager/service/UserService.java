package manager.gym.Gym.Manager.service;

import manager.gym.Gym.Manager.entity.User;

public interface UserService {
    User findByUsername(String username);

    void saveUser(User user);
}
