package chromeTests;

import com.UserOperations;
import org.junit.After;
import org.junit.Test;
import pages.ConstructorPage;
import pages.LoginPage;
import pages.PersonalAreaPage;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;


public class ConstructorTests {

    @Test
    public void checkSuccessTransitionPersonalAreaChrome(){
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
        personalAreaPage.checkButtonProfile();
        userOperations.delete();
    }

    @Test
    public void checkSuccessTransitionSaucesChrome(){
        ConstructorPage constructorPage =
                open("https://stellarburgers.nomoreparties.site/",
                        ConstructorPage.class);
        constructorPage.clickButtonSauces();
        constructorPage.checkSaucesText();
    }

    @Test
    public void checkSuccessTransitionBunChrome(){
        ConstructorPage constructorPage =
                open("https://stellarburgers.nomoreparties.site/",
                        ConstructorPage.class);
        constructorPage.clickButtonStuffing();
        constructorPage.clickButtonBun();
        constructorPage.checkBunText();
    }

    @Test
    public void checkSuccessTransitionStuffingChrome(){
        ConstructorPage constructorPage =
                open("https://stellarburgers.nomoreparties.site/",
                        ConstructorPage.class);
        constructorPage.clickButtonStuffing();
        constructorPage.checkStuffingText();
    }

    @After
    public void tearDown(){
        closeWebDriver();
    }
}
