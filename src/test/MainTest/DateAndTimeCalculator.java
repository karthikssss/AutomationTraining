package MainTest;

import Pages.CustomScreen;
import Pages.LaunchScreen;
import Pages.SignInPopUp;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DateAndTimeCalculator {
    ChromeDriver driver;
    LaunchScreen launchScreen;
    SignInPopUp signInPopUp;
    WebDriverWait wait;
    CustomScreen customScreen;

    @BeforeSuite
    public void triggerSetUp()
    {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        launchScreen= new LaunchScreen(driver);
        signInPopUp= new SignInPopUp(driver);
        customScreen= new CustomScreen(driver);
        wait= new WebDriverWait(driver, Duration.ofSeconds(45));


    }



    @Test
    public void dateAndTimeCalculator() throws InterruptedException {
          driver.navigate().to("https://www.timeanddate.com/custom/");
        driver.manage().timeouts().pageLoadTimeout(45,TimeUnit.MILLISECONDS);
        customScreen.wait_until_sign_in_button_is_displayed();
        customScreen.click_on_sign_in_button();
        signInPopUp.wait_until_the_username_textbox_is_visible();
        signInPopUp.enter_and_type_username("pradaptt@mailinator.com");
        signInPopUp.enter_and_type_password("V#e!sAHZL9xBYv7");
        signInPopUp.click_on_signIn_Button();
        customScreen.wait_until_logout_link_is_displayed();
        customScreen.click_on_logout_link();
        customScreen.wait_until_sign_in_button_is_displayed();

    }

    @AfterSuite
    public void closeDriver()
    {
        driver.quit();
    }


}
