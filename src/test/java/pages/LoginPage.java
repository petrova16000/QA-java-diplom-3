package pages;


import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    public static final String URL = "https://stellarburgers.nomoreparties.site/login";

    //кнопка Зарегистрироваться
    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/main/div/div/p[1]/a")
    private SelenideElement buttonRegistration;

    //текст Вход
    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/main/div/h2")
    private SelenideElement loginText;

    //поле Email
    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/main/div/form/fieldset[1]/div/div/input")
    private SelenideElement emailField;

    //поле Пароль
    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/main/div/form/fieldset[2]/div/div/input")
    private SelenideElement passwordField;

    //кнопка Войти
    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/main/div/form/button")
    private SelenideElement buttonLogin;

    //Проверка что есть текст Вход
    public void checkLoginText(){
        String expectedText = "Вход";
        Assert.assertEquals(expectedText, loginText.getText());
    }

    //Авторизация
    public void login(String email, String password){
        emailField.setValue(email);
        passwordField.setValue(password);
        buttonLogin.click();
    }
}
