package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tc1Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		System.out.println(driver);	  
		 
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		driver.findElement(By.xpath("//td[text()='15']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		
		String text = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(text);
		
		 WebElement findElement = driver.findElement(By.xpath("//label[@for='bt_SLEEPER']"));
		 driver.executeScript("arguments[0].scrollIntoView();", findElement);
		 findElement.click();
		
		 String txt = driver.findElement(By.xpath("//div[text()='V2K Travels']")).getText();
				System.out.println(txt);
				driver.findElement(By.xpath("//div[@class='close-primo']")).click();
						Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[text()='View Seats'])[2]")).click();
				
	}

}
