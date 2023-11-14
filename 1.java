import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;

public class ArticlePreviewTest {

    @Test
    public void verifyArticlePreviewsCount() {
        Configuration.startMaximized = true;
        open("https://angular.realworld.io");
        $$(byAttribute("data-cy", "article-preview")).shouldHaveSize(12);
    }
}
