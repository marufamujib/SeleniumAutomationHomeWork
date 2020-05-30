package TDBank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Test Case: Find credit cards from products menu
public class TestCase5 {
    public static void main(String[] args) {
        // Setting the Browser driver properties
        System.setProperty("webdriver.gecko.driver", "BrowserDriver\\windows\\geckodriver.exe");
        // creating a object of Firefox Driver class
        WebDriver driver = new FirefoxDriver();
        //Open the Chrome browser and Nevigate to TD Bank url
        driver.navigate().to("http:/www.td.com");
        // Maximize the window size.
        driver.manage().window().maximize();
        //click on Products to expand the drop down menu
        driver.findElement(By.cssSelector("#td-desktop-nav-dropdown-link-2")).click();
        //click on credit cards from Products menu
        driver.findElement(By.linkText("Credit Cards")).click();
    }


}
