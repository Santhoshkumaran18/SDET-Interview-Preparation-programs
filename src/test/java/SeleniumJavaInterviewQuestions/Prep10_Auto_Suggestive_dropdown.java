package SeleniumJavaInterviewQuestions;

import java.io.Serial;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep10_Auto_Suggestive_dropdown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// findElement and findElements

		driver.get("https://www.google.com/");
		
		WebElement searchBox=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		searchBox.sendKeys("Selenium");
		
		List<WebElement> dropdownElements=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
		System.out.println(dropdownElements.size());
		for(WebElement search:dropdownElements) {
			System.out.println(search.getText());
			if(search.getText().equalsIgnoreCase("Selenium")) {
				search.click();
				break;
			}
		}
		
		
		
		
	
		
		
		
	}
	
}
