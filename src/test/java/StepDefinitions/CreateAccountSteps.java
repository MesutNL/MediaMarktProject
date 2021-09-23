package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilities.BaseDriver;
import Utilities.ExcelUtility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CreateAccountSteps {
    private final DialogContent dialogContent;
    List<List<String>> list= ExcelUtility.getListData("src/test/java/Resources/create_Account.xlsx","Sayfa1",4);
    public CreateAccountSteps(DialogContent dialogContent) {
        this.dialogContent = dialogContent;
    }


    @Given("^Navigate To Media Markt NL Website$")
    public void navigateToMediaMarktNLWebsite() {
        WebDriver driver= BaseDriver.getDriver();
        driver.get("https://www.mediamarkt.nl/");
        driver.manage().window().maximize();
        dialogContent.clickFunction(dialogContent.getAcceptCookies());


    }


    @And("^Click to Mijn MediaMarkt$")
    public void clickToMijnMediaMarkt() {
        dialogContent.clickFunction(dialogContent.getMijnMediaMarkt());

    }

    @And("^Click to Mijn Account$")
    public void clickToMijnAccount() {
        dialogContent.clickFunction(dialogContent.getMijnAccount());
    }

    @And("^Click to Nog Geen Account \\? Account Aanmaken$")
    public void clickToNogGeenAccountAccountAanmaken() {
       Parent.JavascriptExClick(dialogContent.getAccountAanmakenButton());

    }

    @Then("^Select to Consument$")
    public void selectToConsument() {
        dialogContent.ListSelect(dialogContent.getConsumentSelect(),"Consument");
    }

    @Then("^Select to Gender$")
    public void selectToGender() {
        Parent.JavascriptExClick(dialogContent.getMeneerButton());

    }

    @And("^Enter Voornaam  and Achternaam$")
    public void enterVoornaamAndAchternaam() {

           dialogContent.sendKeysFunction(dialogContent.getVoornaamInput(),list.get(2).get(0));
           dialogContent.sendKeysFunction(dialogContent.getAchterNaaminput(),list.get(2).get(1));

        System.out.println(list.get(2).get(0)+" "+list.get(2).get(1));
    }

    @And("^Select GeboorteDatum$")
    public void selectGeboorteDatum() {

        dialogContent.select(dialogContent.getGeboorteDatumSelectdate(), 15);
        dialogContent.select(dialogContent.getGeboorteDatumSelectMonth(), 2);
        dialogContent.select(dialogContent.getGeboorteDatumSelectyear(), 11);


    }

    @And("^Enter E-mailadres  and Wachtwoord  and Herhaal Nieuw Wachtwoord as$")
    public void enterEMailadresAndWachtwoordAndHerhaalNieuwWachtwoordAs() {
        dialogContent.sendKeysFunction(dialogContent.getEmailInput(),list.get(2).get(2));
        dialogContent.sendKeysFunction(dialogContent.getWachtWoordInput(),list.get(2).get(3));
        dialogContent.sendKeysFunction(dialogContent.getWachtWoordbevistigInput(),list.get(2).get(3));
    }

    @And("^Click to AANMELDEN$")
    public void clickToAANMELDEN() {
        dialogContent.JavascriptExClick(dialogContent.getAanMelden());
    }


    @Then("^User Should be Succesfully$")
    public void userShouldBeSuccesfully() {
        Parent.delay(5);
        String text=dialogContent.getSuccessMEssageAccount().getText();
        System.out.println("text = " + text);
        dialogContent.verifyContainsText(dialogContent.getSuccessMEssageAccount(),text);
    }
}
