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

public class Prep28_WebTable_Static {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// navigate back and refresh and get methods

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		//How many rows in the table
		//How many column in the table
		//Retrieve the specific row column data
		//Retrieve all the data from the table
		
		WebElement table=driver.findElement(By.xpath("//table[@id='product'][@name='courses']"));
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='product'][@name='courses']//tr"));
		List<WebElement> columnsHeaders=driver.findElements(By.xpath("//table[@id='product'][@name='courses']//tr/th"));
		int rowsize=rows.size();
		int columnsize=columnsHeaders.size();
		System.out.println("Total rows: " + rows.size());
		
		System.out.println("Total columns: " + columnsHeaders.size());
		
		List<WebElement> tablevalues=driver.findElements(By.xpath("//table[@id='product'][@name='courses']//tr/td"));
		System.out.println("Total number of values in the table is: " + tablevalues.size());
		System.out.println("Data from the table...............");
		for(int r=2;r<=rowsize;r++) {
			for(int c=1;c<=columnsize;c++) {
				String value=driver.findElement(By.xpath("//table[@id='product'][@name='courses']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value + "   ");
			}
			System.out.println();
		}
		String valuechar="Appium (Selenium) - Mobile Automation Testing from Scratch";
		for(int r=2;r<rowsize;r++) {
			String textrow=driver.findElement(By.xpath("//table[@id='product'][@name='courses']//tr["+r+"]//td[2]")).getText();
			if(textrow.equalsIgnoreCase(valuechar)) {
				System.out.println(textrow);
				break;
			}else {
				System.out.println("Check the string value");
				break;
			}
		}
	}

}
