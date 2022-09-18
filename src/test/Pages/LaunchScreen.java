package Pages;

import commonFunctions.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LaunchScreen {
    public By signInIcon=By.xpath("//span[contains(text(),'My Account')]");
    public By ProfileIcon=By.xpath("//li[@class='site-nav__menu site-nav__menu--my-account']");

    WebDriver driver;
    WebDriverWait wait;
    CommonFunctions commonFunctions = new CommonFunctions(driver);

    public LaunchScreen(WebDriver driver)
    {
        this.driver=driver;
    }
    public void click_on_profile_icon()
    {
        driver.findElement(signInIcon).click();
    }
    public void wait_until_profile_icon_is_visible()
    {
//        commonFunctions.wait_until_the_element_is_visible(signInIcon);
    }

    public void click_on_sign_in_Button() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(signInIcon));
        element.click();
//        driver.findElement(signInIcon).click();
    }
}
