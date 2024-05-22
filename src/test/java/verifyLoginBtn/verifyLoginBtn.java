package verifyLoginBtn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class verifyLoginBtn {

    public  static WebDriver driver;
    @BeforeMethod
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @Test
    public void loginBtnVerification(){
        WebElement loginBtn = driver.findElement(By.xpath("//input[@name='Submit']"));
        boolean displayStatus = loginBtn.isDisplayed();
        boolean isEnabled = loginBtn.isEnabled();
        Assert.assertTrue(displayStatus,"Login Button is not displayed");
        Assert.assertTrue(isEnabled,"Login button is not enabled");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}//end of class
