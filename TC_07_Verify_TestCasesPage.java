package Project_2_AutomationExercise;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TC_07_Verify_TestCasesPage {
	WebDriver driver;

    @BeforeTest
    public void setup() {
        // Set the path of chromedriver.exe in your system
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer\\Desktop\\Java Programs\\Selenium\\drivers\\chromedriver.exe");

        // Initialize ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void LogintoyourAccount() {
        // Navigate to the website
        driver.get("http://automationexercise.com");
        
        // Click on Contact Us link
        WebElement TestCasesbuttonLink = driver.findElement(By.linkText("Test Cases"));
        TestCasesbuttonLink.click();
    }
    @AfterTest
	public void terminateBrowser(){
	driver.close();
        
        
}

}
