package Project_2_AutomationExercise;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TC_22_AddtoCart_from_RecommendedItems {
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
@FindBy(xpath = "//a[@data-product-id='6']")WebElement addtocart;
	
@Test
	public void recomendedconfirm()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,7500)");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement recomendedText = driver.findElement(By.xpath("//h2[text()='recommended items']"));
		Assert.assertEquals(recomendedText.getText(), "RECOMMENDED ITEMS", "Recommended Items Not Visible");
		System.out.println("Recommended Items Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void addtocart()
	{
		addtocart.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void confirmproduct()
	{
		WebElement recomendedText = driver.findElement(By.xpath("//a[text()='Summer White Top']"));
		Assert.assertEquals(recomendedText.getText(), "Summer White Top", "Items Not Visible");
		System.out.println("Items Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
