package org.example;

public class Game {
    private final String title;
    private final String genre;
    private final double price;

    public Game(String title, String genre, double price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Название игры" + title + " | Жанр: " + genre + " | Цена: " + price + " USD";
    }
}
