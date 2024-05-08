package HW_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
goto https://syntaxprojects.com/input-form-locator.php
and fill in all the text box and click on submit button

 */
public class SyntaxProjectsHW {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/input-form-locator.php");
        driver.manage().window().maximize();

        //find firstname field
        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys("John");

        //find lastname field
        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Doe");

        //find email field
        WebElement  emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("JohnDoe@anyemail.com");

        //find submit button
        WebElement submitButton = driver.findElement(By.id("submit_button"));
        submitButton.click();


        driver.close();



    }//end of main
}//end of class
