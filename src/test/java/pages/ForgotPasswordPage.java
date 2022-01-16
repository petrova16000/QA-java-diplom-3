package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ForgotPasswordPage {

    //кнопка вход
    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/main/div/div/p/a")
    private SelenideElement buttonLogin;

    public void clickButtonLogin(){
        buttonLogin.click();
    }
}
