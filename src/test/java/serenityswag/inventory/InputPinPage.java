package serenityswag.inventory;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class InputPinPage extends PageObject {

    @AndroidFindBy(id = "com.ada.astrapayupdate:id/userForgotPinInformationBox")
    public WebElement header;

    public String getHeading() {
        System.out.println("DEBUG: Header text: " + header.getText());
        return header.getText();
    }
}
