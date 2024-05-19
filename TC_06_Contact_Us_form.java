package Project_2_AutomationExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TC_06_Contact_Us_form {
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
        WebElement ContactusLink = driver.findElement(By.linkText("Contact us"));
        ContactusLink.click();

        //Enter details in Get in touch section
        WebElement NameInput = driver.findElement(By.name("name"));
        NameInput.sendKeys("kiran jadhav");
        
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("kirannjadhav13299@gmail.com");
        
        WebElement SubjectInput = driver.findElement(By.name("subject"));
        SubjectInput.sendKeys("Ecommerce Brand");
        
        WebElement MessageInput = driver.findElement(By.name("message"));
        MessageInput.sendKeys("It is very useful website for QA");
        
        // Assuming there is a file input field
        WebElement fileinput = driver.findElement(By.name("upload_file"));
        fileinput.sendKeys("C:\\Users\\Computer\\Desktop\\Module 3 Assignments");
        
        WebElement Submitbutton = driver.findElement(By.xpath("//input[@type='submit']"));
        Submitbutton.click();
        
    
        Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println(a.getText());
		a.accept();
		
		 // Click on Home button link
        WebElement HomebuttonLink = driver.findElement(By.linkText(" Home "));
        HomebuttonLink.click();
    }      
        @AfterTest
    	public void terminateBrowser(){
    	driver.close();
		
        
     
    }
}
