package com.memorygameback.accessingdatajpa;

import com.memorygameback.beans.CardGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardGameRepository extends JpaRepository<CardGame, Integer> {
}
