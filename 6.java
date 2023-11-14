import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ButtonColorTest {

    @Test
    public void checkButtonColorOnHover() {
        Configuration.startMaximized = true;

        // Открытие страницы настроек пользователя
        open("https://angular.realworld.io/settings");

        // Получение текущего цвета кнопки
        String originalColor = $(".logout").getCssValue("background-color");

        // Наведение на кнопку и проверка цвета после наведения
        $(".logout").hover();
        String hoveredColor = $(".logout").getCssValue("background-color");

        // Проверка, что цвет изменился после наведения
        assert !originalColor.equals(hoveredColor) : "Цвет кнопки не изменился при наведении";

        // Проверка, что цвет после наведения соответствует ожидаемому цвету #b85c5c или rgb(184,92,92)
        assert hoveredColor.equals("rgb(184, 92, 92)") || hoveredColor.equals("#b85c5c") : "Цвет кнопки не соответствует ожидаемому";

    }
}
