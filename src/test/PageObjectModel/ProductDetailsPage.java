package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailsPage {
    WebDriver driver;
    public By quantityTextbox = By.id("quantity_wanted");

    public ProductDetailsPage(WebDriver driver){
        this.driver=driver;
    }

   public void  wait_until_quantity_textbox_is_displayed()
    {
        new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.presenceOfElementLocated(quantityTextbox));
    }

    public void click_and_enter_quantity(String quantityValue)
    {
        driver.findElement(quantityTextbox).sendKeys(quantityValue);
    }
}
