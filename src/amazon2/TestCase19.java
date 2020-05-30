package amazon2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Test Case: select garden and outdoor department from all departments drop down list
public class TestCase19 {
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
        //Click on All dropdown button to expand all departments
        driver.findElement(By.cssSelector("#searchDropdownBox")).click();
        Thread.sleep(3000);
        //click on garden and outdoor from all department
        driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]/option[30]")).click();

    }
}
