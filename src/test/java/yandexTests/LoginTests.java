package yandexTests;

import com.UserOperations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.ConstructorPage;
import pages.ForgotPasswordPage;
import pages.LoginPage;
import pages.RegistrationPage;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;


public class LoginTests {


    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/a.khudyakova/Downloads/yandexdriver-22.1.0.2410-win/yandexdriver.exe");
    }

        @Test
    public void checkSuccessLoginRegistrationFormYandex(){
        UserOperations userOperations = new UserOperations();
        Map<String, String> response = userOperations.register();
        String email = response.get("email");
        String password = response.get("password");
        RegistrationPage registrationPage =
                open(RegistrationPage.URL,
                RegistrationPage.class);
        registrationPage.clickButtonLogin();
        LoginPage loginPage =
                open(LoginPage.URL,
                        LoginPage.class);
        loginPage.login(email, password);
        ConstructorPage constructorPage =
                open(ConstructorPage.URL,
                        ConstructorPage.class);
        constructorPage.checkAssembleABurgerText();
        userOperations.delete();
    }

    @Test
    public void checkSuccessLoginPersonalAreaYandex(){
        UserOperations userOperations = new UserOperations();
        Map<String, String> response = userOperations.register();
        String email = response.get("email");
        String password = response.get("password");
        ConstructorPage constructorPage =
                open(ConstructorPage.URL,
                        ConstructorPage.class);
        constructorPage.clickButtonPersonalArea();
        LoginPage loginPage =
                open(LoginPage.URL,
                        LoginPage.class);
        loginPage.login(email, password);
        ConstructorPage constructorPage2 =
                open(ConstructorPage.URL,
                        ConstructorPage.class);
        constructorPage2.checkAssembleABurgerText();
        userOperations.delete();
    }

    @Test
    public void checkSuccessLoginButtonSignInYandex(){
        UserOperations userOperations = new UserOperations();
        Map<String, String> response = userOperations.register();
        String email = response.get("email");
        String password = response.get("password");
        ConstructorPage constructorPage =
                open(ConstructorPage.URL,
                        ConstructorPage.class);
        constructorPage.clickButtonSignIn();
        LoginPage loginPage =
                open(LoginPage.URL,
                        LoginPage.class);
        loginPage.login(email, password);
        ConstructorPage constructorPage2 =
                open(ConstructorPage.URL,
                        ConstructorPage.class);
        constructorPage2.checkAssembleABurgerText();
        userOperations.delete();
    }

    @Test
    public void checkSuccessLoginForgotPasswordYandex(){
        UserOperations userOperations = new UserOperations();
        Map<String, String> response = userOperations.register();
        String email = response.get("email");
        String password = response.get("password");
        ForgotPasswordPage forgotPasswordPage =
                open(ForgotPasswordPage.URL,
                        ForgotPasswordPage.class);
        forgotPasswordPage.clickButtonLogin();
        LoginPage loginPage =
                open(LoginPage.URL,
                        LoginPage.class);
        loginPage.login(email, password);
        ConstructorPage constructorPage2 =
                open(ConstructorPage.URL,
                        ConstructorPage.class);
        constructorPage2.checkAssembleABurgerText();
        userOperations.delete();
    }

    @After
    public void tearDown(){
        closeWebDriver();
    }
}
