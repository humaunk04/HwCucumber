package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefs {
    WebDriver driver;


    @Given("I navigate to https://demo.broadleafcommerce.org")
    public void i_navigate_to_https_demo_broadleafcommerce_org() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://demo.broadleafcommerce.org/");

    }

    @Given("I click SignIn")
    public void i_click_SignIn() throws InterruptedException {
        driver.findElement(By.xpath("(//*[@href='/login'])[1]")).click();
        Thread.sleep(5000);

    }

    @When("i enter Email and Password")
    public void i_enter_Email_and_Password() {
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("humaunk04@hotmail.com");
        driver.findElement(By.xpath("(//*[@id='password'])[1]")).sendKeys("Bangladesh004");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

    }

    @When("I click SignIn Button")
    public void i_click_SignIn_Button() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
        Thread.sleep(5000);

    }

    @Then("I should see MyAccount")
    public void i_should_see_MyAccount() {

    }

    @Then("I close the brower")
    public void i_close_the_brower() {
        driver.quit();

    }

}
