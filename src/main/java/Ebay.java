//This Is a dummy class
//
// import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.util.concurrent.TimeUnit;
//
//
//public class Ebay {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resources\\chromedriver.exe");
////        create a new instance of chormeDriver
//        WebDriver driver= new ChromeDriver();
//
//        Actions builder = new Actions(driver);
//
//        //case 1 - launch chrome , case 2 - navigate to ebay
//        String url="https://www.ebay.com/";
//        driver.navigate().to(url);
//        // case 3 - Get the page URL and verify if it is the correct page that is opened
//        System.out.println(driver.getCurrentUrl());
//        if(!driver.getCurrentUrl().equals(url)){
//            System.out.println("URL Error !!");
//        }
//        else{
//            System.out.println("URL Matched !!");
//
//            //case 4 - Select “Shop by Category” drop down box
//            WebElement buttonCategory=driver.findElement(By.id("gh-shop-a"));
//            Actions action = new Actions(driver);
//            action.moveToElement(buttonCategory).click().perform();
//
//           String xpathShoes="/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/ul[3]/li[4]/a[1]";
////            System.out.println(driver.findElement(By.xpath(xpathShoes)));
//            //case 5 - In the “Fashion Category”, select “Shoes”
//            driver.findElement(By.xpath(xpathShoes)).click();
////            Action seriesOfActions = builder.moveToElement();
//
//            //case 6 -  Click on “Men’s Shoes” link from the “Shop by Category”
//            String xpathMenShoes="//a[contains(text(),\"Men's Shoes\")]";
//            driver.findElement(By.xpath(xpathMenShoes)).click();
//            //case 7 - Select the “Size” as 9
//            String xpathSize="/html[1]/body[1]/div[4]/div[4]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[1]/div[1]/li[3]/ul[1]/li[4]/div[1]/a[1]/span[1]";
//            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//            driver.findElement(By.xpath(xpathSize)).click();
//            //case 8 - Print the Title in console
//            String title=driver.getTitle();
//            System.out.println(title);
//            //case 9 - Get the Title Length and print in console
//            System.out.println(title.length());
//            //case 10 - Select Buy It Now
//            String xpathBuyItNOw="//h2[contains(text(),'Buy It Now')]";
//            driver.findElement(By.xpath(xpathBuyItNOw)).click();
//
//            //case 11 - Print First Shoe Name and Price in console
//            String xpathFirstItem="//h3[contains(text(),'Mens Womens Authentic Classic Athletic Sneakers Lo')]";
//            WebElement FirstItem=driver.findElement(By.xpath(xpathFirstItem));
//            //print name & price
//            String shoeName, shoePrice;
//            shoeName=FirstItem.getText();
//            String xpathFirstItemPrice="//body[@class='no-touch skin-large flex-lg gh-1199 gh-flex']/div[@class='pagecontainer srp-main--isLarge']/div[contains(@class,'pagecontainer__center PR_right_wrap')]/div[@id='mainContent']/section[@id='w7']/ul[@class='b-list__items_nofooter']/li[@id='w7-items[0]']/div[@class='s-item__wrapper clearfix']/div[@class='s-item__info clearfix']/div[@class='s-item__details clearfix']/div[1]/span[1]";
//            shoePrice=driver.findElement(By.xpath(xpathFirstItemPrice)).getText();
//            System.out.println(shoeName);
//            System.out.println(shoePrice);
//
//
//
//
//           //case 12 - Select the First shoe pair from the listed results
//            driver.findElement(By.xpath(xpathFirstItem)).click();
//
//            //verify
//            String newName=driver.findElement(By.xpath("//h1[@id='itemTitle']")).getText();
//            String newPrice=driver.findElement(By.xpath("//span[@id='prcIsum']")).getText();
//            //verifier
//            System.out.println("case 12"); verifier(shoeName,shoePrice,newName,newPrice);
//
//            //case 13 - Verify selected details in Add To Cart page [Name, Price]
//            //navigate to add to cart
//            driver.findElement(By.xpath("//a[@id='isCartBtn_btn']")).click();
//            //verify
//            newName=driver.findElement(By.xpath("//span[contains(text(),'Mens Womens Authentic Classic Athletic Sneakers Lo')]")).getText();
//            newPrice=driver.findElement(By.xpath("//span[contains(text(),'US $16.75')]")).getText();
//
//            System.out.println("case 13"); verifier(shoeName, shoePrice, newName, newPrice);
//
//
//        }
//
//
//
//
//
//
//    }
//
//    public static void verifier(String name1, String price1, String name2, String price2){
//        String verfifyName=(name1.equals(name2))? "Product Name verified !!" : "Product names do not match !!";
//        String verifyPrice=(price1.equals(price2))? "Product Price verified !!" : "Product price do not match !!";
//        System.out.println(verfifyName +"\n"+ verifyPrice);
//    }
//}
