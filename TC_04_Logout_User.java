package Project_2_AutomationExercise;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TC_04_Logout_User {

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
        
        // Click on Sign In link
        WebElement signInLink = driver.findElement(By.linkText("Signup / Login"));
        signInLink.click();

        // Enter email and password
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("kirannjadhav13299@gmail.com");

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("Kiransagar#123");

        // Click on Sign In button
        WebElement LoginButton = driver.findElement(By.cssSelector("button[data-qa='login-button']"));
        LoginButton.click();
        
        WebElement Logoutbutton = driver.findElement(By.linkText("Logout"));
        Logoutbutton.click();
        
      	{
      		driver.close();
      	}

      	

    }

}
