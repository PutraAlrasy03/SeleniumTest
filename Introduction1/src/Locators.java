import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
        
		 System.setProperty("webdriver.chrome.driver", "C://eclipse/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://rahulshettyacademy.com/locatorspractice/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	      driver.findElement(By.name("inputPassword")).sendKeys("hello123");
	      driver.findElement(By.className("submit")).click();
	      System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	      driver.findElement(By.linkText("Forgot your password?")).click();
	      driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
	      driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
	      Thread.sleep(2000); // Wait for 2 seconds
	      driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	      Thread.sleep(2000); // Wait for 2 seconds
	      driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
	      Thread.sleep(2000); // Wait for 2 seconds
	      driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
	      driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	      Thread.sleep(2000); // Wait for 2 seconds
	      driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[1]")).click();
	      
	      System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	      driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
	      driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	      driver.findElement(By.id("chkboxOne")).click();
	      driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	      driver.close();	    
	}
}
