package chromeTests;

import com.UserOperations;
import org.junit.After;
import org.junit.Test;
import pages.ConstructorPage;
import pages.ForgotPasswordPage;
import pages.LoginPage;
import pages.RegistrationPage;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;


public class LoginTests {

    @Test
    public void checkSuccessLoginRegistrationFormChrome(){
        UserOperations userOperations = new UserOperations();
        Map<String, String> response = userOperations.register();
        String email = response.get("email");
        String password = response.get("password");
        RegistrationPage registrationPage = open("https://stellarburgers.nomoreparties.site/register",
                RegistrationPage.class);
        registrationPage.clickButtonLogin();
        LoginPage loginPage =
                open("https://stellarburgers.nomoreparties.site/login",
                        LoginPage.class);
        loginPage.login(email, password);
        ConstructorPage constructorPage =
                open("https://stellarburgers.nomoreparties.site/",
                        ConstructorPage.class);
        constructorPage.checkAssembleABurgerText();
        userOperations.delete();
    }

    @Test
    public void checkSuccessLoginPersonalAreaChrome(){
        UserOperations userOperations = new UserOperations();
        Map<String, String> response = userOperations.register();
        String email = response.get("email");
        String password = response.get("password");
        ConstructorPage constructorPage =
                open("https://stellarburgers.nomoreparties.site/",
                        ConstructorPage.class);
        constructorPage.clickButtonPersonalArea();
        LoginPage loginPage =
                open("https://stellarburgers.nomoreparties.site/login",
                        LoginPage.class);
        loginPage.login(email, password);
        ConstructorPage constructorPage2 =
                open("https://stellarburgers.nomoreparties.site/",
                        ConstructorPage.class);
        constructorPage2.checkAssembleABurgerText();
        userOperations.delete();
    }

    @Test
    public void checkSuccessLoginButtonSignInChrome(){
        UserOperations userOperations = new UserOperations();
        Map<String, String> response = userOperations.register();
        String email = response.get("email");
        String password = response.get("password");
        ConstructorPage constructorPage =
                open("https://stellarburgers.nomoreparties.site/",
                        ConstructorPage.class);
        constructorPage.clickButtonSignIn();
        LoginPage loginPage =
                open("https://stellarburgers.nomoreparties.site/login",
                        LoginPage.class);
        loginPage.login(email, password);
        ConstructorPage constructorPage2 =
                open("https://stellarburgers.nomoreparties.site/",
                        ConstructorPage.class);
        constructorPage2.checkAssembleABurgerText();
        userOperations.delete();
    }

    @Test
    public void checkSuccessLoginForgotPasswordChrome(){
        UserOperations userOperations = new UserOperations();
        Map<String, String> response = userOperations.register();
        String email = response.get("email");
        String password = response.get("password");
        ForgotPasswordPage forgotPasswordPage =
                open("https://stellarburgers.nomoreparties.site/forgot-password",
                        ForgotPasswordPage.class);
        forgotPasswordPage.clickButtonLogin();
        LoginPage loginPage =
                open("https://stellarburgers.nomoreparties.site/login",
                        LoginPage.class);
        loginPage.login(email, password);
        ConstructorPage constructorPage2 =
                open("https://stellarburgers.nomoreparties.site/",
                        ConstructorPage.class);
        constructorPage2.checkAssembleABurgerText();
        userOperations.delete();
    }

    @After
    public void tearDown(){
        closeWebDriver();
    }
}
