package SeleniumJavaInterviewQuestions;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep23_ToolTip_Icons_links_open {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//navigate back and refresh and get methods
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame(0);
		
		WebElement box=driver.findElement(By.xpath("//input[@id='age']"));
		
		System.out.println(box.getDomAttribute("title"));
		
		//Open link in new tab
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		
		String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Register")).sendKeys(tab);
		
	}
}