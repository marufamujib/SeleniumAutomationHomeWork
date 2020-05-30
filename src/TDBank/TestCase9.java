package TDBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//Test Case:Log in to online banking of TB bank
public class TestCase9 {

    public static void main(String[] args) throws InterruptedException {
        // Setting the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver\\windows\\geckodriver.exe");
        // creating a object of Firefox Driver class
        WebDriver driver = new FirefoxDriver();
        //Open the Chrome browser and Nevigate to TD Bank url
        driver.navigate().to("http:/www.td.com");
        // Maximize the window size.
        driver.manage().window().maximize();
        //click on Online Banking Log in button
        driver.findElement(By.xpath("//button[@class='td-button td-button-secondary td-button-large td-copy-nowrap loginout']")).click();

        //enter user name
        driver.findElement(By.id("formElement_0")).sendKeys("abcd1234");
        //enter password
        driver.findElement(By.id("formElement_1")).sendKeys("xyz1234");
        Thread.sleep(2000);
        //click on log in button
        driver.findElement(By.cssSelector("#loginForm > button")).click();

    }
}
