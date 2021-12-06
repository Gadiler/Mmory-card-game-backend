package com.memorygameback.beans;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String password;
    private int highestScore;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Singular("oneGame")
    private List<CardGame> cardGameList = new ArrayList<>();
}
