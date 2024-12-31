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

public class Prep12_CheckBox_Handling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// findElement and findElements

		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		WebElement sunday=driver.findElement(By.xpath("//input[@class='form-check-input'][@id='sunday']"));
		
		
		System.out.println(sunday.isSelected());
		
		//Select all the check boxes
		
		List<WebElement> AllCheckbox=driver.findElements(By.xpath("//input[@type='checkbox'][contains(@id,'day')]"));
		
		for(WebElement check:AllCheckbox) {
			check.click();
		}
		
		//Based on the seletion have to select the choice
		List<WebElement> AllCheckbox4=driver.findElements(By.xpath("//input[@type='checkbox'][contains(@id,'day')]"));
		
		for(WebElement check:AllCheckbox) {
			String checkboxname=check.getDomAttribute("value");
			if(checkboxname.equalsIgnoreCase("sunday")) {
				check.click();
				break;
			}
			
		}
		
		//Select the last three checkboxes in the page
		List<WebElement> AllCheckbox1=driver.findElements(By.xpath("//input[@type='checkbox'][contains(@id,'day')]"));
		int totalCheckBoxes=AllCheckbox1.size();
		int lastelements=4;
		for(int i=totalCheckBoxes-lastelements;i<totalCheckBoxes;i++) {
			AllCheckbox1.get(i).click();
		}
		
		//First few checkboxes
		List<WebElement> AllCheckbox2=driver.findElements(By.xpath("//input[@type='checkbox'][contains(@id,'day')]"));
		int totalCheckBoxes1=AllCheckbox2.size();
		for(int i=0;i<totalCheckBoxes1;i++) {
			if(i<3) {
				AllCheckbox2.get(i).click();
			}
		}
		

	}

}
