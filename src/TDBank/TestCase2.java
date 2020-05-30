package TDBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Test Case: Find the location of TDBank or ATM near Queens,NY
public class TestCase2 {
    public static void main(String[] args) throws InterruptedException {
        // Set the Browser driver properties
        System.setProperty("webdriver.chrome.driver", "BrowserDriver\\windows\\chromedriver.exe");
        // creating a object of Chrome Driver class
        WebDriver driver = new ChromeDriver();
        //Open the Chrome browser and Nevigate to TD Bank url
        driver.navigate().to("http:/www.td.com");
        // Maximize the window size.
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //Click on Find us link
        driver.findElement(By.linkText("Find Us")).click();
        Thread.sleep(2000);
        //click on search text box and pass key values
        driver.findElement(By.cssSelector("#q")).sendKeys("Queens,NY,USA");
        Thread.sleep(2000);
        //click on search button
        driver.findElement(By.cssSelector("#search-form > div.Locator-searchBar > button")).click();


    }

}
