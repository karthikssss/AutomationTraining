package Pages;

import commonFunctions.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomScreen {
    WebDriver driver;
    public By signInButton=By.xpath("//a[contains(text(),'Sign In')]");
    public By signOutLink=By.id("my-out");


    public CustomScreen(WebDriver driver)
    {
        this.driver=driver;
    }

    public void click_on_sign_in_button()
    {
        driver.findElement(signInButton).click();
    }

    public void wait_until_logout_link_is_displayed()
    {
        new WebDriverWait(driver, Duration.ofMinutes(1)).until(
                ExpectedConditions.presenceOfElementLocated(signOutLink));
    }

    public void click_on_logout_link()
    {
        driver.findElement(signOutLink).click();
    }

    public void wait_until_sign_in_button_is_displayed()
    {
        new WebDriverWait(driver, Duration.ofMinutes(1)).until(
                ExpectedConditions.presenceOfElementLocated(signInButton));
    }

}
