package pages;


import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage {

    //Имя
    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/main/div/form/fieldset[1]/div/div/input")
    private SelenideElement nameField;

    //Email
    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/main/div/form/fieldset[2]/div/div/input")
    private SelenideElement emailField;

    //Пароль
    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/main/div/form/fieldset[3]/div/div/input")
    private SelenideElement passwordField;

    //кнопка Зарегистрироваться
    @FindBy(how = How.XPATH,using = ".//*[contains(text(),'Зарегистрироваться')]")
    private SelenideElement buttonRegistration;

    //Сообщение о некорректном пароле
    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/main/div/form/fieldset[3]/div/p")
    private SelenideElement incorrectPasswordText;

    //Кнопка войти
    @FindBy(how = How.CLASS_NAME,using = "Auth_link__1fOlj")
    private SelenideElement buttonLogin;

   public void register(String name, String email, String password) {
       nameField.setValue(name);
       emailField.setValue(email);
       passwordField.setValue(password);
       buttonRegistration.click();
   }

    public void checkIncorrectPasswordText() {
       Assert.assertTrue(incorrectPasswordText.isDisplayed());
       String expectedText = "Некорректный пароль";
       Assert.assertEquals(expectedText, incorrectPasswordText.getText());
    }

    public void clickButtonLogin() {
        buttonLogin.click();
    }
}
