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
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep20_Keyboard_Actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// navigate back and refresh and get methods

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		driver.navigate().to("https://the-internet.herokuapp.com/key_presses");
		WebElement keypress = driver.findElement(By.xpath("//input[@id='target']"));

		Actions actions = new Actions(driver);
//		actions.sendKeys(Keys.ENTER).perform();
//		actions.sendKeys(Keys.BACK_SPACE).perform();
//		actions.sendKeys(Keys.ESCAPE).perform();
//		actions.sendKeys(Keys.SPACE).perform();
		
		driver.navigate().to("https://text-compare.com/");
		WebElement text1=driver.findElement(By.xpath("//textarea[@name='text1']"));
		WebElement text2=driver.findElement(By.xpath("//textarea[@name='text2']"));
		text1.sendKeys("Welcome to selenium");
		
		//CTRL +a
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.perform();
		Thread.sleep(4000);
		
		//CTRL + c
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
		actions.perform();
		Thread.sleep(4000);
		
		//Tab key
		actions.sendKeys(Keys.TAB);
		actions.perform();
		
		//CTRL +V
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		actions.perform();

	}

}