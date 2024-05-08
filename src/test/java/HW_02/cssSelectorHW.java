package HW_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorHW {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/cssSelector.php");
        driver.manage().window().maximize();

        //find Profile ID:
        WebElement profileID = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("Hello");

        //find the profile box using id shortcut
        WebElement profileBox = driver.findElement(By.cssSelector("input#profileBox"));
        profileBox.sendKeys("profile");

        //Feedback from jenny with class shortcut
        WebElement feedbackFromJenny = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackFromJenny.sendKeys("Feedback from Jenny");

        //Feedback from Raj with class shortcut
        WebElement feedbackFromRaj = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackFromRaj.sendKeys("Feedback from Raj");

        //Email
        WebElement email = driver.findElement(By.cssSelector("input[name='email'].form-control"));
        email.sendKeys("example@example.com");

        //Course Topic contains shortcut
        WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='23contentInput67']"));
        courseTopic.sendKeys("Course Topic");

        //Intro to Advanced CSS: starts-with shortcut
        WebElement introToAdvancedCSS = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        introToAdvancedCSS.sendKeys("Intro to Advanced CSS");

        //Conclusion of CSS Module: ends-with shortcut
        WebElement conclusionOfCSS = driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusionOfCSS.sendKeys("Conclusion of CSS Module");



    }//end of main
}//end of class