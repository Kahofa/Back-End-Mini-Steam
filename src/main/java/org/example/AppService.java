package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class AppService {
    private final GameLibraryService gameLibraryService;
    private final NotificationService notificationService;
    private final Scanner scanner = new Scanner(System.in);

    @Autowired
    public AppService(GameLibraryService gameLibraryService, NotificationService notificationService) {
        this.gameLibraryService = gameLibraryService;
        this.notificationService = notificationService;
    }

    public void run() {
        System.out.println("Добро пожаловать в вашу игровую библиотеку!");

        while (true) {
            System.out.println("1)Добавить игру");
            System.out.println("2)Показать библиотеку");
            System.out.println("3)Выйти");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addGameFromInput();
                    break;
                case 2:
                    gameLibraryService.showLibrary();
                    break;
                case 3:
                    System.out.println("Выход из библиотеки. До встречи!");
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }

    private void addGameFromInput() {
        System.out.print("\nВведите название игры: ");
        String title = scanner.nextLine();

        System.out.print("Введите жанр игры: ");
        String genre = scanner.nextLine();

        System.out.print("Введите цену игры (в USD): ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        gameLibraryService.addGame(title, genre, price);
        notificationService.sendNotification("Добавлена новая игра: " + title);
    }
}
