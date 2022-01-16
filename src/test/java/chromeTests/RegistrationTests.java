package chromeTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;
import pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;


public class RegistrationTests {

    public static final String EMAIL_POSTFIX = "@yandex.ru";
    RegistrationPage registrationPage;

    @Before
    public void before(){
        registrationPage = open("https://stellarburgers.nomoreparties.site/register",
                        RegistrationPage.class);
    }

    @Test
    public void checkSuccessRegistrationChrome() {
        String email = RandomStringUtils.randomAlphabetic(10) + EMAIL_POSTFIX;
        String password = RandomStringUtils.randomAlphabetic(10);
        String name = RandomStringUtils.randomAlphabetic(10);
        registrationPage.register(name, email, password);
        LoginPage login =
                open("https://stellarburgers.nomoreparties.site/login",
                        LoginPage.class);
        login.checkLoginText();
    }

    @Test
    public void checkUnsuccessfulRegistrationChrome() {
        String email = RandomStringUtils.randomAlphabetic(10) + EMAIL_POSTFIX;
        String password = RandomStringUtils.randomAlphabetic(5);
        String name = RandomStringUtils.randomAlphabetic(10);
        registrationPage.register(name, email, password);
        registrationPage.checkIncorrectPasswordText();
    }

    @After
    public void tearDown(){
        closeWebDriver();
    }
}
