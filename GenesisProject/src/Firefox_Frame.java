
import java.awt.Desktop.Action;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Firefox_Frame{   
	
	public static void main(String[] args) throws InterruptedException {
    System.out.println("Wlcome to selenium ");
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training\\Desktop\\geckodriver.exe");  // set path of 
    WebDriver driver = new FirefoxDriver();  
    driver.get("http://demo.automationtesting.in/Frames.html");
    Thread.sleep(2000);
    driver.manage().window().maximize();

		Thread.sleep(2000);
		
		

		 driver.switchTo().frame("SingleFrame");
		 driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Omprakash");
		 Thread.sleep(5000); 
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
//		 driver.switchTo().frame("Multiple");
//		 driver.switchTo().frame("SingleFrame");
//		 
//		 driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Omprakash");
		 
		 

			//Entering into Larger frame

			WebElement fr1 = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));

			driver.switchTo().frame(fr1);

			

			//Entering into inner frame

			WebElement fr2 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));

			driver.switchTo().frame(fr2);

			driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Harod");
		 
		 
		 
		 
		 
		 
		 

//		 driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).sendKeys("harod");
	}

	
}
