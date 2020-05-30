package UHC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Test Case: Find All individual and family plans offered in UHC
public class TestCase4 {
    public static void main(String[] args) throws InterruptedException {
        // Set the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver\\windows\\geckodriver.exe");
        // creating a object of Firefox Driver class
        WebDriver driver = new FirefoxDriver();
        //Open the Chrome browser and Nevigate to UHC url
        driver.navigate().to("http:/www.uhc.com");
        // Maximize the browser window.
        driver.manage().window().maximize();
        //wait for 5 seconds
        Thread.sleep(5000);
        //Click on Find Your Plan button to check all available plans
        driver.findElement(By.cssSelector("#btn-banner")).click();
        //Thread.sleep(2000);
        //Click on All individual and family plans to explore it
        driver.findElement(By.linkText("All individual and family plans")).click();

    }
}
