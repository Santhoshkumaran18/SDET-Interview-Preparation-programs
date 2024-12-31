package SeleniumJavaInterviewQuestions;

import java.io.Serial;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep11_Auto_Suggestive_googlePlace_dropdown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// findElement and findElements

		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://twoplugs.com/newsearchserviceneed");
		
		WebElement placeSearch=driver.findElement(By.id("autocomplete"));
		placeSearch.clear();
		placeSearch.sendKeys("India");
		String text;
		
		//Because there are no inspect element in the dropdown so we are using this method
		do {
			placeSearch.sendKeys(Keys.ARROW_DOWN);
			text=placeSearch.getDomAttribute("value");
			System.out.println(text);
			if(text.equalsIgnoreCase("India")) {
				placeSearch.sendKeys(Keys.ENTER);
				break;
			}
		} while (!text.isEmpty());
		
		
		
		
		
	
		
		
		
	}
	
}
