package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Abhishek\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("abhishek");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("kadam");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("abhishekkadam861995");
		driver.findElement(By.name("Passwd")).sendKeys("abhishek@8695");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("abhishek@8695");
		driver.findElement(By.className("CwaK9")).click();
		driver.findElement(By.xpath("//*[@id=\"phoneNumberId\"]")).sendKeys("7350998779");
		driver.findElement(By.xpath("//*[@id=\"phoneNumberId\"]")).sendKeys("7350998779");
		
		
	}
}
