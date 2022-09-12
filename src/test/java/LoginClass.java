import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;


public class LoginClass {
ChromeDriver driver;
WebDriverWait wait;
    @BeforeSuite
    public void settingUpDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));    }


    @BeforeMethod()
        public void launchURL()
    {
        driver.get("https://www.zoomcar.com/in/bangalore");
    }
        @Test(priority = 1)
        public void searchForMadivala()
    {

        driver.findElement(By.xpath("//div[contains(text(),'Pick Up City, Airport, Address or Hotel')]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("origin")));
        driver.findElement(By.id("origin")).sendKeys("Madivala");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//p[@class='ellipsis']")));

        List<WebElement> options = driver.findElements(By. xpath("//p[@class='ellipsis']"));

        for (WebElement opt : options) {
            if (opt.getText().equals("Madivala, Karnataka, India")) {
                opt.click();
            }
        }
    }

    @Test(priority = 2)
    public void searchForKempagowda()
    {

        driver.findElement(By.xpath("//div[contains(text(),'Pick Up City, Airport, Address or Hotel')]")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("origin")));
        driver.findElement(By.id("origin")).sendKeys("kempagowda");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//p[@class='ellipsis']")));
        List<WebElement> options = driver.findElements(By. xpath("//p[@class='ellipsis']"));

        for (WebElement opt : options) {
            if (opt.getText().equals("            Hunachur, Karnataka, India")) {
                opt.click();
            }
        }
    }

    @AfterSuite
    public void closeBrowser() {
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }}




