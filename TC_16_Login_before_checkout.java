package Project_2_AutomationExercise;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.Keys;

public class TC_16_Login_before_checkout {
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
    
    @Test(priority = 1)
    public void navigateToSignupPage() {
        driver.get("http://automationexercise.com");
        driver.findElement(By.linkText("Signup / Login")).click();
    }

    @Test(priority = 2)
    public void fillOutAccountCreationForm() {
    	
    	// Enter email and password
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("kirannjadhav13299@gmail.com");

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("Kiransagar#123");

        // Click on Sign In button
        WebElement LoginButton = driver.findElement(By.cssSelector("button[data-qa='login-button']"));
        LoginButton.click();
    }
}
