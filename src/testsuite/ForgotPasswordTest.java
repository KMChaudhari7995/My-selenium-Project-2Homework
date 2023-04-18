package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends LoginTest {
    String baseUrl= "https://opensource-demo.orangehrmlive.com/"; //

    @Before
    public void setUp() {
        openBrowser(baseUrl);//opening the url
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();//finding the value for forgot password nd click
        String expectedMessage= "Reset Password";//Storing the expected message
        WebElement actualMessage = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));//finding the Actual message
        String actualMessage1 =actualMessage.getText();//Storing Actual message value
        Assert.assertEquals("Error Message",expectedMessage,actualMessage1);//comparing the both value
    }


    @After
    public void tearDown() {
        //closing the browser
        closeBrowser();
    }

}
