package ineedtofindsomeonefor.SignIn;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://test.ineedtofindsomeonefor.com/");
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		driver.findElement(By.xpath("//a[text()=\"Create account\"]")).click();
		
		driver.findElement(By.xpath("//label[text()=\"Email\"]/following-sibling::input")).sendKeys(NewEmail());
		driver.findElement(By.xpath("//label[text()=\"Password\"]/following-sibling::input")).sendKeys("Test@123");
		driver.findElement(By.xpath("//label[text()=\"Display name\"]/following-sibling::input")).sendKeys("Piyumi");
		driver.findElement(By.xpath("//input[@value=\"seeker\"]")).click();
		driver.findElement(By.xpath("//label[text()=\"City\"]/following-sibling::input")).sendKeys("Kurunegala");
		driver.findElement(By.xpath("//label[text()=\"Country\"]/following-sibling::input")).sendKeys("Sri Lanka");
		driver.findElement(By.xpath("//label[text()=\"Bio\"]/following-sibling::textarea")).sendKeys("Bio Text");
		
		driver.findElement(By.xpath("//button[text()=\"Create account\"]")).click();
		
		driver.findElement(By.xpath("//span[text()=\"I have read and agree to the seeker agreement.\"]/preceding-sibling::*")).click();
		
		driver.findElement(By.xpath("//button[text()=\"I agree and continue\"]")).click();
		
		driver.findElement(By.xpath("//label[text()=\"6-digit code\"]/following-sibling::input")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()=\"Verify and continue\"]")).click();
		
	}
	
	//Brand new Email
			public static String NewEmail() {
				return new Date().toString().replaceAll("\\s","").replaceAll("\\:", "")+"@gmail.com";  

				
			}

}
