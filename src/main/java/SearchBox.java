import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage {
    By searchBoxLocator = new By.ByClassName("sc-4995aq-0");
    By submitButtonLocator = new By.ByClassName("qjixn8-0");

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator,text);
        click(submitButtonLocator);
    }
}
