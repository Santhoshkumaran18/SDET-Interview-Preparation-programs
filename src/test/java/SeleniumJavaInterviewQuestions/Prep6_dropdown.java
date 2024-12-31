package SeleniumJavaInterviewQuestions;

import java.io.Serial;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep6_dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//findElement and findElements
		
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement StaticDropdown=driver.findElement(By.xpath("//p//select"));
		Select select=new Select(StaticDropdown);

		select.selectByVisibleText("American Samoa");
		
		StaticDropdown.click();
		List<WebElement> lists=driver.findElements(By.xpath("//p//select/option"));
		System.out.println(lists.size());
		for(WebElement totaldropDownlist:lists) {
				if(totaldropDownlist.getText().equalsIgnoreCase("india")) {
					totaldropDownlist.click();
					break;
				}
		}
		
		
		
		
		
		
		
		
		
	

	}

}
