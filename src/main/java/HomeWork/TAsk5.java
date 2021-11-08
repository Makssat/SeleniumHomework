package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TAsk5 {

    @Test
    public void validateCurrentUrl() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        List <WebElement> list=driver.findElements(By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name']"));
        Set excpected=new TreeSet();
        Set actual=new TreeSet();
        for(WebElement element:list){
            System.out.println(element.getText());
            excpected.add(element.getText());
            actual.add(element.getText());
        }

        Assert.assertEquals(actual.toString(),excpected.toString());

    }
}
