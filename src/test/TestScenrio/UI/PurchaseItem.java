package TestScenrio.UI;

import PageObjectModel.LaunchPage;
import PageObjectModel.ProductDetailsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class PurchaseItem {

    ChromeDriver driver;
    WebDriverWait wait;
    LaunchPage launchPage;
    ProductDetailsPage productDetailsPage;

    @BeforeSuite
    public void settingUpDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        launchPage= new LaunchPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
    }
    @BeforeMethod
    public void launchURl() {
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void purchaseItemBlouse()
    {
        launchPage.wait_until_purchase_image_is_displayed();
        launchPage.click_on_item_name_blouse();
        productDetailsPage.wait_until_quantity_textbox_is_displayed();
        productDetailsPage.click_and_enter_quantity("10");
    }

    @Test
    public void purchaseItemTshirt()
    {
        launchPage.wait_until_purchase_image_is_displayed();
        launchPage.click_on_item_name("Tshirt");
        productDetailsPage.wait_until_quantity_textbox_is_displayed();
        productDetailsPage.click_and_enter_quantity("10");
    }


}
