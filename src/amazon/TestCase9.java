package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase9 {
    public static void main(String[] args) throws InterruptedException {
        // Setting the Browser driver properties
        System.setProperty("webdriver.chrome.driver","BrowserDriver\\windows\\chromedriver.exe");
        // creating a object of Chrome Driver class
        WebDriver driver=new ChromeDriver();
        //Open the Chrome browser and Nevigate to amazon url
        driver.navigate().to("http:/www.amazon.com");
        // Maximize the window size.
        driver.manage().window().maximize();
        // wait for 3 seconds
        Thread.sleep(3000);
        //Find items in Today's Deals
        driver.findElement(By.linkText("Today's Deals")).click();
        //Find Computer and Accesories in today's deals
        //driver.findElement(By.xpath("//span[contains(text(),'Cell Phones & Accessories']")).click();
        driver.findElement(By.xpath("//div[@class='a-section tileOverlay selected']")).click();
        //driver.findElement(By.cssSelector("#widgetFilters")).click();


    }
}
