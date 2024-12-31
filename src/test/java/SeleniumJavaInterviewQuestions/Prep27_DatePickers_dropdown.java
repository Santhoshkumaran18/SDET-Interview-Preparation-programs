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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep27_DatePickers_dropdown {

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
		
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
		Select MonthCheck=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		
		
		MonthCheck.selectByVisibleText("Oct");
		Select yearCheck=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		yearCheck.selectByVisibleText("2026");
		
		String CurrentDate="27";
		
		List<WebElement> list=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement li:list) {
			if(li.getText().equals(CurrentDate)) {
				li.click();
				break;
			}
		}
		
	}
	
	
	}


		
		
