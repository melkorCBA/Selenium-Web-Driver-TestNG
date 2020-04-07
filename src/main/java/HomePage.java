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

public class HomePage extends WebConnect{
    String url="https://www.ebay.com/";
    String pageTitle="Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";




    //case 1 - launch chrome & case 2 - navigate to ebay
    @BeforeTest
    public void NavigateHome(){
        driver.navigate().to(url);
    }




    //verify page title
    @BeforeMethod
    public void verifyPageTitle() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String expectedTitle = pageTitle;
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    // case 3 - Get the page URL and verify if it is the correct page that is opened
    @Test(priority = 0)
    public void verifyHomepageURL(){
        String expectedTitle=url;
        String actualTitle=driver.getCurrentUrl();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    //case 4 - Select “Shop by Category” drop down box
    @Test(priority = 1)
    public void selectShopCategory(){
        driver.findElement(By.id("gh-shop-a")).click();
    }

    //case 5 - In the “Fashion Category”, select “Shoes”
    @Test(priority = 2)
    public void selectShoes(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('gh-sbc-o').style.display='block';");
        String xpathShoes="//a[@class='scnd'][contains(text(),'Shoes')]";
        driver.findElement(By.xpath(xpathShoes)).click();
        //set page title
        pageTitle="Shoes products for sale | eBay";
        url="https://www.ebay.com/b/Shoes/bn_7000259122";

    }


}
