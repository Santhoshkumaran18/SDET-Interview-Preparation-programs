package SeleniumJavaInterviewQuestions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep19_Wait_Concepts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//navigate back and refresh and get methods
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
		//Implicit wait - It is usually declare at the global level and make 
		//sure it will for the each element to load for eg if the elemnet is taking 5 sec to load
		//it will wait for that and proceed with next step if it completed withing 2 sec it move on to the next step
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Explicity is type of wait in seleneium it is applied to the element leveel
		//it has special function and elements like visibility of element, preseence of element locations
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		//Fluent wait is also type of webdriver wait in selenium it checks at the 
		//frequency level for eg is the elmenet only appear blinking page we can use this by creating a functions
		
		FluentWait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(4))
				.pollingEvery(Duration.ofSeconds(4))
				.ignoring(Exception.class);
		
		WebElement element=wait.until(new Function<WebDriver,WebElement>(){

			public WebElement apply(WebDriver driver) {
				WebElement el=driver.findElement(By.id("id"));
				if(el.isDisplayed()) {
					
				}else {
					return null;
				}
				return el;
				
			}
			
		});
		
		
	
	}

}
