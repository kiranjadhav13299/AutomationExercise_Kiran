package Project_2_AutomationExercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_01_RegisterUser {
	private WebDriver driver;

    @BeforeClass
    public void setup() {
        // Set the path of chromedriver.exe in your system
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer\\Desktop\\Java Programs\\Selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void navigateToSignupPage() {
        driver.get("http://automationexercise.com");
        driver.findElement(By.linkText("Signup / Login")).click();
    }

    @Test(priority = 2)
    public void fillOutAccountCreationForm() {
    	 // Enter email and password
        WebElement emailInput = driver.findElement(By.name("name"));
        emailInput.sendKeys("Kiran Patare");

        WebElement passwordInput = driver.findElement(By.name("email"));
        passwordInput.sendKeys("s.patare11@gmail.com");
        
        WebElement SignupButton = driver.findElement(By.cssSelector("button['data-qa=\"signup-button']"));
        SignupButton.click();

        

   // @AfterClass
    //public void tearDown() 
    {
        if (driver != null) {
            driver.quit();
        }
    }
}


}
