package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFullPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
//		driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
//		List<WebElement> options =	driver.findElements(By.xpath("//select[@id='dropdown-class-example']//option"));
//		System.out.println(options.size());
//		
//		for(int i=0; i<=options.size();i++)
//		{
//			if(options.get(i).getText().equals("Option2"))
//			{
//				options.get(i).click();
//			}
//		}
		
//		driver.findElement(By.id("autocomplete")).click();
//		driver.findElement(By.id("autocomplete")).sendKeys("India");
//		
//		List<WebElement> options1=	driver.findElements(By.id("autocomplete"));
//		System.out.println(options1.size());
//		for(int i=0; i<options1.size();i++)
//		{
//			if(options1.get(i).getText().equals("India"))
//			{
//				options1.get(i).click();
//			}
//		}
//		
//		File Screenshotfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(Screenshotfile, new File(""));
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
//		
//		Set<String> windowhandles=	driver.getWindowHandles();
//		Iterator<String> iterator=	windowhandles.iterator();
//		String firstwindow = iterator.next();
//		String secondwindow = iterator.next();
//		driver.switchTo().window(firstwindow);
//		
//		
	WebElement dropdown = driver.findElement(By.id("autocomplete"));
	Select select = new Select(dropdown);
//		
		List<WebElement> alllinks=	driver.findElements(By.xpath("//li[@class='gf-li']//a"));
		System.out.println(alllinks.size());
		
		for(int i=0; i<alllinks.size();i++)
		{
			String attribute =alllinks.get(i).getAttribute("href");
			System.out.println(attribute);
		}
		
		driver.switchTo().alert().dismiss();
		
		Actions action = new Actions(driver);
		action.moveToElement(dropdown).perform();
		
		action.contextClick(dropdown).perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		DesiredCapabilities handlingcertificates = new DesiredCapabilities();
		handlingcertificates.acceptInsecureCerts();
		
		handlingcertificates.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		//handlingcertificates.setCapability(CapabilityType., false)
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", dropdown);
		
		js.executeScript("document.getElementByID('username').value='Standard_user");
		
	}

}
