package pages;


import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConstructorPage {

    public static final String URL = "https://stellarburgers.nomoreparties.site/";

    //кнопка Личный кабинет
    @FindBy(how = How.XPATH,using = "//*[@id=\"root\"]/div/header/nav/a/p")
    private SelenideElement buttonPersonalArea;

    //кнопка Войти в аккаунт
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/section[2]/div/button")
    private SelenideElement buttonSignIn;

    //кнопка логотип Stellar Burgers
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/header/nav/div/a/svg")
    private SelenideElement buttonStellarBurgers;

    //текст Соберите бургер
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/section[1]/h1")
    private SelenideElement textAssembleABurger;

    //Кнопка соусы
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/section[1]/div[1]/div[2]")
    private SelenideElement buttonSauces;

    //Соус
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/section[1]/div[2]/ul[2]/a[1]/p")
    private SelenideElement saucesSpicyX;

    //Кнопка булки
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/section[1]/div[1]/div[1]")
    private SelenideElement buttonBun;

    //Булка
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/section[1]/div[2]/ul[1]/a[1]/p")
    private SelenideElement bunR2D3;

    //Кнопка начинки
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/section[1]/div[1]/div[3]")
    private SelenideElement buttonStuffing;

    //начинка
    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/main/section[1]/div[2]/ul[3]/a[1]/p")
    private SelenideElement stuffing;

    public void checkAssembleABurgerText(){
        Assert.assertTrue(textAssembleABurger.isDisplayed());
        String expectedText = "Соберите бургер";
        Assert.assertEquals(expectedText, textAssembleABurger.getText());
    }

    public void clickButtonPersonalArea(){
        buttonPersonalArea.click();
    }

    public void clickButtonSignIn(){
        buttonSignIn.click();
    }

    public void clickButtonSauces(){
        buttonSauces.click();
    }

    public void checkSaucesText(){
        String expectedText = "Соус Spicy-X";
        Assert.assertEquals(expectedText, saucesSpicyX.getText());
    }

    public void clickButtonBun(){
        buttonBun.click();
    }

    public void checkBunText(){
        String expectedText = "Флюоресцентная булка R2-D3";
        Assert.assertEquals(expectedText, bunR2D3.getText());
    }

    public void clickButtonStuffing(){
        buttonStuffing.click();
    }

    public void checkStuffingText(){
        String expectedText = "Мясо бессмертных моллюсков Protostomia";
        Assert.assertEquals(expectedText, stuffing.getText());
    }
}
