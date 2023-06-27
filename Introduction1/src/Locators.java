import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
        
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://rahulshettyacademy.com/locatorspractice/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	      driver.findElement(By.name("inputPassword")).sendKeys("hello123");
	      driver.findElement(By.className("submit")).click();
	      System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	    }
	}

