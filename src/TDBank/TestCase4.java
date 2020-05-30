package TDBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//Test Case: Get the title of the TD bank url
public class TestCase4 {
    public static void main(String[] args) {
        // Setting the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver\\windows\\geckodriver.exe");
        // creating a object of Firefox Driver class
        WebDriver driver = new FirefoxDriver();
        //Open the Chrome browser and Nevigate to TD Bank url
        driver.navigate().to("http:/www.td.com");
        // Maximize the window size.
        driver.manage().window().maximize();
        //Get the title of URL and print it
        System.out.println("Title: "+driver.getTitle());
    }
}
