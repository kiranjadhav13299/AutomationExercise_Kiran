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
public class TC_17_Remove_productFrom_Cart {
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
	@FindBy(xpath = "//button[@class='btn btn-default cart']")WebElement cart;
	@FindBy(xpath = "//a[@class='cart_quantity_delete']")WebElement delete;
	
	@Test(priority = 1)

	public void Add_to_cart()
	{
	  //Click on Products
		WebElement productsButtonLink = driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
        productsButtonLink.click();
        
      //Click on first product
        WebElement ProductLink = driver.findElement(By.xpath("(//a[contains(text(),'Add to cart')])[1]"));
        ProductLink.click();
        
     // Click on Add to Cart button 
        WebElement AddtoCart = driver.findElement(By.tagName("button"));
        AddtoCart.click();
        
     //Click on Continue Shopping button
        WebElement ContinueShoppingButton = driver.findElement(By.xpath("//a[contains(text(),'Continue Shopping')]"));
        ContinueShoppingButton.click();
      
      //Click on Cart
      		WebElement CartsButtonLink = driver.findElement(By.xpath("//a[contains(text(),'Cart')]"));
              CartsButtonLink.click();

	}
	
	@Test(priority = 2)
	public void delete()
	{
		delete.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void emptyconfirm()
	{
		WebElement emptyText = driver.findElement(By.xpath("//a[@href=\"/products\"]/child::u"));
		Assert.assertEquals(emptyText.getText(), "here", "Cart is Not Empty");
		System.out.println("Cart is empty!");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}

