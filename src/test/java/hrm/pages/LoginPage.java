package orange.hrm.pages;

import orange.hrm.test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import report.ExtentReportUtils;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoginPage extends  BaseTest {

    //Constructor

    public LoginPage(){
        PageFactory.initElements(BaseTest.driver, this);
    }

    //Locators
    //Username
    @FindBy(name = "username")
    WebElement usernameTextBox;

    //Password
    @FindBy(name = "password")
    WebElement passwordTextBox;

    //Login Button
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBTn;

    Logger log = LogManager.getLogger(LoginPage.class);


    //Action Methods
    public void loginToApplication(String userName, String password) {

        usernameTextBox.sendKeys(userName);
        log.info("Username is entered in username text box");
        ExtentReportUtils.addStep("Username is entered");

        passwordTextBox.sendKeys(password);
        log.info("Password is entered in password text box");
        ExtentReportUtils.addStep("Password value is entered in Password text box");

        loginBTn.click();
        log.info("Login button is clicked");
        ExtentReportUtils.addStep("Login button is clicked");


    }

}
