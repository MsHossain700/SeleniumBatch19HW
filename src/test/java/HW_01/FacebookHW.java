package HW_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
HW
goto facebook .com
click on create new account and fill in all the text box only
 */
public class FacebookHW {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        //find create new account button
        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
        //click on create new account button
        createNewAccount.click();
        Thread.sleep(1000);


        //find first name field
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("John");

        //find last name field
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Smith");

        //find email field
        WebElement emailField = driver.findElement(By.name("reg_email__"));
        emailField.sendKeys("JohnDoe@anyemail.com");


        //find password field
        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("Yuc8$RikA34%ZoPPao98t");

        //reenter email
        WebElement reenterEmail = driver.findElement(By.name("reg_email_confirmation__"));
        reenterEmail.sendKeys("JohnDoe@gmail.com");



    }//end of main
}//end of class

