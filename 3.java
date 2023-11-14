import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FavoriteArticleTest {

    @Test
    public void addArticleToFavoriteAndCheck() {
        Configuration.startMaximized = true;

        // Регистрация пользователя
        open("https://angular.realworld.io");
        $(byText("Sign Up")).click();
        $("#signup input[type='email']").setValue("alisherabdullaev0102@gmail.com");
        // Заполните остальные поля для регистрации
        // Нажмите кнопку регистрации

        // Добавление статьи в избранное
        open("https://angular.realworld.io");
        $(".preview").hover();
        $(".preview .ion-heart").click();

        // Переход в профиль и проверка избранных статей
        $(byText("Profile")).click();
        $(byText("My Favorites")).click();
        $(".article-preview").shouldHave(text("Title of the Article")); // Замените текст на актуальный заголовок добавленной статьи
    }
}
