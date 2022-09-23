package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LaunchPage {
    public By itemNameLink =By.xpath("//a[@title='Blouse' and @class='product-name']");

    WebDriver driver;

    public LaunchPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void wait_until_purchase_image_is_displayed()
    {
         new WebDriverWait(driver, Duration.ofSeconds(30))
                 .until(ExpectedConditions.presenceOfElementLocated(itemNameLink));
    }

    public void click_on_item_name_blouse()
    {
        driver.findElement(itemNameLink).click();

    }

    public void click_on_item_name(String itemName)
    {
        driver.findElement(By.name(itemName)).click();
    }


}
