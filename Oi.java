package cc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Oi {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.dealsdray.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mui-1\"]")).sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mui-2\"]")).sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/div[3]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(1000);
		WebElement choose= driver.findElement(By.id("mui-7"));
		choose.sendKeys("C:\\Users\\Dell\\Downloads\\demo-data.xlsx");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/div[3]/button")).click();
		Thread.sleep(1000);

	}

}
