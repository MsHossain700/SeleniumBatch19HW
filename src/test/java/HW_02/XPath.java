package HW_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XPath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/Xpath.php");
        driver.manage().window().maximize();

        //find username field
        WebElement username = driver.findElement(By.xpath("//input[@id='title']"));
        //send username to username field
        username.sendKeys("Username");

        //find Security Question 1
        WebElement securityQuestion1 = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        //send text to Security Question 1 field
        securityQuestion1.sendKeys("Security Question");

        //find Api Settings
        WebElement apiSettings = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        //send text to Api Settings field
        apiSettings.sendKeys("Api Settings");

        //Select using indexing Email 1:
        WebElement selectUsingIndexing = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        selectUsingIndexing.sendKeys("example1@example.com");

        //Select using indexing Email 2:
        WebElement selectUsingIndexing2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        selectUsingIndexing2.sendKeys("example2@example.com");

        //Select using indexing Email 3:
        WebElement selectUsingIndexing3 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        selectUsingIndexing3.sendKeys("example3@example.com");

        //Select using Multiple Attributes (& Operator):
        //field 1
        WebElement field1 = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        field1.sendKeys("Text example");

        //field 2
        WebElement field2 = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        field2.sendKeys("Text example");

        //Select using your choice of xpath:
        //field1
        WebElement bottomField1 = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField1']"));
        bottomField1.sendKeys("Text example");

        //field2
        WebElement bottomField2 = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField1']"));
        bottomField2.sendKeys("Text example");







    }//end of main
}//end of class
