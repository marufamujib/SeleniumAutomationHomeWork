package TDBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Open Small Business link
public class TestCase8 {

    public static void main(String[] args) throws InterruptedException {
        // Set the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver\\windows\\geckodriver.exe");
        // creating a object of Firefox Driver class
        WebDriver driver = new FirefoxDriver();
        //Open the Chrome browser and Nevigate to TD Bank url
        driver.navigate().to("http:/www.td.com");
        // Maximize the window size.
        driver.manage().window().maximize();
        //click on Small Business
        driver.findElement(By.linkText("Small Business")).click();

    }
}
