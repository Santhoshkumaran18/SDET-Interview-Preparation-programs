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

public class Prep9_dropdown_Sorting {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		// findElement and findElements

		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://twoplugs.com/newsearchserviceneed");
		driver.navigate().refresh();
		
		WebElement drpElement=driver.findElement(By.xpath("//select[@name='category_id']"));
		Select select=new Select(drpElement);
		
		List<WebElement> options=select.getOptions();
		System.out.println(options.size());
		
		ArrayList originalList=new ArrayList();
		ArrayList tempList=new ArrayList();
		
		for(WebElement opt:options) {
			originalList.add(opt.getText());
			tempList.add(opt.getText());
		}
		System.out.println("Orginial list: " + originalList);
		System.out.println("Temp list: " + tempList);
		Collections.sort(tempList);
		Collections.sort(originalList);
		System.out.println("Orginial list after sorting: " + originalList);
		System.out.println("After sorting: " + tempList);
		
		if(originalList.equals(tempList)) {
			System.out.println("Dropdown are sorted");
		}else {
			System.out.println("Dropdown are not in the sorted list");
		}
		
		driver.quit();
		
		
		
	}
	
}
