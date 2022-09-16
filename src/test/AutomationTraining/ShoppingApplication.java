package AutomationTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;

import java.time.Duration;
import java.util.List;

public class ShoppingApplication {
    ChromeDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void settingUpDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void launchURl() {
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void searchForProduct() {


        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search_query_top")));
        driver.findElement(By.id("search_query_top")).sendKeys("Faded Short Sleeve T-shirts");
        driver.findElement(By.name("submit_search")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='View a top sellers products']")));
        List<WebElement> price = driver.findElements(By.xpath("//span[@class='price']"));
        for (WebElement priceTag : price) {
            System.out.println("Prices are " + priceTag.getText());
        }

        List<WebElement> price1 = driver.findElements(By.xpath("//a[@class='product-name']"));
        for (WebElement priceTag : price1) {
            System.out.println("Product Name " + priceTag.getText());
        }

        Assert.assertEquals(driver.findElement(By.xpath("//a[@title='View a top sellers products']")).getText(), "TOP SELLERS");


    }

    @AfterSuite
    public void closeBrowser() {
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
