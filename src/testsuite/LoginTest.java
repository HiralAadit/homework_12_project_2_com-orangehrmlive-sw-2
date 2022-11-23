package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        // Enter “Admin” username
        sendTextToElement(By.name("username"), "Admin");
        //* Enter “admin123“ password
        sendTextToElement(By.name("password"), "admin123");
// Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
        //Verify the ‘Dashboard’ text is display
        String expectedMessage = "Dashboard";
        String actualMessage = getTextFromElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
        Assert.assertEquals("Dashboard", expectedMessage, actualMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}

