package Newpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practicelinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> totallinks	=driver.findElements(By.tagName("a"));
		System.out.println(totallinks.size());
		
		String link1 = "REST API";
		for(int i=1; i<totallinks.size();i++)
		{
			//System.out.println(totallinks.get(i));
			System.out.println(totallinks.get(i).getDomAttribute("href"));
			if(totallinks.get(i).getText().equals(link1))
			{
				totallinks.get(i).click();
			}
		}
		
		Set<String> windowhandles = 	driver.getWindowHandles();
		Iterator<String> iteration =	windowhandles.iterator();
		String firstwindow =	iteration.next();
		String firstwindow1 =	iteration.next();
		driver.switchTo().window(firstwindow);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOf());
		
		File Screenshotfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshotfile, new File(""));
		
		DesiredCapabilities st = new DesiredCapabilities();
		st.acceptInsecureCerts();
		
		st.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		JavascriptExecutor jsec= (JavascriptExecutor)driver;
		//jsec.executeScript("arguments[0].scrollIntoView(true)", args);
		
		jsec.executeScript("document.getElementById('user-name').value='Standard_user'");
		
		
		Set<String> ws=	driver.getWindowHandles();
		Iterator<String> value = ws.iterator();
		String firstwindowvalue = value.next();
		String secondwindowvalue = value.next();
		driver.switchTo().window(firstwindowvalue);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
		
		File Screenshotfile1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshotfile, new File(""));
		
		JavascriptExecutor js2= (JavascriptExecutor)driver;
		js2.executeScript("arguments.scrollIntoView(true)", args);
		js2.executeScript("document.getElementById('user-name').value='Standard_user'");
		
		DesiredCapabilities ds= new DesiredCapabilities();
		ds.setAcceptInsecureCerts(true);
		
		ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		
		
	}
	
}
