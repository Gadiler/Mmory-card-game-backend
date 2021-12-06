package com.memorygameback.beans;

public enum GameState {
    Hard(0),
    Easy(1);

    private final int state;

    GameState(int state) {
        this.state = state;
    }

    public int getState(){return state;}
}
