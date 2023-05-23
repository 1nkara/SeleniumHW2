package HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



/*HW  (only use XPATH)
        navigate to fb.com
        click on create new account
        fill up all the textboxes
        close the popup
        close the browser

        Note : in order for ur code to work
        u have to put Thread.sleep(2000) after clicking on Create new account*/
public class HW2 {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement createAccountButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccountButton.click();
        Thread.sleep(2000);
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameInput.sendKeys("Kara");
        WebElement lastNameInput = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastNameInput.sendKeys("Smith");
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        emailInput.sendKeys("12345@gmail.com");
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        passwordInput.sendKeys("123456789O");
        driver.quit();

    }
}
