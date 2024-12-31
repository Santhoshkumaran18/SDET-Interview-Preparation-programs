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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep27_DatePickers {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// navigate back and refresh and get methods

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		String year="2027";
		String month="December";
		String date="18";
		
		WebElement dateSelection=driver.findElement(By.xpath("//input[@id='datepicker']"));
		dateSelection.click();
		
		while(true) {
			String monthYear=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			String arr[]=monthYear.split(" ");
			String mon=arr[0];
			String yr=arr[1];
			
			if((mon.equalsIgnoreCase(month)) && (yr.equals(year))) {
				break;
			}
			else {
		
				driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			}
		}
				
			//Date selection
			
			List<WebElement> dateSelect=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
			for(WebElement sel:dateSelect) {
				String dt=sel.getText();
				if(dt.equals(date)) {
					sel.click();
					break;
				}
			}
		
		
	}
		
	}


		
		
