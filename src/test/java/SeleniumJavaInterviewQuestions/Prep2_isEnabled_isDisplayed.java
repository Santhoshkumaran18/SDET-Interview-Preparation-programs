package SeleniumJavaInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep2_isEnabled_isDisplayed {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		//isEnabled(),isDisplayed(),isSelected()
		
		WebElement SearchBox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display Status: " + SearchBox.isDisplayed());
		System.out.println("Enabled Status: " + SearchBox.isEnabled());
		WebElement radioButton=driver.findElement(By.xpath("//input[@type='radio'][@id='gender-male']"));
		System.out.println("Before Selection: " + radioButton.isSelected());
		
		radioButton.click();
		System.out.println("After Selection: " + radioButton.isSelected());
		
		
		
		
		
	

	}

}
