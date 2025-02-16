package org.example;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameLibraryService {
    private final List<Game> games = new ArrayList<>();

    public void addGame(String title, String genre, double price) {
        Game game = new Game(title, genre, price);
        games.add(game);
        System.out.println("Добавлена игра: " + game);
    }

    public void showLibrary() {
        if (games.isEmpty()) {
            System.out.println("Библиотека игр пуста!");
        } else {
            System.out.println("Ваша библиотека игр:");
            for (Game game : games) {
                System.out.println(game);
            }
        }
    }
}
