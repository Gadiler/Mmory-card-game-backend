package com.memorygameback.services.implementation;

import com.memorygameback.accessingdatajpa.CardGameRepository;
import com.memorygameback.accessingdatajpa.UserRepository;
import com.memorygameback.beans.CardGame;
import com.memorygameback.beans.User;
import com.memorygameback.exceptions.ExistException;
import com.memorygameback.services.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final String TAG = this.getClass().getSimpleName();
    private final UserRepository userRepository;
    private final CardGameRepository cardGameRepository;
    private int lastUserId;

    @Override
    public boolean login(String userName, String password) {
        for (User user : this.userRepository.findAll()) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                this.lastUserId = user.getId();
                return true;
            }
        }
        User u = User.builder().userName(userName).password(password).build();
        userRepository.saveAndFlush(u);
        this.lastUserId = u.getId();
        return true;
    }

    @Override
    public void addGameToUser(CardGame cardGame) {
        User u = null;
        try {
            u = userRepository.findById(lastUserId).orElseThrow(() -> new ExistException("The user doesn't exist!"));
            u.getCardGameList().add(cardGame);
            userRepository.saveAndFlush(u);
        } catch (ExistException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public List<CardGame> getAllGames() {
        User u = null;
        try {
            u = userRepository.findById(lastUserId).orElseThrow(() -> new ExistException("The user doesn't exist!"));
            return u.getCardGameList();
        } catch (ExistException e) {
            System.err.println(e.getMessage());
        }
//      TODO: change to new ArrayList<>();
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void syncHighestScore() {
        for (User user : userRepository.findAll()) {
            for (CardGame game : user.getCardGameList()) {
                if (game.getFlipCounter() > user.getHighestScore()) {
//                    System.out.println(game.getFlipCounter());
                    user.setHighestScore(game.getFlipCounter());
                    System.out.println(user.getHighestScore());
                }
            }
            userRepository.saveAndFlush(user);
        }
    }

    @Override
    public int getHighestScore() {
        return userRepository.findById(lastUserId).get().getHighestScore();
    }

    @Override
    public void setHighestScore(int score) {
        User u = null;
        if (userRepository.findById(lastUserId).isPresent()) {
            u = userRepository.findById(lastUserId).get();
            u.setHighestScore(score);
            userRepository.saveAndFlush(u);
        }
    }
}
