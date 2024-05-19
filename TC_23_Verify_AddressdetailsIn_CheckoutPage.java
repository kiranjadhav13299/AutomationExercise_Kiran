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
public class TC_23_Verify_AddressdetailsIn_CheckoutPage {
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
	@FindBy(name = "password")WebElement password;
	
    @Test(priority = 1)
    public void navigateToSignupPage() {
        driver.get("http://automationexercise.com");
        driver.findElement(By.linkText("Signup / Login")).click();
    }

    @Test(priority = 2)
    public void fillOutAccountCreationForm() {
    	
            // Fill the entire form
    	WebElement NameField = driver.findElement(By.name("name"));
    	NameField.sendKeys("Kiran Jadhav");

    	WebElement emailField = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
    	emailField.sendKeys("Kirannjadhav13299@gmail.com");
    	
    	WebElement Signup = driver.findElement(By.xpath("//button[text()='Signup']"));
    	Signup.click();
    }
    
    @Test(priority=3)
    
	public void title()
	{
		WebElement radioButton = driver.findElement(By.xpath("//input[@type='radio' and @value='Mrs']"));
		radioButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void password()
	{
		password.sendKeys("Kiransagar#123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void dateOfBirth()
	{
		WebElement dayDropDown = driver.findElement(By.name("days"));
		Select dayselect = new Select(dayDropDown);
		dayselect.selectByVisibleText("13");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement monthDropDown = driver.findElement(By.name("months"));
		Select monthselect = new Select(monthDropDown);
		monthselect.selectByVisibleText("Feb");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement yearDropDown = driver.findElement(By.name("years"));
		Select yearselect = new Select(yearDropDown);
		yearselect.selectByVisibleText("1999");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		yearDropDown.sendKeys(Keys.TAB);
		
	}
	public void newsletter()
	{
		WebElement newslettercheckbox = driver.findElement(By.id("newsletter"));
		newslettercheckbox.sendKeys(Keys.SPACE);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		newslettercheckbox.sendKeys(Keys.TAB);
	}
	public void specialoffer()
	{
		WebElement specialoffercheckbox = driver.findElement(By.id("optin"));
		specialoffercheckbox.sendKeys(Keys.SPACE);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	//Enter Address Info
    @Test(priority = 4)
    public void fname()
	{
		fname.sendKeys("Kajol");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void lname()
	{
		lname.sendKeys("Hebbar");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void company()
	{
		company.sendKeys("Kia");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void add1()
	{
		add1.sendKeys("4th Cross");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void add2()
	{
		add2.sendKeys("Gundappa Layout");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void country()
	{
		WebElement countryDropDown = driver.findElement(By.name("country"));
		Select countryselect = new Select(countryDropDown);
		countryselect.selectByVisibleText("India");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void state()
	{
		state.sendKeys("Karnataka");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void city()
	{
		city.sendKeys("Bengaluru");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void pincode()
	{
		pincode.sendKeys("576101");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void mob()
	{
		mob.sendKeys("890789678");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void createbutton()
	{
		createbutton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
	

}
