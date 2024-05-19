package Project_2_AutomationExercise;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_11_Verify_Subscription_in_CartPage {

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
    @FindBy(xpath = "//input[@id='susbscribe_email']")WebElement subemail;
	@FindBy(xpath = "//button[@id='subscribe']")WebElement submit;
	@FindBy(xpath = "//a[@id='scrollUp']")WebElement scrollup;
    

    

    @Test
    public void clickProductsButton() {
        // Click 'Cart' button
    	WebElement CartButtonLink = driver.findElement(By.xpath("//a[contains(text(),'Cart')]"));
        CartButtonLink.click();
    }
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
    	public void subscriptionconfirm()
    	{
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		js.executeScript("window.scrollBy(0,1000)");
    		
    		WebElement subscriptionText = driver.findElement(By.xpath("//h2[text()='Subscription']"));
    		Assert.assertEquals(subscriptionText.getText(), "SUBSCRIPTION", "Subscription is Not Visible");
    		System.out.println("Subscription is Visible");
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	}
    	public void subemail()
    	{
    		subemail.sendKeys("Kirannjadhav13299@gmail.com");
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	}
    	public void submit()
    	{
    		submit.click();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	}
    	public void successconfirm()
    	{
    		WebElement subscriptionText = driver.findElement(By.xpath("//div[@class='alert-success alert']"));
    		Assert.assertEquals(subscriptionText.getText(), "You have been successfully subscribed!", "Subscription Not Successfull");
    		System.out.println("Subscription Successfull");
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
    
    @AfterClass
    public void tearDown() {
        // Close the WebDriver instance
        driver.quit();
    }
}
