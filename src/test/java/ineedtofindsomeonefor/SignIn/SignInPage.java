package ineedtofindsomeonefor.SignIn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInPage {
	
	@Test
	public void signInwithVaildCredentials() {
		
		WebDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://test.ineedtofindsomeonefor.com/");
		
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()=\"Demo users available (after backend seed). Try seeker@example.com / password123.\"]")).isDisplayed());
		
		driver.findElement(By.id("email")).sendKeys("piyumick8789@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//span[text()=\"Remember my credentials\"]/preceding-sibling::*"));
		
		driver.findElement(By.xpath("//button[text()=\"Sign in\"]")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()=\"Logout\"]")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()=\"My Profile\"]")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()=\"Chats\"]")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()=\"My Console\"]")).isDisplayed());
		
		driver.quit();

	}

}
