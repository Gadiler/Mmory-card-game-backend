package com.memorygameback.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "games")
@Builder
public class CardGame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int flipCounter;
    @Enumerated(EnumType.ORDINAL)
    private GameState state;
    private int userId;
}
