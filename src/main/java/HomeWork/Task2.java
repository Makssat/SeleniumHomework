package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
        WebElement element= driver.findElement(By.xpath("//label[@for='yesRadio']"));
        String expected="Yes";
       if(element.getText().equals(expected)){
           System.out.println(true);
       }else{
           System.out.println(false);
       }
       driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
       WebElement element1=driver.findElement(By.xpath("//p[@class='mt-3']/span"));
       String expectedImpres="Impressive";
       if(element1.getText().equals(expectedImpres)){
           System.out.println(true);
       }else{
           System.out.println(false);
       }
       WebElement element2=driver.findElement(By.id("noRadio"));
       if(!element2.isEnabled()){
           System.out.println("No radio button disabled ->"+!element2.isEnabled());
           System.out.println(true);
       }else{
           System.out.println(false);
       }
       driver.quit();
    }
}
