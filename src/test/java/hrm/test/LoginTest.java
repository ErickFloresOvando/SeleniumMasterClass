package hrm.test;

import hrm.pages.LoginPage;

public class LoginTest extends BaseTest{

    public void loginWithValidUserNameAndValidPassword(){

        LoginPage loginPage = new LoginPage();

        loginPage.loginToApplication(PropertiesUtility.getData("username"), PropertiesUtility.getData("password"))


    }


}
