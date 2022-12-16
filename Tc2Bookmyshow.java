package marathon1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tc2Bookmyshow {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		System.out.println(driver);	
		
		driver.get("https://in.bookmyshow.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//img[@alt='HYD']")).click();
	   String printurl= driver.getCurrentUrl();
	   System.out.println(printurl);
	   if (printurl.contains("hyderabad")) {
		System.out.println("TRUE");
	}
	   else {
		System.out.println("FALSE");
	}
	   System.out.println();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[contains(text(),'Search for Movies')]")).click();
	    driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Movies')]")).sendKeys("Love Today");
	   
	    driver.findElement(By.xpath("//div[@class='sc-fFTYTi exELNQ']")).click();
	    driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
	    
	    driver.findElement(By.xpath("//button[text()='Not Now']")).click();
	    String text = driver.findElement(By.linkText("AMB Cinemas: Gachibowli")).getText();
	    System.out.println(text);
	    driver.findElement(By.xpath("(//div[text()='INFO'])[2]")).click();
	    String txt = driver.findElement(By.xpath("//div[text()='            Parking Facility        ']")).getText();
	    System.out.println(txt);
	    driver.findElement(By.xpath("//div[@class='cross-container']")).click();
	    driver.findElement(By.xpath("(//div[@class='__text'])[3]")).click();
	    driver.findElement(By.xpath("//div[text()='Accept']")).click();
	    driver.findElement(By.xpath("//li[text()='1']")).click();
	    driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
	    driver.findElement(By.xpath("(//a[@class='_available'])[2]")).click();
	    driver.findElement(By.xpath("//a[@class='bar-btn _primary']")).click();
	    String total= driver.findElement(By.xpath("//span[@id='subTT']")).getText();
	    System.out.println(total);
	    //total
	    //screenshot
	    File source = driver.getScreenshotAs(OutputType.FILE);
	    File destination = new File("./snaps/seatingarrangement.jpeg");
	    FileUtils.copyFile(source, destination);
	    //driver.close();
	  
	}

}
