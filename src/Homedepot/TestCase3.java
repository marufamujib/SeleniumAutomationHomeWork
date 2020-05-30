package Homedepot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//Get all Patio Dinning get from outdoor furniture
public class TestCase3 {

    public static void main(String[] args) throws InterruptedException {
        // Set the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver\\windows\\geckodriver.exe");
        // creating a object of Firefox Driver class
        WebDriver driver = new FirefoxDriver();
        //Open the Chrome browser and Nevigate to url
        driver.navigate().to("http:/www.homedepot.com");
        // Maximize the browser window.
        driver.manage().window().maximize();
        //wait for 5 seconds
        Thread.sleep(5000);
        //Click on Home Decor & Furniture
        driver.findElement(By.linkText("All Departments")).click();
        //Click on Patio Furniture
        driver.findElement(By.linkText("Patio Furniture")).click();
        //click on Patio Dinning Sets
        driver.findElement(By.cssSelector("#sectionColumn6_thd_4e3b > h3 > a")).click();
    }
}
