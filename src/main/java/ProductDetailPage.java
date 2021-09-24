import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    By addToCartButtonLocator = By.id("add-to-basket");

//    By closeAddLocator = new By.ByClassName("wis-clsbtn-125813");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocator);
    }

//   Reklamlar için;
//    public void closeAdd() {
//        if (isDisplayed(closeAddLocator)){
//            click(closeAddLocator);
//        }
//    }

    public void addToCart() {
            click(addToCartButtonLocator);

    }


}
