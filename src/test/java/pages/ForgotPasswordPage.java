package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ForgotPasswordPage {

    public static final String URL = "https://stellarburgers.nomoreparties.site/forgot-password";

    //кнопка вход
    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/main/div/div/p/a")
    private SelenideElement buttonLogin;

    public void clickButtonLogin(){
        buttonLogin.click();
    }
}
