package Project_2_AutomationExercise;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class ScrollActions {
public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer\\Desktop\\Java Programs\\Selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationexercise.com");// Navigate to url 'https://magento.softwaretestingboard.com/'m/'
        
	}
@FindBy(xpath = "//a[@id='scrollUp']")WebElement scrollup;
@FindBy(id = "scrollUp")
private WebElement scrollUP;

@FindBy(xpath = "//*[text() ='Full-Fledged practice website for Automation Engineers']")
private WebElement visibleText;
@FindBy(xpath = "//footer[@id='footer']//div//div[2]//h2")
private WebElement sub;

	@Test
	public void scrolldown() 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,8500)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
	public void subs()
	{
		WebElement subscriptionText = driver.findElement(By.xpath("//h2[text()='Subscription']"));
		Assert.assertEquals(subscriptionText.getText(), "SUBSCRIPTION", "Subscription is Not Visible");
		System.out.println("Subscription is Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
	public void scrollup()
	{
		scrollup.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
	public void confirmtext()
	{
		WebElement confirmText = driver.findElement(By.xpath("//h2[text()='Full-Fledged practice website for Automation Engineers']"));
		Assert.assertEquals(confirmText.getText(), "Full-Fledged practice website for Automation Engineers", "Full-Fledged practice website for Automation Engineers is Not Visible");
		System.out.println("Full-Fledged practice website for Automation Engineers is Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	public void upscroll()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
	}
	
	public void scrollUpWithArrow() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", sub);
		
		System.out.println(sub.getText());
		Assert.assertEquals(sub.getText(), "SUBSCRIPTION");
		System.out.println("Subscription is visible.");
		scrollUP.click();
		Assert.assertTrue(visibleText.isDisplayed());
		System.out.println("Full-Fledged practice website for Automation Engineers text is visible");
	}
	
public void scrollUpWithoutArrow() {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", sub);
		
		System.out.println(sub.getText());
		Assert.assertEquals(sub.getText(), "SUBSCRIPTION");
		System.out.println("Subscription is visible.");
		
		js.executeScript("window.scrollTo(0, 0);");

		
		Assert.assertTrue(visibleText.isDisplayed());
		System.out.println("Full-Fledged practice website for Automation Engineers text is visible");

	}
}
