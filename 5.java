import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationAndArticleAutomationTest {

    @Test
    public void registerUserAndCreateArticle() {
        Configuration.startMaximized = true;

        // Регистрация пользователя
        open("https://angular.realworld.io");
        $(byText("Sign Up")).click();
        $("#signup input[type='email']").setValue("your_email@example.com");
        // Заполните остальные поля для регистрации
        // Нажмите кнопку регистрации

        // Создание статьи
        $(byText("New Article")).click();
        $("#editor input[placeholder='Article Title']").setValue("Title of the Article");
        // Заполните остальные поля для статьи
        $(byText("Publish Article")).click();

        // Проверка успешной публикации статьи
        $(".banner").shouldHave(text("Article was successfully published!"));

        // Дополнительные проверки, если необходимо
    }
}
