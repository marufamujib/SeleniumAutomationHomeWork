package Homedepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Open the Home Depot url, print the title and closed the browser
public class TestCase1 {
    public static void main(String[] args) throws InterruptedException {
        // Set the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver\\windows\\geckodriver.exe");
        // creating a object of Firefox Driver class
        WebDriver driver = new FirefoxDriver();
        //Open the Chrome browser and Nevigate to url
        driver.navigate().to("http:/www.homedepot.com");
        // Maximize the browser window.
        driver.manage().window().maximize();
        //wait for 5 seconds
        Thread.sleep(5000);
        //Print the title of the url
        System.out.println("Title : "+driver.getTitle());
        //close the browser
        driver.close();

    }
}
