package yandexTests;

import com.UserOperations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.ConstructorPage;
import pages.LoginPage;
import pages.PersonalAreaPage;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;


public class PersonalAreaTests {

    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/a.khudyakova/Downloads/yandexdriver-22.1.0.2410-win/yandexdriver.exe");
    }

    @Test
    public void checkSuccessTransitionButtonStellarBurgersYandex(){
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
        constructorPage.clickButtonPersonalArea();
        PersonalAreaPage personalAreaPage =
                open("https://stellarburgers.nomoreparties.site/account",
                        PersonalAreaPage.class);
        personalAreaPage.clickButtonStellarBurgers();
        constructorPage.checkAssembleABurgerText();
        userOperations.delete();
    }

    @Test
    public void checkSuccessTransitionButtonConstructorYandex(){
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
        constructorPage.clickButtonPersonalArea();
        PersonalAreaPage personalAreaPage =
                open("https://stellarburgers.nomoreparties.site/account",
                        PersonalAreaPage.class);
        personalAreaPage.clickButtonConstructor();
        constructorPage.checkAssembleABurgerText();
        userOperations.delete();
    }

    @Test
    public void checkSuccessExitYandex(){
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
        constructorPage.clickButtonPersonalArea();
        PersonalAreaPage personalAreaPage =
                open("https://stellarburgers.nomoreparties.site/account",
                        PersonalAreaPage.class);
        personalAreaPage.clickButtonExit();
        loginPage.checkLoginText();
        userOperations.delete();
    }

    @After
    public void tearDown(){
        closeWebDriver();
    }
}

