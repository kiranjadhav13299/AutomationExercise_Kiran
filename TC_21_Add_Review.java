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

public class TC_21_Add_Review {
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
	
	@FindBy(id = "name")WebElement name;
	@FindBy(id = "email")WebElement email;
	@FindBy(name = "review")WebElement review;
	@FindBy(id = "button-review")WebElement submit;
	
	@Test(priority = 1)
	public void products()
	{
 // Click on Products button link
    WebElement productsButtonLink = driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
    productsButtonLink.click();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
	public void ViewProduct ()
	{
		WebElement ViewProductLink = driver.findElement(By.xpath("//a[@href=\"/product_details/1\"]"));
	    ViewProductLink.click();

	}
			@Test (priority = 2)
	public void name()
	{
				 WebElement Namebox = driver.findElement(By.xpath("//input[@id='name']"));
			     Namebox.sendKeys("Kiran Jadhav");
		         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void email()
	{
		WebElement Emailbox = driver.findElement(By.xpath("//input[@id='email']"));
	    Emailbox.sendKeys("Kirannjadhav13299@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void review()
	{
		WebElement review = driver.findElement(By.xpath("//input[@id='review']"));
		review.sendKeys("Good Product! Fits Perfectly");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void submit()
	{
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void submitconfirm()
	{
		WebElement submitText = driver.findElement(By.xpath("//span[text()='Thank you for your review.']"));
		Assert.assertEquals(submitText.getText(), "Thank you for your review.", "Not Submitted Successfully");
		System.out.println("Review Submitted Successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
