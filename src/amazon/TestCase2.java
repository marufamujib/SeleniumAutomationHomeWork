package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Find amazon Best Seller products.
public class TestCase2 {
    public static String chromeDriver="webdriver.chrome.driver";
    public static String chromeDriverPath="BrowserDriver\\windows\\chromedriver.exe";

    public static void main(String[] args) throws InterruptedException {
        // Browser Driver property need to set
        System.setProperty(chromeDriver,chromeDriverPath);
        // Create driver object for Chrome Driver
        WebDriver driver=new ChromeDriver();
        // Open the chrome browser and navigate to the amazon url
        driver.navigate().to("https://www.amazon.com/");
        // Make the amazon window in full screen
        driver.manage().window().maximize();
        // wait for 5 second
        Thread.sleep(5000);
        //Fine the Best Seller tab and click on it
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();

    }

}
