package Project_2_AutomationExercise;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_14_Register_while_checkout {
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
    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div[1]/div[5]/div/div[1]/div[1]/a/i")WebElement addtocart;
	@FindBy(xpath = "//button[text()='Continue Shopping']")WebElement continueshop;
	
	@Test
	public void addtocart()
	{
		addtocart.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void continueshop()
	{
		continueshop.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
}
