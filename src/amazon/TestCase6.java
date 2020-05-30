package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Find amazon New Released Movies & TV
public class TestCase6 {
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
        //Find the new release items
        driver.findElement(By.linkText("New Releases")).click();
        //Find New Released Movies and Tv
        driver.findElement(By.linkText("Movies & TV")).click();
    }
}
