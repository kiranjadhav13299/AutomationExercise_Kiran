package Project_2_AutomationExercise;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Proceed_to_checkout {
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
    @FindBy(xpath = "//a[text()='Proceed To Checkout']")WebElement proceedtocheckout;
	@FindBy(linkText = "Register / Login")WebElement login;
	@FindBy(name = "name")WebElement name;
	@FindBy(xpath = "//input[@data-qa='signup-email']")WebElement email;
	@FindBy(xpath = "//button[text()='Signup']")WebElement signup;
	@FindBy(name = "password")WebElement password;
	@FindBy(name = "first_name")WebElement fname;
	@FindBy(name = "last_name")WebElement lname;
	@FindBy(name = "company")WebElement company;
	@FindBy(name = "address1")WebElement add1;
	@FindBy(name = "address2")WebElement add2;
	@FindBy(id = "state")WebElement state;
	@FindBy(id = "city")WebElement city;
	@FindBy(id = "zipcode")WebElement pincode;
	@FindBy(id = "mobile_number")WebElement mob;
	@FindBy(xpath = "//button[text()='Create Account']")WebElement createbutton;
	@FindBy(xpath = "//a[text()='Continue']")WebElement clickcontinue;
	@FindBy(xpath = "//textarea[@name='message']")WebElement comment;
	@FindBy(xpath = "//a[text()='Place Order']")WebElement placeorder;
	
	@Test
	
	public void proceedtocheckout()
	{
		proceedtocheckout.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void login()
	{
		login.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void name()
	{
		name.sendKeys("Ganesh");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void email()
	{
		email.sendKeys("GaneshPai@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void signup()
	{
		signup.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}	
	public void title()
	{
		WebElement radioButton = driver.findElement(By.xpath("//input[@type='radio' and @value='Mr']"));
		radioButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void password()
	{
		password.sendKeys("GaneshPai1234");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void dateOfBirth()
	{
		WebElement dayDropDown = driver.findElement(By.name("days"));
		Select dayselect = new Select(dayDropDown);
		dayselect.selectByVisibleText("1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement monthDropDown = driver.findElement(By.name("months"));
		Select monthselect = new Select(monthDropDown);
		monthselect.selectByVisibleText("December");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement yearDropDown = driver.findElement(By.name("years"));
		Select yearselect = new Select(yearDropDown);
		yearselect.selectByVisibleText("1990");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		yearDropDown.sendKeys(Keys.TAB);	
	}
	public void fname()
	{
		fname.sendKeys("Kiran");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void lname()
	{
		lname.sendKeys("Jadhav");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void company()
	{
		company.sendKeys("TATA");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void add1()
	{
		add1.sendKeys("4th Cross");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void add2()
	{
		add2.sendKeys("Kaggadaspura Layout");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void country()
	{
		WebElement countryDropDown = driver.findElement(By.name("country"));
		Select countryselect = new Select(countryDropDown);
		countryselect.selectByVisibleText("India");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void state()
	{
		state.sendKeys("Maharashtra");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void city()
	{
		city.sendKeys("Mumbai");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void pincode()
	{
		pincode.sendKeys("576101");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void mob()
	{
		mob.sendKeys("8907656780");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void createbutton()
	{
		createbutton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void confirmationmessage()
	{
		WebElement accountCreatedText = driver.findElement(By.xpath("//h2[@class='title text-center']"));
		Assert.assertEquals(accountCreatedText.getText(), "ACCOUNT CREATED!", "Account Not Created");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Account Is Created");
	}
	public void clickcontinue()
	{
		clickcontinue.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void confirmationmessagelog()
	{
		WebElement loggedInAsText = driver.findElement(By.xpath("//b[text()='Ganesh']"));
		Assert.assertEquals(loggedInAsText.getText(), "Ganesh", "Logged In as is not Displayed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Logged In As Ganesh");
	}
	public void comment()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		comment.sendKeys("Test Order");
	}
	public void placeorder()
	{
		placeorder.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}

