package UHC;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Open the UHC browser, print the title and close the browser
public class TestCase1 {
    public static void main(String[] args) throws InterruptedException {
        // Set the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver\\windows\\geckodriver.exe");
        // creating a object of Firefox Driver class
        WebDriver driver = new FirefoxDriver();
        //Open the Chrome browser and Nevigate to UHC url
        driver.navigate().to("http:/www.uhc.com");
        // Maximize the browser window.
        driver.manage().window().maximize();
        //print the title of the UHC url
        System.out.println("UHC title : "+driver.getTitle());
        //wait for 5 seconds
        Thread.sleep(5000);
        //close the browser
        driver.close();

    }

}
