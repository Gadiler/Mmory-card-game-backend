package com.memorygameback.controllers;

import com.memorygameback.beans.User;
import com.memorygameback.services.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class UserController {
    private final String TAG = this.getClass().getSimpleName();
    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        System.out.println(TAG + " Login: User name:"+ user.getUserName());
        if (userService.login(user.getUserName(), user.getPassword()))
            return new ResponseEntity<>(HttpStatus.OK);
        else
            return new ResponseEntity<>((HttpStatus.BAD_REQUEST));
    }

    @GetMapping("/getAllCardGames")
    public ResponseEntity<?> getAllCardGames() {
        return new ResponseEntity<>(userService.getAllGames(), HttpStatus.OK);
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<?> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping("/counter")
    public ResponseEntity<?> turnsCounterUpdate(@RequestBody int counter) {
        System.out.println(TAG+" Counter: " + counter);
        System.out.println(" userService.getHighestScore(): " + userService.getHighestScore());
        if (userService.getHighestScore() < counter){
            userService.setHighestScore(counter);
        }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
