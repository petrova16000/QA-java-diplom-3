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


public class PersonalAreaTests {

    @Test
    public void checkSuccessTransitionButtonStellarBurgersChrome(){
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
        constructorPage.clickButtonPersonalArea();
        PersonalAreaPage personalAreaPage =
                open(PersonalAreaPage.URL,
                        PersonalAreaPage.class);
        personalAreaPage.clickButtonStellarBurgers();
        constructorPage.checkAssembleABurgerText();
        userOperations.delete();
    }

    @Test
    public void checkSuccessTransitionButtonConstructorChrome(){
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
        constructorPage.clickButtonPersonalArea();
        PersonalAreaPage personalAreaPage =
                open(PersonalAreaPage.URL,
                        PersonalAreaPage.class);
        personalAreaPage.clickButtonConstructor();
        constructorPage.checkAssembleABurgerText();
        userOperations.delete();
    }

    @Test
    public void checkSuccessExitChrome(){
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
        constructorPage.clickButtonPersonalArea();
        PersonalAreaPage personalAreaPage =
                open(PersonalAreaPage.URL,
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
