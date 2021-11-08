package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("Maksat");
        driver.findElement(By.id("userEmail")).sendKeys("maksat@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("2217 W Rosemont ave");
        driver.findElement(By.id("permanentAddress")).sendKeys("2217 W Rosemont ave 60659");
        //Thread.sleep(2000);
        //ElementClickInterceptedException exception
        WebElement element=driver.findElement(By.id("submit"));
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",element);
        Thread.sleep(2000);
        element.click();
//        Actions actions=new Actions(driver);
//        actions.moveToElement(element).click().perform();
//        Thread.sleep(5000);
        if(driver.findElement(By.id("output")).isDisplayed()){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        driver.quit();
//        WebElement element = driver.findElement(By("element_path"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();




    }
}
