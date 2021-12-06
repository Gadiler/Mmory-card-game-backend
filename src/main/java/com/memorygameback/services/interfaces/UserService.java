package com.memorygameback.services.interfaces;

import com.memorygameback.beans.CardGame;
import com.memorygameback.beans.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    boolean login(String userName, String password);
    void addGameToUser(CardGame cardGame);
    List<CardGame> getAllGames();
    List<User> getAllUsers();
    void syncHighestScore();
    int getHighestScore();
    void setHighestScore(int score);
}
