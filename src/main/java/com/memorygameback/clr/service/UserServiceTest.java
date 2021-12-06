package com.memorygameback.clr.service;

import com.memorygameback.accessingdatajpa.CardGameRepository;
import com.memorygameback.accessingdatajpa.UserRepository;
import com.memorygameback.services.interfaces.CardGameService;
import com.memorygameback.services.interfaces.UserService;
import com.memorygameback.utils.ArtUtils;
import com.memorygameback.utils.TestUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Order(2)
public class UserServiceTest implements CommandLineRunner {
    private final UserService userService;
    private final CardGameService cardGameService;
    private final TestUtils testUtils;
    private final ArtUtils artUtils;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(ArtUtils.User_SERVICE);

        userService.syncHighestScore();
    }
}
