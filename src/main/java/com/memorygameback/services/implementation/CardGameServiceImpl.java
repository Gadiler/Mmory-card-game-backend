package com.memorygameback.services.implementation;

import com.memorygameback.accessingdatajpa.CardGameRepository;
import com.memorygameback.beans.CardGame;
import com.memorygameback.beans.GameState;
import com.memorygameback.services.interfaces.CardGameService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardGameServiceImpl implements CardGameService {
    private final String TAG = this.getClass().getSimpleName();
    private final CardGameRepository cardGameRepository;

    @Override
    public List<CardGame> getAllGames() {
        return cardGameRepository.findAll();
    }

    @Override
    public GameState getGameState(int gameId) {
        CardGame cardGame = null;
        if (this.cardGameRepository.findById(gameId).isPresent())
            cardGame = this.cardGameRepository.findById(gameId).get();

        assert cardGame != null;
        return cardGame.getState();
    }

    @Override
    public int getFlipCounter(int gameId) {
        CardGame cardGame = null;
        if (this.cardGameRepository.findById(gameId).isPresent())
            cardGame = this.cardGameRepository.findById(gameId).get();

        assert cardGame != null;
        return cardGame.getFlipCounter();
    }
}
