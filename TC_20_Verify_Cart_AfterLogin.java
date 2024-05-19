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

public class TC_20_Verify_Cart_AfterLogin {
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
	@FindBy(name = "search")WebElement search;
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")WebElement clicksearch;
	@FindBy(name = "search")WebElement searchtshirt;
	@FindBy(xpath = "//a[@data-product-id='2']")WebElement add1;
	@FindBy(xpath = "//a[@data-product-id='28']")WebElement add2;
	@FindBy(xpath = "//a[@data-product-id='29']")WebElement add3;
	@FindBy(xpath = "//a[@data-product-id='30']")WebElement add4;
    
	@Test(priority = 1)
	public void products()
	{
 // Click on Products button link
    WebElement productsButtonLink = driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
    productsButtonLink.click();
    
    // Find the search box element
    //WebElement searchBox = driver.findElement(By.xpath("//input[@id='search_product']"));
    WebElement searchBox = driver.findElement(By.name("search"));
    // Enter a search query
    searchBox.sendKeys("Tops");

    // Submit the search query
    WebElement searchBox2 = driver.findElement(By.tagName("button"));
    searchBox2.click();
    // Wait for the search results to load (you may need to implement explicit wait here)
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
	@Test(priority = 2)
	public void search()
	{
		search.sendKeys("Long Maxi Tulle Fancy Dress Up Outfits -Pink");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void clicksearch()
	{
		clicksearch.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void searchconfirm()
	{
		WebElement searchedProductText = driver.findElement(By.xpath("//h2[@class='title text-center']"));
		Assert.assertEquals(searchedProductText.getText(), "SEARCHED PRODUCTS", "Searched products are not Displayed");
		System.out.println("Searched Products are Displayed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void productconfirm()
	{
		WebElement productConfirmText = driver.findElement(By.xpath("//p[text()='Long Maxi Tulle Fancy Dress Up Outfits -Pink']"));
		Assert.assertEquals(productConfirmText.getText(), "Long Maxi Tulle Fancy Dress Up Outfits -Pink", "Products are not Displayed");
		System.out.println("Products are Displayed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void searchtshirt()
	{
		searchtshirt.sendKeys("Tshirt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void add1()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		add1.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void add2()
	{
		add2.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void add3()
	{
		add3.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void add4()
	{
		add4.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
}
