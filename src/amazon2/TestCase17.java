package amazon2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Test Case:search kinetic sand kit in amazon
public class TestCase17 {

    public static void main(String[] args) throws InterruptedException {
        // Setting the Browser driver properties
        System.setProperty("webdriver.chrome.driver", "BrowserDriver\\windows\\chromedriver.exe");
        // creating a object of Chrome Driver class
        WebDriver driver = new ChromeDriver();
        //Open the Chrome browser and Nevigate to amazon url
        driver.navigate().to("http:/www.amazon.com");
        // Maximize the window size.
        driver.manage().window().maximize();
        // wait for 3 seconds
        Thread.sleep(3000);
        //Enter kinetic sand kit in searchbox
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("kinetic sand kit");
        //Click on search button
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();

    }
}
