package SeleniumJavaInterviewQuestions;

import java.io.Serial;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep7_Multiple_Dropdown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		// findElement and findElements

		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.leafground.com/select.xhtml");

		WebElement selectUIAutomationtool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		selectDropdownMethod(selectUIAutomationtool, "Selenium");
		Thread.sleep(5000);

		WebElement country = driver.findElement(By.xpath("//label[@id='j_idt87:country_label']"));
		country.click();
		String countryvalue="Germany";
		List<WebElement> countrySelection=driver.findElements(By.xpath("//ul[@id='j_idt87:country_items']/li"));
		for(WebElement countrysel:countrySelection) {
			if(countrysel.getText().equalsIgnoreCase(countryvalue)) {
				countrysel.click();
				break;
			}
		}
		
	}

	public static void selectDropdownMethod(WebElement ele, String value) {
		Select select = new Select(ele);
		List<WebElement> optionstools = select.getOptions();
		for (WebElement options1 : optionstools) {
			if (options1.getText().equals(value)) {
				options1.click();
				break;
			}
		}
	}

}
