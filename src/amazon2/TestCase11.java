package amazon2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Test Case: search disinfectant wipes in amazon website
public class TestCase11 {

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
        //Enter keyword(disinfectant wipes) in searchbox
        //Click on the search text box and send value
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("disinfectant wipes");
        Thread.sleep(5000);
        //Click on search button
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
}