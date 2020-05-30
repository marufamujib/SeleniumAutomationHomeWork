package amazon3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Find out Shipping Rates & Times
public class TestCase23 {
    public static void main(String[] args) throws InterruptedException {
        // Set the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver\\windows\\geckodriver.exe");
        // creating a object of Firefox Driver class
        WebDriver driver = new FirefoxDriver();
        //Open the Chrome browser and Nevigate to url
        driver.navigate().to("http:/www.amazon.com");
        // Maximize the browser window.
        driver.manage().window().maximize();
        //wait for 5 seconds
        Thread.sleep(5000);
        //Click on Customer Service link to open it
        driver.findElement(By.linkText("Customer Service")).click();
        //wait for 2 sec
        Thread.sleep(2000);
        //click on Shipping Policies
        driver.findElement(By.cssSelector("#category-section > li:nth-child(6) > a")).click();
        Thread.sleep(2000);
        //click on shipping rates and time
        driver.findElement(By.linkText("Shipping Rates & Times")).click();

    }

}
