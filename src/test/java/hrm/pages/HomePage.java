package hrm.pages;

import hrm.test.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import report.ExtentReportUtils;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class HomePage {

    //Constructor

    public HomePage(){
        PageFactory.initElements(BaseTest.driver, this);
    }

    //Locators
    @FindBy(xpath = "//a[text()='Admin']")
    WebElement adminlink;

    @FindBy(xpath = "//img[@alt=\"profile picture\"]")
    WebElement profilePicture;

    @FindBy(linkText = "Logout")
    WebElement logoutLink;

    Logger log = LogManager.getLogger(HomePage.class);

    //ActionMethods

    public void clickOnAdminLink(){
        adminlink.click();
        log.info("Admin link is clicked");
    }

    public void logoutFromApplication(){
        profilePicture.click();
        log.info("Profile picture is clicked");
        ExtentReportUtils.addStep("Profile picture image is clicked");

        logoutLink.click();
        log.info("Logout link is clicked");
        ExtentReportUtils.addStep("Logout link is clicked");
    }

}
