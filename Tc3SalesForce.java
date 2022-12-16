package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Tc3SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(option);
		System.out.println(driver);	
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		 driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("Testleaf$321");
	    driver.findElement(By.xpath("//input[@id='Login']")).click();
	    
	  
	    WebElement togg = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
	    driver.executeScript("arguments[0].click();",togg);
	    //driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	   
	   WebElement viewall = driver.findElement(By.xpath("(//button[@class='slds-button'])[2]"));
	    driver.executeScript("arguments[0].click();",viewall);
	    
	    WebElement sales =  driver.findElement(By.xpath("(//p[@class='slds-truncate'])[7]"));
	    driver.executeScript("arguments[0].click();",sales);
	     
	    WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
	    driver.executeScript("arguments[0].click();",opp);
	    
	    driver.findElement(By.xpath("//div[text()='New']")).click();
	  
	    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("SalesForce Automation by Farihah");
	    String text = driver.findElement(By.xpath("//input[@name='Name']")).getText();
	    System.out.println(text);
	   
	    driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("12/14/2022");
	    driver.findElement(By.xpath("//span[text()='--None--']")).click();
	    
	    WebElement element= driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']"));
		Select sel = new Select (element);
		sel.deselectByIndex(4);
		
		WebElement save= driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		driver.executeScript("arguments[0].click();",save);
		
		
	    
		
	    
	    
	}

}
