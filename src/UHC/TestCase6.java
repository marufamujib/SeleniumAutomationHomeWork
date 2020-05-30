package UHC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase6 {
    public static void main(String[] args) throws InterruptedException {
        // Set the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver\\windows\\geckodriver.exe");
        // creating a object of Firefox Driver class
        WebDriver driver = new FirefoxDriver();
        //Open the Chrome browser and Nevigate to UHC url
        driver.navigate().to("http:/www.uhc.com");
        // Maximize the browser window.
        driver.manage().window().maximize();
        //wait for 5 seconds
        Thread.sleep(5000);
        //Click on Sign in
        driver.findElement(By.xpath("//div[@class='signin signin-menu ml-4']//button[@class='signin-menu__button m-0 py-0 pl-4 pr-8 position-relative border-hairline borderColor-greyDigital borderRadius-default width-auto color-inherit bg-white cursor-pointer lineHeight-h1']")).click();
        //Click on sign in to myuhc.com
        driver.findElement(By.xpath("//*[@id=\"671978824-list1590767688220\"]/li[1]/a")).click();
    }
}
