package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Test Case: Find amazon best seller Apps & Games
public class TestCase5 {
    public static void main(String[] args) throws InterruptedException {
        // Set the browser properties
        System.setProperty("webdriver.chrome.driver","BrowserDriver\\windows\\chromedriver.exe");
        // Create an object of chrome driver class which is an reference variable of Webdriver interface
        WebDriver driver=new ChromeDriver();
        //navigate to the amazon url
        driver.navigate().to("http://www.amazon.com");
        // maximize the size of the website
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //find all best sellers items
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).click();
        //find amazon best seller Apps and Games
        driver.findElement(By.linkText("Apps & Games")).click();

    }

}
