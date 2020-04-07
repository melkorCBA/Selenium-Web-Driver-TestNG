import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class Shoes extends WebConnect {

    String url="https://www.ebay.com/b/Shoes/bn_7000259122";
    String pageTitle ="Shoes products for sale | eBay";





    //case 1 - launch chrome & case 2 - navigate to ebay
    @BeforeTest
    public void navigateShoes(){
        driver.navigate().to(url);

    }
    @BeforeMethod
    public void loadDelay(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }




    @Test(priority = 3)
    public void selectMensShoes(){
        String xpathMenShoes="//a[contains(text(),\"Men's Shoes\")]";
        driver.findElement(By.xpath(xpathMenShoes)).click();
        //set page title
        pageTitle="Men's Shoes for sale | eBay";
    }



}
