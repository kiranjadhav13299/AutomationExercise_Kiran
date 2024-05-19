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

public class TC_05_Registeruserwith_ExistingEmail {
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
        // Fill the entire form
        WebElement firstName = driver.findElement(By.name("name"));
        firstName.sendKeys("Kiran Jadhav");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("kirannjadhav13299@gmail.com");
        
        

        

   // @AfterClass
    //public void tearDown() 
    {
        if (driver != null) {
            driver.quit();
        }
    }
}
}
