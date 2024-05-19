package Project_2_AutomationExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class TC_09_Search_Product {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        // Set the path of chromedriver.exe in your system
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Computer\\Desktop\\Java Programs\\Selenium\\drivers\\chromedriver.exe");

        // Initialize ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void searchProduct() {
        // Navigate to the Website
        driver.get("http://automationexercise.com");
        
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

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
