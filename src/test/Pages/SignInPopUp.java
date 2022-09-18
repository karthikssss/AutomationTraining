package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPopUp {
    public By emailTextbox=By.id("email");
    public By passwordTextbox=By.id("password");
    public By popupSignInButton=By.id("create");

    WebDriver driver;
    WebDriverWait wait;
    public SignInPopUp(WebDriver driver)
    {
        this.driver=driver;
    }


    public void wait_until_the_username_textbox_is_visible()
    {
        new WebDriverWait(driver, Duration.ofSeconds(45)).until(
                ExpectedConditions.presenceOfElementLocated(emailTextbox));

    }

    public void enter_and_type_username(String emailValue)
    {
        driver.findElement(emailTextbox).sendKeys(emailValue);
    }

    public void enter_and_type_password(String passwordValue)
    {
        driver.findElement(passwordTextbox).sendKeys(passwordValue);
    }

    public void click_on_signIn_Button()
    {
        driver.findElement(popupSignInButton).click();
    }
}
