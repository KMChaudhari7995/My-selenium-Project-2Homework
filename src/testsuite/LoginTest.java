package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);//opening the url
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        driver.findElement(By.name("username")).sendKeys("Admin");//finding the element and sending the key for Username
        driver.findElement(By.name("password")).sendKeys("admin123");//finding the element and sending the key for password
        driver.findElement(By.xpath("//button[@type='submit']")).click();//finding the element  submit and click
        String expectedMessage = "Dashboard";//Storing the expected message
        WebElement actualMessage = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));//finding the element for actual message
        String actualMessage1 = actualMessage.getText();//Storing the Actual message
        Assert.assertEquals("Error Message is not Displayed ", actualMessage1, expectedMessage);//Comparing the both value
    }

    @After
    public void tearDown() {
        //closing the browser
        closeBrowser();
    }


}
