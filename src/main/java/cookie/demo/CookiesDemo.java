package cookie.demo;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesDemo {
    public static void main(String[] args) {

        //Open google chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/erickfloresovando/Downloads/chromedriver-mac-arm64/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open application
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //Object of cookie
        Cookie myCookie = new Cookie("testName","testValue");
        driver.manage().addCookie(myCookie);

        //Get Cookies
        Set<Cookie> allCookies = driver.manage().getCookies();

        for (Cookie ck : allCookies){
            System.out.println(ck.getName() + "==" + ck.getExpiry()+"=="+ck.getDomain());
        }

        //Delete cookie
        driver.manage().deleteCookieNamed("orangehrm");

        //Delete all cookies
        //driver.manage().deleteAllCookies();

        System.out.println("=======================================");

        Set<Cookie> allCookiesAfterDelete = driver.manage().getCookies();
        for (Cookie ck : allCookiesAfterDelete){
            System.out.println(ck.getName() + "==" + ck.getExpiry()+"=="+ck.getDomain());
        }



    }
}
