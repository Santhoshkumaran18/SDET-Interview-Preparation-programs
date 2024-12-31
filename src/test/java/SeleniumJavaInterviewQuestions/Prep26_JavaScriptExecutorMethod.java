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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep26_JavaScriptExecutorMethod {
	
	public static void drawBorder(WebElement element,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static String getTitleJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String title=js.executeScript("return document.title;").toString();
		return title;
	}
}