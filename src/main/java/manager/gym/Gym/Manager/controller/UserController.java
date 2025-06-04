package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.User;
import manager.gym.Gym.Manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        try {
            user.setRole("member");
            userService.saveUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Registration failed");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> loginUser(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();


        User existingUser = userService.findByUsername(username);
        if (existingUser == null || !existingUser.getPassword().equals(password)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Collections.singletonMap("error", "Invalid username or password"));
        }



        Map<String, Object> response = new HashMap<>();
        response.put("role", existingUser.getRole());
        response.put("id", existingUser.getId());


        return ResponseEntity.ok(response);
    }


}
