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


public class TestEbay {
    String url="https://www.ebay.com/";
    String driverPath="\\Resources\\chromedriver.exe";
    WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor)driver;
    String pageTitle="Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay";




    //case 1 - launch chrome & case 2 - navigate to ebay
    @BeforeTest
    public void launchBrowser(){
        System.out.println("launching browser");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+driverPath);
        driver= new ChromeDriver();
        driver.navigate().to(url);
    }




   //verify page title
   @BeforeMethod
    public void verifyPageTitle() {
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
        pageTitle="Shoes products for sale | eBay";

    }

    //case 6 -  Click on “Men’s Shoes” link from the “Shop by Category”
    @Test(priority = 3)
    public void selectMensShoes(){
        String xpathMenShoes="//a[contains(text(),\"Men's Shoes\")]";
        driver.findElement(By.xpath(xpathMenShoes)).click();
        pageTitle="Men's Shoes for sale | eBay";
    }

    //case 7 - Select the “Size” as 9
    @Test(priority = 4)
    public void selectSize(){
        String xpathSize="/html[1]/body[1]/div[3]/div[4]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[1]/div[1]/li[1]/ul[1]/li[7]/div[1]/a[1]/input[1]";
        driver.findElement(By.xpath(xpathSize)).click();
        pageTitle="Men's Shoes in Size:9 | eBay";
        //case 8 - Print the Title in console & case 9 Get the Title Length and print in console
        System.out.println(driver.getTitle()+ " Length - "+driver.getTitle().length());
    }

    //case 10 - Select Buy It Now
    @Test(priority = 5)
    public void selectBuyItNow(){
        String xpathBuyItNOw="//h2[contains(text(),'Buy It Now')]";
        driver.findElement(By.xpath(xpathBuyItNOw)).click();
    }


}
