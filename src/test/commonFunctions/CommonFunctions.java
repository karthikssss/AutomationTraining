package commonFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonFunctions {
    WebDriver driver;
    WebDriverWait wait;
    public CommonFunctions(WebDriver driver)
    {
        this.driver=driver;
    }

    public void wait_until_the_element_is_visible(By elementName)
    {
          wait= new WebDriverWait(driver, Duration.ofSeconds(45));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementName));

    }

}
