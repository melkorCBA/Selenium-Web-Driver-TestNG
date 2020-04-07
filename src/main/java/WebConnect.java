import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;


public class WebConnect {
    WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor)driver;
    String driverPath="\\Resources\\chromedriver.exe";

    @BeforeTest(alwaysRun = true)
    public void launchBrowser(){
        System.out.println("launching browser");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+driverPath);
        driver= new ChromeDriver();
    }

    @AfterTest
    public void terminateBrowser(){
        driver.close();
    }

}
