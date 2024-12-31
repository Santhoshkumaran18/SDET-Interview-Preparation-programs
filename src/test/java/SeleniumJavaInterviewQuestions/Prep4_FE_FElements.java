package SeleniumJavaInterviewQuestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep4_FE_FElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//findElement and findElements
		
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.amazon.in/");
		WebElement searchbox=driver.findElement(By.xpath("//input[@type='text']"));
		searchbox.sendKeys("Iphone\n");
	
		Thread.sleep(3000);		
		 
		List<WebElement> totalLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total Links in the page: " + totalLinks.size());
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
