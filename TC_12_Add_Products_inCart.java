package Project_2_AutomationExercise;
import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_12_Add_Products_inCart {
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
	@FindBy(xpath = "//a[@href='/view_cart']")WebElement cart;
	
	@Test
	public void Product() 
	{
		//Click on Products
				WebElement productsButtonLink = driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
		        productsButtonLink.click();
	}
	public void addtocartproduct()
	{
		WebElement firstProduct = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[4]/div/div[1]/div[1]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(firstProduct).perform();
        
        WebElement addToCartButton = firstProduct.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a"));
        addToCartButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void confirmshoppingcart()
	{
		WebElement shoppingCartText = driver.findElement(By.xpath("//li[text()='Shopping Cart']"));
		Assert.assertEquals(shoppingCartText.getText(), "Shopping Cart", "Not in Shopping Cart Page");
		System.out.println("We Are In Shopping Cart Page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}

