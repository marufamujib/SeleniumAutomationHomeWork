package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Test Case:Find a gift for Kids 9-11 yrs group.
public class TestCase10 {

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
        //Click on Find a Gift link
        driver.findElement(By.linkText("Find a Gift")).click();
        Thread.sleep(2000);
        //Click on KIDS 9-11 link
        driver.findElement(By.linkText("KIDS 9-11")).click();

    }
}
