import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    By productNameLocator = new By.ByClassName("title-link");
//    By productValueLocator = By.id("strong.extra-discounted");

    public CartPage(WebDriver driver) {
        super(driver);
    }

//    private List<WebElement> getProducts(){
//        return findAll(productNameLocator);
//    }
//
//    public boolean checkIfProductAdded() {
//        return getProducts().size()>0;
//    }

  //  public boolean checkIfProductValuesSame() {
  //      return productValueLocator =
    // }
}
