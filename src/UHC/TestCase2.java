package UHC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Test Case:Expand the Insurance button
public class TestCase2 {
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
        //Click on Insurance button to expand it
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/header/div/div/div[1]/div[1]/div[2]/div[1]/div/nav/ul/li[2]/button")).click();



    }


}
