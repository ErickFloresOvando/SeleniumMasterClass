package hrm.test;

import hrm.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void logout(){

        HomePage homePage = new HomePage();

        homePage.logoutFromApplication();
    }

}
