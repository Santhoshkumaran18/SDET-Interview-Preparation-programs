package SeleniumJavaInterviewQuestions;

import java.io.Serial;
import java.time.Duration;
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

public class Prep8_jquery_Dropdown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		// findElement and findElements

		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.navigate().refresh();
		
		WebElement dropdownSelection=driver.findElement(By.xpath("//input[@id='justAnInputBox']"));
		dropdownSelection.click();
		
//		selectChoiceValue(driver, "choice 1");
		
		selectChoiceValue(driver, "choice 2","choice 3","choice 1");
		
//		selectChoiceValue(driver, "all");
		
		
	}
	
	public static void selectChoiceValue(WebDriver driver,String... value) {
		List<WebElement> choicelist=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
			if(!value[0].equalsIgnoreCase("all")) {
				for(WebElement listSelect:choicelist) {
					String text=listSelect.getText();
					for(String val:value) {
						if(text.equals(val)) {
							listSelect.click();
						}
					}
				}
			}
			else {
				for(WebElement item:choicelist) {
					item.click();
				}
			}
		
		
	}
}
