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

public class TC_19_Brands {
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
	@FindBy(xpath = "//a[@href='/brand_products/H&M']")WebElement handm;
	@FindBy(xpath = "//a[@href='/brand_products/Allen Solly Junior']")WebElement allensolly;
	
	@Test
	public void brandsconfirm()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		WebElement brandsText = driver.findElement(By.xpath("//h2[text()='Brands']"));
		Assert.assertEquals(brandsText.getText(), "BRANDS", "Brand is not Visible");
		System.out.println("BRANDS are Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void handm()
	{
		handm.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void handmconfirm()
	{		
		WebElement handmText = driver.findElement(By.xpath("//h2[text()='Brand - H&M Products']"));
		Assert.assertEquals(handmText.getText(), "BRAND - H&M PRODUCTS", "H&M PRODUCTS is not Visible");
		System.out.println("H&M PRODUCTS are Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void allensolly()
	{
		allensolly.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void allensollyconfirm()
	{
		WebElement handmText = driver.findElement(By.xpath("//h2[text()='Brand - Allen Solly Junior Products']"));
		Assert.assertEquals(handmText.getText(), "BRAND - ALLEN SOLLY JUNIOR PRODUCTS", "Allen Solly PRODUCTS is not Visible");
		System.out.println("Allen Solly PRODUCTS are Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
