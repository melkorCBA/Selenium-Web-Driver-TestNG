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


public class MensShoes extends  WebConnect{

    String url="https://www.ebay.com/b/Mens-Shoes/93427/bn_61999";
    String pageTitle="Men's Shoes for sale | eBay";


    @BeforeTest
    public void navigateMensShoes(){
        driver.navigate().to(url);
    }

    @BeforeMethod
    public void loadDelay(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    //case 7 - Select the “Size” as 9
    @Test(priority = 0)
    public void selectSize(){
        String xpathSize="/html[1]/body[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[1]/div[1]/li[3]/ul[1]/li[4]/div[1]/a[1]/input[1]";
     //   String ids="w_1573721987946_cbx";
        driver.findElement(By.xpath(xpathSize)).click();
        //set page title
        pageTitle="Men's Shoes in Size:9 | eBay";
        //case 8 - Print the Title in console & case 9 Get the Title Length and print in console
        System.out.println(driver.getTitle()+ " Length - "+driver.getTitle().length());
    }

    //case 10 - Select Buy It Now
    @Test(priority = 1)
    public void selectBuyItNow(){
        String xpathBuyItNOw="//h2[contains(text(),'Buy It Now')]";
        driver.findElement(By.xpath(xpathBuyItNOw)).click();
    }


}
