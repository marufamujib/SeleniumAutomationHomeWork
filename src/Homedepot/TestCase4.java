package Homedepot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Search for Charcoal Grill and add to the cart
public class TestCase4 {

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
        //Click on search text bar and pass key value
        driver.findElement(By.cssSelector("#headerSearch")).sendKeys("Charcoal grill");
        //click on search button
        driver.findElement(By.id("headerSearchButton")).click();
        //Click on Char-Griller smokin' grill
        driver.findElement(By.xpath("//*[@id=\"products\"]/div/div[2]/div/div[3]/div[1]/a")).click();
        //Click on Add to Cart button
        driver.findElement(By.xpath("//*[@id=\"atc_pickItUp\"]/span")).click();
        //Click on I will pick up
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[4]/div/div[2]/button")).click();


    }
}
