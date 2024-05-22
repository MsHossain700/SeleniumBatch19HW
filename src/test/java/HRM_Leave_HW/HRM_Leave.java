package HRM_Leave_HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class HRM_Leave {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();

        //find and click on leave
        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();

        //Select From date

        //click on from
        WebElement from = driver.findElement(By.xpath("//input[@id='calFromDate']"));
        from.click();

        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

        Select fromMonth = new Select(month);
        fromMonth.selectByValue("8");

        boolean found=false;
        while (!found) {
            List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
            for (WebElement date : dates) {
                if (date.getText().equals("19")) {
                    date.click();
                    break;
                }
            }
            found = true;
        }

        //Select To date

        //click on To
        WebElement to = driver.findElement(By.xpath("//input[@id='calToDate']"));
        to.click();

        WebElement toMonthElement = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

        Select toMonth = new Select(toMonthElement);
        toMonth.selectByValue("9");

        boolean found2=false;
        while (!found2) {
            List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
            for (WebElement date : dates) {
                if (date.getText().equals("30")) {
                    date.click();
                    break;
                }
            }
            found2 = true;
        }







    }//end of main
}//end of class
