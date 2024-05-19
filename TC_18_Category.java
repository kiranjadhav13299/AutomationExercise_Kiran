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

public class TC_18_Category {
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
	@FindBy(xpath = "//a[@href='#Women']")WebElement women;
	@FindBy(xpath = "//a[@href=\"/category_products/2\"]")WebElement tops;
	@FindBy(xpath = "//a[@href='#Men']")WebElement men;
	@FindBy(xpath = "//a[@href='/category_products/6']")WebElement jeans;
	
	@Test
	public void women()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		WebElement Women = driver.findElement(By.xpath("//a[contains(text(),'WOMEN')]"));
        Women.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void tops()
	{
		tops.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void womenstopsconfirm()
	{
		WebElement womensTopsText = driver.findElement(By.xpath("//h2[text()='Women - Tops Products']"));
		Assert.assertEquals(womensTopsText.getText(), "WOMEN - TOPS PRODUCTS", "Tops is not Visible");
		System.out.println("WOMEN - TOPS PRODUCTS are Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void men()
	{
		men.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void jeans()
	{
		jeans.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void menjeansconfirm()
	{
		WebElement womensTopsText = driver.findElement(By.xpath("//h2[text()='Men - Jeans Products']"));
		Assert.assertEquals(womensTopsText.getText(), "MEN - JEANS PRODUCTS", "Jeans is not Visible");
		System.out.println("MEN - JEANS PRODUCTS are Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
