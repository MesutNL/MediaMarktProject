package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import cucumber.api.java.en.And;

import java.util.List;

public class LoginAccountStep {
    private final DialogContent dialogContent;

    List<List<String>> list = ExcelUtility.getListData("src/test/java/Resources/create_Account.xlsx", "Sayfa1", 4);

    public LoginAccountStep(DialogContent dialogContent) {
        this.dialogContent = dialogContent;
    }

    @And("^Enter E-mailadres  and Wachtwoord$")
    public void enterEMailadresAndWachtwoord() {
        dialogContent.sendKeysFunction(dialogContent.getLoginEmail(),list.get(2).get(2));
        dialogContent.sendKeysFunction(dialogContent.getLoginPassword(),list.get(2).get(3));

    }

    @And("^Click to Inlogen$")
    public void clickToInlogen() {
        dialogContent.JavascriptExClick(dialogContent.getInLoggenClick());
    }
}
