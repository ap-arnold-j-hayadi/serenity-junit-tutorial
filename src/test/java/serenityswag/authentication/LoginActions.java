package serenityswag.authentication;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

public class LoginActions extends UIInteractionSteps {
    @AndroidFindBy(id = "com.ada.astrapayupdate:id/btnLogin")
    public WebElement enterOrSignupButton;
    @Step("Click MASUK")
    public void goToInputPinPage() {
        enterOrSignupButton.click();

//        openUrl("https://www.saucedemo.com/");
        // Login as a standard user

//        $("com.ada.astrapayupdate:id/btnLogin").click();
//        $("[data-test='username']").sendKeys(user.getUsername());
//        $("[data-test='password']").sendKeys(user.getPassword());
//        $("[data-test='login-button']").click();
    }
}
