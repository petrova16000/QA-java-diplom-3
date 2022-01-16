package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class PersonalAreaPage {

    //кнопка Профиль
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/div/nav/ul/li[1]")
    private SelenideElement buttonProfile;

    //кнопка логотип Stellar Burgers
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/header/nav/div")
    private SelenideElement buttonStellarBurgers;

    //кнопка конструктор
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/header/nav/ul/li[1]/a")
    private SelenideElement buttonConstructor;

    //кнопка выход
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/div/nav/ul/li[3]/button")
    private SelenideElement buttonExit;


    public void checkButtonProfile() {
        String expectedText = "Профиль";
        Assert.assertEquals(expectedText, buttonProfile.getText());
    }

    public void clickButtonStellarBurgers(){
        buttonStellarBurgers.click();
    }

    public void clickButtonConstructor(){
        buttonConstructor.click();
    }

    public void clickButtonExit(){
        buttonExit.click();
    }
}
