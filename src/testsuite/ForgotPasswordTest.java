package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
String baseUrl = "https://opensource-demo.orangehrmlive.com/";
@Before
    public void setUp(){
    openBrowser(baseUrl);
}
@Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
    clickOnElement(By.linkText(""));
   // sendTextToElement(By.xpath());
    String expectedMessage = "Reset Password";
    String actualMessage = getTextFromElement(By.xpath(""));
    Assert.assertEquals("Reset Password",expectedMessage,actualMessage);
    ;
}
}
