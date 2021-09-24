import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


public class Test_Add_Product_To_Cart extends BaseTest {
    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void search_a_product(){
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.acceptCookies();
        homePage.searchBox().search("Bilgisayar");

        Assertions.assertTrue(productsPage.isOnProductPage(),
                "Not on products page!");

    }
    @Test
    @Order(2)
    public void change_page(){
        productsPage.changePage(2);
        Assertions.assertTrue(productsPage.HasPageChanged(),
                "Product page has not changed!");
    }
    @Test
    @Order(3)
    public void select_a_product(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct();
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
                "Not on product detail page!");
    }
    @Test
    @Order(4)
    public void add_product_to_cart(){
//        productDetailPage.closeAdd(); Bazen reklam sepet buttonu onune gelebiliyor.
        productDetailPage.addToCart();
    }
    @Test
    @Order(5)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
//        Assertions.assertTrue(cartPage.checkIfProductAdded(),
//                "Product was not added to cart!");
//        Assertions.assertTrue(cartPage.checkIfProductValuesSame(),
//                "Product values in the Cart and the Detail Page are not the Same!");
    }




}
