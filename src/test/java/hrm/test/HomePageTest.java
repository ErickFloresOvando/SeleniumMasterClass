package orange.hrm.test;

import orange.hrm.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void logout(){

        HomePage homePage = new HomePage();

        homePage.logoutFromApplication();
    }

}
