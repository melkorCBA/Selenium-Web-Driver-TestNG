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

import java.util.concurrent.TimeUnit;

public class SignIn extends WebConnect{
    String url="https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fcart.payments.ebay.com%2F";

    @BeforeTest
    public void navigateFirstItem(){

        driver.navigate().to(url);
    }

    @BeforeMethod
    public void loadDelay(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    @Parameters({"email","password"})
    public void TypeUserCredentials(String email, String password){
        String xpathEmail="/html[1]/body[1]/div[6]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/span[1]/span[1]/input[1]";
       driver.findElement(By.xpath(xpathEmail)).sendKeys(email);
       String xpathPassword="/html[1]/body[1]/div[6]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]";
        driver.findElement(By.xpath(xpathEmail)).sendKeys(password);
    }




}
