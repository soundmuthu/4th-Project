package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSelenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement value = driver.findElement(By.xpath(""));
		Set<String> windows=	driver.getWindowHandles();
		Iterator<String> windowshandles = 	windows.iterator();
		
		String firstwindow = windowshandles.next();
		String secondwindow = windowshandles.next();
		
		driver.switchTo().window(firstwindow);
		
		Actions action = new Actions(driver);
		action.moveToElement(value).click().build().perform();
		
		action.dragAndDrop(value, value).build().perform();
		action.moveToElement(value).contextClick();
		action.moveToElement(value).doubleClick();
		
		action.keyDown(value, Keys.CONTROL).sendKeys("A").sendKeys("c").build().perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10) );
		wait.until(ExpectedConditions.alertIsPresent());
		
		wait.until(ExpectedConditions.visibilityOf(value));
		
		wait.until(ExpectedConditions.elementToBeSelected(value));
		
		File Screenshot = (((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE));
		FileUtils.copyFile(Screenshot, new File(""));
		
		DesiredCapabilities cs = new DesiredCapabilities();
		cs.acceptInsecureCerts();
		cs.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		cs.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, false);
		
		ChromeOptions options = new ChromeOptions();
		options.merge(cs);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", value);
		
		js.executeScript("document.getElementById('user-name'),value='Standard_user");
		

		
	}

}
