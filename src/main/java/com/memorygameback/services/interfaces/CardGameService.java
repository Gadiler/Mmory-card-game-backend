package com.memorygameback.services.interfaces;

import com.memorygameback.beans.CardGame;
import com.memorygameback.beans.GameState;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CardGameService {
    List<CardGame> getAllGames();
    GameState getGameState(int gameId);
    int getFlipCounter(int gameId);
}
