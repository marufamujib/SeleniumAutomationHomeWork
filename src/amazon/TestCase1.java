package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    // Test case 1: Open amazon website in full size and close it after 5 seconds

    public static String chromeDriver="webdriver.chrome.driver";
    public static String chromeDriverPath="BrowserDriver\\windows\\chromedriver.exe";
    public static String url="https://www.amazon.com/";

   // public static WebDriver driver=new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        // Browser Driver property need to set
     System.setProperty(chromeDriver,chromeDriverPath);
        // Create driver object for Chrome Driver
        WebDriver driver=new ChromeDriver();
        // Open the chrome browser and navigate to the amazon url
        driver.navigate().to("https://www.amazon.com/");
       // Make the amazon window in full screen
        driver.manage().window().maximize();
        // wait for 5 second before closing
        Thread.sleep(5000);
        //close the amazon url
        driver.close();

    }

}
