import org.example.AppService;
import org.example.GameLibraryService;
import org.example.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    @Bean
    public GameLibraryService gameLibraryService() {
        return new GameLibraryService();
    }

    @Bean
    public NotificationService notificationService() {
        return new NotificationService();
    }

    @Bean
    public AppService appService(GameLibraryService gameLibraryService, NotificationService notificationService) {
        return new AppService(gameLibraryService, notificationService);
    }
}
