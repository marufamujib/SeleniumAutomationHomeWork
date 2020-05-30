package amazon2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Test Case: Amazon customer account sign in
public class TestCase20 {

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
        //Click on Hello sign in button
        driver.findElement(By.cssSelector("#nav-link-accountList > div > span")).click();
        Thread.sleep(3000);
        //enter email for sign in
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("marufa_mujib@yahoo.com");
        Thread.sleep(3000);
        //Click on continue button
        driver.findElement(By.cssSelector("#continue")).click();
        //enter the password
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("abcd1234");
        //click on Sign-in button
        driver.findElement(By.id("signInSubmit")).click();

    }


}
