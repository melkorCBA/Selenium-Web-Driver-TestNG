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

public class AddToCart extends WebConnect{
    String url="https://www.ebay.com/itm/Mens-Womens-Authentic-Classic-Athletic-Sneakers-Low-High-Top-Casual-Canvas-Shoes/333368047501?hash=item4d9e48b78d:m:myzxFIzC5xxWe8PBrIRqpjw&var=542417511939";
    String itemPrice;

    @BeforeTest
    public void navigateCart(){
        driver.navigate().to(url);
        String xpathFirstItemPrice="//span[@id='prcIsum']";
        itemPrice=driver.findElement(By.xpath(xpathFirstItemPrice)).getText();;
        String xpathAddToCart="//a[@id='isCartBtn_btn']";
        driver.findElement(By.xpath(xpathAddToCart)).click();

    }

    @BeforeMethod
    public void loadDelay(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //case 17 -  Verify the No of Items added in the “Go to Checkout” box
    @Test(priority = 0)
    public void verifyNoOfItems(){
        String xpathNoOfItems="/html[1]/body[1]/div[4]/div[1]/div[4]/div[1]/table[1]/tr[1]/td[1]/span[1]/span[1]";
        String noOfItems= driver.findElement(By.xpath(xpathNoOfItems)).getText();
        int items=noOfItems.indexOf(')')-noOfItems.indexOf('(');
        Assert.assertEquals(items,2);
        Assert.assertEquals( Character.getNumericValue(noOfItems.charAt(noOfItems.indexOf('(')+1)) ,1);

    }
    //case 18 - Verify the Item Price in the “Go to Checkout” box.
    @Test(priority = 1)
    public void verifyItemPrice(){
        String xpathItemPrice="/html[1]/body[1]/div[4]/div[1]/div[4]/div[1]/table[1]/tr[1]/td[2]/span[1]/span[1]";
        String newItemPrice=driver.findElement(By.xpath(xpathItemPrice)).getText();
        Assert.assertEquals(newItemPrice,itemPrice);
    }

    @Test(priority = 2)
    public void clickSignIn(){
        String xpathSignIn="/html[1]/body[1]/div[3]/header[1]/div[1]/ul[1]/li[1]/span[1]/a[1]";
        driver.findElement(By.xpath(xpathSignIn)).click();
    }
}
