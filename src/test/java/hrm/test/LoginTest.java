package orange.hrm.test;

import orange.hrm.pages.LoginPage;

public class LoginTest extends BaseTest{

    public void loginWithValidUserNameAndValidPassword(){

        LoginPage loginPage = new LoginPage();

        loginPage.loginToApplication(PropertiesUtility.getData("username"), PropertiesUtility.getData("password"))


    }


}
