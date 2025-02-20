package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Table {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js =  (JavascriptExecutor) driver;

js.executeScript("window.scrollBy(0,500)");

js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000.");
       List<WebElement> columns=  driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
       int sum=0;
       for (int i=0; i< columns.size(); i++)
       {
           sum= sum+Integer.parseInt(columns.get(i).getText());
       }
           System.out.println(sum);

       driver.close();
    }
}
