package SeleniumJavaInterviewQuestions;

import java.io.Serial;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep5_SearchBox_Clear {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//findElement and findElements
		
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.amazon.in/");
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println(searchbox.getDomAttribute("placeholder"));
		searchbox.sendKeys("Iphone\n");
		Thread.sleep(3000);		
		
		WebElement searchbox1=driver.findElement(By.xpath("//input[@type='text']"));
		searchbox1.clear();
		
		Thread.sleep(5000);
		List<WebElement> searchBoxlists=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		Thread.sleep(4000);
		System.out.println(searchBoxlists.size());
		for(WebElement list:searchBoxlists) {
			if (list.getText().equalsIgnoreCase("iphone 13 128gb")) {
				list.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
