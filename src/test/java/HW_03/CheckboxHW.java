package HW_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxHW {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php#");
        driver.manage().window().maximize();

        //find the Enable Checkboxes button

        WebElement enableCheckBoxesButton = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableCheckBoxesButton.click();

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='checkbox-field']"));

        for(WebElement checkBox:checkBoxes){
            String value = checkBox.getAttribute("value");

            if(value.equalsIgnoreCase("Checkbox-4")){
                checkBox.click();
            }
        }

    }//end of main
}//end of class
