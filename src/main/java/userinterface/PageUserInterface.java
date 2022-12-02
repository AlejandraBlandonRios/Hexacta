package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.hexacta.com/")
public class PageUserInterface extends PageObject {
    public static final Target SEARCH_BUTTON = Target.the("Search button").
            located(By.className("searchbox"));
    public static final Target SEARCH_FIELD = Target.the("Search field").
            located(By.className("search-field"));
    public static final Target TEXT_EXPECTED = Target.the("Text expected").
            located(By.xpath("//*[@id='search-results']/div/div/div/div[1]/article[4]/div/h3/a"));

}
