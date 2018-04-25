package seleniumgluecode;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class test {
    public static WebDriver driver;
    @Given("^user is  on homepage$")
    public void user_is_on_homepage() throws Throwable {     
    	System.setProperty("webdriver.chrome.driver","chromedriver");
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");
        
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://10.100.210.12:8080/WebApp/");
    }
    
    @When("^user navigates to Click me$")
    public void user_navigates_to_Login_Page() throws Throwable {
    	for (int x=0; x<10; x++ ) {
    	Thread.sleep(500);
        driver.findElement(By.name("clickme") ).click();
    	}
    }
    

    
    @Then("^success message is Counter data is correct$")
    public void success_message_is_displayed() throws Throwable {
    	String num ="10";
    	String actual = driver.findElement(By.id("clicks")).getText();
    	Assert.assertEquals(num, actual);
        driver.quit();  
    }      
}