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


public class FirstItem extends WebConnect{

    String url="https://www.ebay.com/itm/Mens-Womens-Authentic-Classic-Athletic-Sneakers-Low-High-Top-Casual-Canvas-Shoes/333368047501?hash=item4d9e48b78d:m:myzxFIzC5xxWe8PBrIRqpjw&var=542417511939";


    String pageTitle="Men's Shoes in Size:9 | eBay";
    String name;
    String newName;
    String price;
    String newPrice;

    @BeforeTest
    public void navigateFirstItem(){

        driver.navigate().to(url);
        String xpathFirstItem="//h1[@id='itemTitle']";
        String xpathFirstItemPrice="//span[@id='prcIsum']";
        name=newName= driver.findElement(By.xpath(xpathFirstItem)).getText();
        price=newPrice=driver.findElement(By.xpath(xpathFirstItemPrice)).getText();

    }

    @BeforeMethod
    public void loadDelay(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //case 14 - Assert the ‘Condition’ of the Shoe(should not be empty) and print in console
    @Test (priority = 0)
    public void conditionIsEmpty(){
        String xpathCondtion="//div[@id='vi-itm-cond']";
        String condtion=driver.findElement(By.xpath(xpathCondtion)).getText();
        Assert.assertNotNull(condtion);
        System.out.println(condtion);
    }

    //case 15 - Assert the shipping charges (Element should be displayed)and print in console
    @Test(priority = 1)
    public void shippingChargersVisible(){
        String xpathShippingChargers="//span[contains(text(),'FREE')]";
        String shippingChargers=driver.findElement(By.xpath(xpathShippingChargers)).getText();
        Assert.assertNotNull(shippingChargers);
        System.out.println(shippingChargers);

    }

    //case 16 - Click on ‘Add to cart’ button
    @Test(priority = 2)
    public void clickAddToCart(){
        String xpathAddToCart="//a[@id='isCartBtn_btn']";
        driver.findElement(By.xpath(xpathAddToCart)).click();
    }


}
