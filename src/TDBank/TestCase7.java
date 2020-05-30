package TDBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Test Case: Open Foreign Exchange Services from services menu
public class TestCase7 {
    public static void main(String[] args) throws InterruptedException {
        // Set the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver\\windows\\geckodriver.exe");
        // creating a object of Firefox Driver class
        WebDriver driver = new FirefoxDriver();
        //Open the Chrome browser and Nevigate to TD Bank url
        driver.navigate().to("http:/www.td.com");
        // Maximize the window size.
        driver.manage().window().maximize();
        //click on Services to expand the drop down menu
        driver.findElement(By.cssSelector("#td-desktop-nav-dropdown-link-3")).click();
        Thread.sleep(2000);
        //Click on Foreign Exchange Services
        driver.findElement(By.linkText("Foreign Exchange Services")).click();


    }

}
