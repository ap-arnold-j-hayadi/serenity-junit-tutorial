package serenityswag.authentication;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenityswag.inventory.InputPinPage;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)
public class WhenOpeningApp {

    @Managed(driver = "Appium")
    WebDriver driver;

    @Steps
    LoginActions login;

    InputPinPage inputPinPage;

    @Test
    public void usersCanAccessInputPin() {
        System.out.println("Starting. . . . . . .");
        login.goToInputPinPage();
//        login.as(STANDARD_USER);
//
//        // Should see p   roduct catalog
        Serenity.reportThat("The inventory page should be displayed with the correct title",
                () -> assertThat(inputPinPage.getHeading()).isEqualToIgnoringCase("Silakan masukan nomor handphone yang terdaftar")
        );
    }
}
