package co.uk.atlantis.dating.controller;

import co.uk.atlantis.dating.model.User;
import co.uk.atlantis.dating.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/users")
    public List<User> listUser(){
        return userService.findAll();
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<User> getOne(@PathVariable(value = "id") String id){
        User user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping(value="/signup")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        userService.save(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
