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


public class shoeSize extends  WebConnect{

    String url="https://www.ebay.com/b/Mens-Shoes/93427?rt=nc&Size=9";

    String pageTitle="Men's Shoes in Size:9 | eBay";
    String name;
    String newName;
    String price;
    String newPrice;


    @BeforeTest
    public void navigateShoeSize(){

        driver.navigate().to(url);
        String xpathFirstItem="//h3[contains(text(),'Mens Womens Authentic Classic Athletic Sneakers Lo')]";
        String xpathFirstItemPrice="//body[@class='no-touch skin-large flex-lg gh-1199 gh-flex']/div[@class='pagecontainer srp-main--isLarge']/div[contains(@class,'pagecontainer__center PR_right_wrap')]/div[@id='mainContent']/section[@id='w7']/ul[@class='b-list__items_nofooter']/li[@id='w7-items[0]']/div[@class='s-item__wrapper clearfix']/div[@class='s-item__info clearfix']/div[@class='s-item__details clearfix']/div[1]/span[1]";
        name=newName= driver.findElement(By.xpath(xpathFirstItem)).getText();
        price=newPrice=driver.findElement(By.xpath(xpathFirstItemPrice)).getText();
        //case 11 - Print First Shoe Name and Price in console
        System.out.println(name +" "+ price);
    }

    @BeforeMethod
    public void verify() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String expectedTitle = pageTitle;
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);


        Assert.assertEquals(newName,name);
        Assert.assertEquals(newPrice,price);

    }



    //case 10 - Select Buy It Now
    @Test(priority = 0)
    public void selectBuyItNow(){
        String xpathBuyItNOw="//h2[contains(text(),'Buy It Now')]";
        driver.findElement(By.xpath(xpathBuyItNOw)).click();
        //set new name and price
        String xpathFirstItem="//h3[contains(text(),'Mens Womens Authentic Classic Athletic Sneakers Lo')]";
        String xpathFirstItemPrice="//body[@class='no-touch skin-large flex-lg gh-1199 gh-flex']/div[@class='pagecontainer srp-main--isLarge']/div[contains(@class,'pagecontainer__center PR_right_wrap')]/div[@id='mainContent']/section[@id='w7']/ul[@class='b-list__items_nofooter']/li[@id='w7-items[0]']/div[@class='s-item__wrapper clearfix']/div[@class='s-item__info clearfix']/div[@class='s-item__details clearfix']/div[1]/span[1]";
        newName=driver.findElement(By.xpath(xpathFirstItem)).getText();
        newPrice=driver.findElement(By.xpath(xpathFirstItemPrice)).getText();
    }

    @Test(priority = 1)
    public void selectFirstPair(){
        String xpathFirstItem="//h3[contains(text(),'Mens Womens Authentic Classic Athletic Sneakers Lo')]";
        driver.findElement(By.xpath(xpathFirstItem)).click();
        //set new name and price
        newName=driver.findElement(By.xpath("//h1[@id='itemTitle']")).getText();
        newPrice=driver.findElement(By.xpath("//span[@id='prcIsum']")).getText();
        //set page title
        pageTitle="Mens Womens Authentic Classic Athletic Sneakers Low High Top Casual Canvas Shoes";


    }

}
