package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Test case 4 :Find out amazon best seller books

public class TestCase4 {
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
        //find amazon best seller books
        driver.findElement(By.cssSelector("#zg_browseRoot > ul > li:nth-child(11) > a")).click();

    }
}
