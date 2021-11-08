package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("Maksat");
        driver.findElement(By.id("password")).sendKeys("Maksat2001");
        driver.findElement(By.id("login-button")).click();
        String str="Epic sadface: Username and password do not match any user in this service";
        if(driver.findElement(By.xpath("//h3[@data-test='error']")).getText().equals(str)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
