# Steam Game Library (Spring + Git)

## 📌 Описание проекта
Этот проект представляет собой простую библиотеку игр, реализованную на **Spring Framework (без Spring Boot)**. Пользователь может добавлять, удалять и просматривать игры в своей коллекции.

## 🚀 Технологии
- Java 21
- Spring Framework (Core, Context, Beans)
- Maven
- Git и GitHub

## 📂 Структура проекта
```
src/
├── main/
│   ├── java/org/example/
│   │   ├── Main.java  # Главный класс
│   │   ├── AppService.java  # Логика работы приложения
│   │   ├── GameLibraryService.java  # Управление библиотекой игр
│   │   ├── NotificationService.java  # Уведомления пользователю
│   ├── resources/
```

## ⚙️ Установка и запуск
1. **Склонируй репозиторий:**
   ```sh
   git clone https://github.com/твой-логин/steam-library.git
   cd steam-library
   ```
2. **Собери проект:**
   ```sh
   mvn clean install
   ```
3. **Запусти приложение:**
   ```sh
   mvn compile
   java -cp target/classes org.example.Main
   ```

## 🛠 Основные классы
- **`Main.java`** — точка входа, загружает Spring-контекст.
- **`GameLibraryService.java`** — управление списком игр.
- **`AppService.java`** — взаимодействие с пользователем.
- **`NotificationService.java`** — уведомления.

## 📝 Примеры использования
```java
GameLibraryService library = context.getBean(GameLibraryService.class);
library.addGame("Counter-Strike 2");
library.listGames();
```

## 🔗 Git и коммиты
- `git init` — инициализация репозитория
- `git add .` — добавление файлов
- `git commit -m "Initial commit"` — первый коммит
- `git push origin main` — загрузка на GitHub
