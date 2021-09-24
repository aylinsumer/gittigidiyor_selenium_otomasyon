import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    By categoriesLocator =new By.ByClassName("sc-1tdlrg-0");
    By pageNumberLocator = new By.ByClassName("ubwpe");
    By productNameLocator = new By.ByClassName("dyekHG");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(categoriesLocator);
    }


    public void changePage(int i) {
        int a=1;
        while (a<i) {
            click(pageNumberLocator);
            a++;
        }
    }

    public boolean HasPageChanged() {
        return isDisplayed(pageNumberLocator);
    }

    public void selectProduct() {
        click(productNameLocator);
    }



}
