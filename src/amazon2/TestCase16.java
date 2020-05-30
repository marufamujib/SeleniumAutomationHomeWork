package amazon2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//select disposable hand gloves and add in cart
public class TestCase16 {
    public static void main(String[] args) throws InterruptedException {
        // Setting the Browser driver properties
        System.setProperty("webdriver.chrome.driver", "BrowserDriver\\windows\\chromedriver.exe");
        // creating a object of Chrome Driver class
        WebDriver driver = new ChromeDriver();
        //Open the Chrome browser and Nevigate to amazon url
        driver.navigate().to("http:/www.amazon.com");
        // Maximize the window size.
        driver.manage().window().maximize();
        // wait for 3 seconds
        Thread.sleep(3000);
        //Enter keyword(hand gloves disposable) in searchbox
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("hand gloves disposable");
        //Click on search button
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        //Click on Powder Free Disposable Gloves 100 Pcs Medium
        driver.findElement(By.xpath("//span[contains(text(),'Vinyl Gloves, Disposable Gloves, Comfortable, Powd')]")).click();
        //Add in cart
        driver.findElement(By.id("add-to-cart-button")).click();
    }

}
