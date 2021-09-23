package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }


    @FindBy(xpath = "//span[@class='ms-dropdown__trigger']//button")
    private WebElement mijnMediaMarkt;

    @FindBy(xpath = "//button[text()='Alles accepteren']")
    private WebElement acceptCookies;


    @FindBy(xpath = "(//ul[@class='ms-list']//a)[1]")
    private WebElement mijnAccount;

    @FindBy(xpath = "//*[@id='my-account-action-register']/span")
    private WebElement accountAanmakenButton;

    @FindBy(id = "register-account")
    private List<WebElement> ConsumentSelect;

    @FindBy(id = "tqa_register_personTitleMr")
    private WebElement meneerButton;

    @FindBy(id = "register-firstname")
    private WebElement voornaamInput;

    @FindBy(id = "register-lastname")
    private WebElement achterNaaminput;

    @FindBy(id = "register-birthdayDay")
    private WebElement geboorteDatumSelectdate;

    @FindBy(id = "register-birthdayMonth")
    private WebElement geboorteDatumSelectMonth;

    @FindBy(id = "register-birthdayYear")
    private WebElement geboorteDatumSelectyear;

    @FindBy(id = "register-email")
    private WebElement emailInput;

    @FindBy(id = "register-password")
    private WebElement wachtWoordInput;

    @FindBy(id = "register-password-confirm")
    private WebElement wachtWoordbevistigInput;

    @FindBy(id = "my-account-register-submit")
    private WebElement aanMelden;

    @FindBy(xpath = "//a[@id='my-account-btn-password-change']")
    private WebElement successMEssageAccount;

    @FindBy(id = "login-email")
    private WebElement loginEmail;

    @FindBy(id = "login-password")
    private WebElement loginPassword;

    @FindBy(id = "my-account-action-login")
    private WebElement inLoggenClick;


    public WebElement getAcceptCookies() {
        return acceptCookies;
    }

    public WebElement getMijnMediaMarkt() {
        return mijnMediaMarkt;
    }

    public WebElement getMijnAccount() {
        return mijnAccount;
    }

    public WebElement getAccountAanmakenButton() {
        return accountAanmakenButton;
    }

    public List<WebElement> getConsumentSelect() {
        return ConsumentSelect;
    }

    public WebElement getMeneerButton() {
        return meneerButton;
    }

    public WebElement getVoornaamInput() {
        return voornaamInput;
    }

    public WebElement getAchterNaaminput() {
        return achterNaaminput;
    }

    public WebElement getGeboorteDatumSelectdate() {
        return geboorteDatumSelectdate;
    }

    public WebElement getGeboorteDatumSelectMonth() {
        return geboorteDatumSelectMonth;
    }

    public WebElement getGeboorteDatumSelectyear() {
        return geboorteDatumSelectyear;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getWachtWoordInput() {
        return wachtWoordInput;
    }

    public WebElement getWachtWoordbevistigInput() {
        return wachtWoordbevistigInput;
    }

    public WebElement getAanMelden() {
        return aanMelden;
    }

    public WebElement getSuccessMEssageAccount() {
        return successMEssageAccount;
    }

    public WebElement getLoginEmail() {
        return loginEmail;
    }

    public WebElement getLoginPassword() {
        return loginPassword;
    }

    public WebElement getInLoggenClick() {
        return inLoggenClick;
    }
}
