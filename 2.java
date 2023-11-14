import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class UserSettingsTest {

    @Test
    public void verifyUserEmailInSettings() {
        Configuration.startMaximized = true;

        // Регистрация пользователя
        open("https://angular.realworld.io");
        $(byText("Sign Up")).click();
        $("#signup input[type='email']").setValue("alisherabdullaev0102@gmail.com");
        // Заполните остальные поля для регистрации
        // Нажмите кнопку регистрации

        // Проверка email в настройках пользователя
        open("https://angular.realworld.io/settings");
        $("#settings input[type='email']").shouldHave(value("alisherabdullaev0102@gmail.com"));
    }
}
