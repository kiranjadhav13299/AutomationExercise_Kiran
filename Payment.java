package Project_2_AutomationExercise;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Payment {
	WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer\\Desktop\\Java Programs\\Selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationexercise.com");// Navigate to url 'https://magento.softwaretestingboard.com/'
    }
    
    @FindBy(name = "name_on_card")WebElement nameoncard;
	@FindBy(name = "card_number")WebElement cardnum;
	@FindBy(name = "cvc")WebElement cvc;
	@FindBy(name = "expiry_month")WebElement expmon;
	@FindBy(name = "expiry_year")WebElement expyr;
	@FindBy(xpath = "//button[@class='form-control btn btn-primary submit-button']")WebElement payconf;
	@Test
	public void nameoncard()
	{
		nameoncard.sendKeys("Kiran");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void cardnum()
	{
		cardnum.sendKeys("908765432678");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void cvc()
	{
		cvc.sendKeys("319");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void expmon()
	{
		expmon.sendKeys("05");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void expyr()
	{
		expyr.sendKeys("2026");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void payconf()
	{
		payconf.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void orderplacedconfirm()
	{
		WebElement orderPlacedText = driver.findElement(By.xpath("//p[text()='Congratulations! Your order has been confirmed!']"));
		Assert.assertEquals(orderPlacedText.getText(), "Congratulations! Your order has been confirmed!", "Order not placed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Order Placed");
	}
}

