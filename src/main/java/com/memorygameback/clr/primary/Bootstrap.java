package com.memorygameback.clr.primary;

import com.memorygameback.accessingdatajpa.CardGameRepository;
import com.memorygameback.accessingdatajpa.UserRepository;
import com.memorygameback.beans.CardGame;
import com.memorygameback.beans.GameState;
import com.memorygameback.beans.User;
import com.memorygameback.utils.ArtUtils;
import com.memorygameback.utils.TestUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
@Order(1)
public class Bootstrap implements CommandLineRunner {
    private final UserRepository userRepository;
    private final CardGameRepository cardGameRepository;
    private final TestUtils testUtils;
    private final ArtUtils artUtils;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(ArtUtils.BOOTSTRAP);

        User u0 = User.builder().userName("Ted").password("1234").build();
        User u1 = User.builder().userName("Barney").password("1234").build();
        User u2 = User.builder().userName("Marshall").password("1234").build();
        User u3 = User.builder().userName("Robin").password("1234").build();
        User u4 = User.builder().userName("Lily").password("1234").build();
        User u5 = User.builder().userName("Rachel").password("1234").build();
        User u6 = User.builder().userName("Monica").password("1234").build();
        User u7 = User.builder().userName("Phoebe").password("1234").build();
        User u8 = User.builder().userName("Ross").password("1234").build();
        User u9 = User.builder().userName("Joey").password("1234").build();
        User u10 = User.builder().userName("Chandler").password("1234").build();

        ArtUtils.testTitle("Add Users");
        testUtils.printTestHeader("Add Users");
        userRepository.saveAll(Arrays.asList(u0, u1, u2, u3, u4, u5, u6, u7, u8, u9, u10));
        artUtils.printUsersTable();
        ArtUtils.printSeparator();

        CardGame g1 = CardGame.builder().flipCounter(26).state(GameState.Hard).userId(u0.getId()).build();
        CardGame g2 = CardGame.builder().flipCounter(28).state(GameState.Hard).userId(u1.getId()).build();
        CardGame g3 = CardGame.builder().flipCounter(29).state(GameState.Hard).userId(u2.getId()).build();
        CardGame g4 = CardGame.builder().flipCounter(30).state(GameState.Hard).userId(u3.getId()).build();
        CardGame g5 = CardGame.builder().flipCounter(35).state(GameState.Hard).userId(u4.getId()).build();
        CardGame g6 = CardGame.builder().flipCounter(25).state(GameState.Easy).userId(u5.getId()).build();
        CardGame g7 = CardGame.builder().flipCounter(22).state(GameState.Hard).userId(u6.getId()).build();
        CardGame g8 = CardGame.builder().flipCounter(30).state(GameState.Hard).userId(u7.getId()).build();
        CardGame g9 = CardGame.builder().flipCounter(35).state(GameState.Easy).userId(u8.getId()).build();
        CardGame g10 = CardGame.builder().flipCounter(25).state(GameState.Hard).userId(u9.getId()).build();
        CardGame g11 = CardGame.builder().flipCounter(22).state(GameState.Easy).userId(u10.getId()).build();


        ArtUtils.testTitle("Add Games");
        testUtils.printTestHeader("Add Games");
        cardGameRepository.saveAll(Arrays.asList(g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11));
        artUtils.printGameTable();
        ArtUtils.printSeparator();


        u0 = userRepository.findById(u0.getId()).get();
        u1 = userRepository.findById(u1.getId()).get();
        u2 = userRepository.findById(u2.getId()).get();
        u3 = userRepository.findById(u3.getId()).get();
        u4 = userRepository.findById(u4.getId()).get();
        u5 = userRepository.findById(u5.getId()).get();
        u6 = userRepository.findById(u6.getId()).get();
        u7 = userRepository.findById(u7.getId()).get();
        u8 = userRepository.findById(u8.getId()).get();
        u9 = userRepository.findById(u9.getId()).get();
        u10 = userRepository.findById(u10.getId()).get();

        u0.getCardGameList().add(g1);
        u1.getCardGameList().add(g2);
        u2.getCardGameList().add(g3);
        u3.getCardGameList().add(g4);
        u4.getCardGameList().add(g5);
        u5.getCardGameList().add(g6);
        u6.getCardGameList().add(g7);
        u7.getCardGameList().add(g8);
        u8.getCardGameList().add(g9);
        u9.getCardGameList().add(g10);
        u10.getCardGameList().add(g11);

        ArtUtils.testTitle("Add Games To User");
        testUtils.printTestHeader("Add Games To User");
        userRepository.saveAllAndFlush(Arrays.asList(u0, u1, u2, u3, u4, u5, u6, u7, u8, u9, u10));
        artUtils.printGameTable();
        ArtUtils.printSeparator();

    }
}
