package TDBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Test Case:
public class TestCase3 {

    public static void main(String[] args) throws InterruptedException {
        // Set the Browser driver properties
        System.setProperty("webdriver.chrome.driver", "BrowserDriver\\windows\\chromedriver.exe");
        // creating an object of Chrome Driver class
        WebDriver driver = new ChromeDriver();
        //Open the Chrome browser and Nevigate to TD Bank url
        driver.navigate().to("http:/www.td.com");
        // Maximize the window size.
        driver.manage().window().maximize();
        //click on Products to open it
        driver.findElement(By.cssSelector("#td-desktop-nav-dropdown-link-2")).click();



        driver.findElement(By.cssSelector("#td-desktop-nav-dropdown-link-2 > span.td-icon.expand")).click();


    }

}
