import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SellIntroduction {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        
      WebDriver driver = new ChromeDriver();
      driver.get("https://rahulshettyacademy.com");
      driver.manage().window().maximize();
      System.out.println(driver.getTitle());
      System.out.println(driver.getCurrentUrl());
      driver.close();
    }
}


