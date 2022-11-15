package serenityswag.authentication;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import io.appium.java_client.AppiumDriver;
import serenityswag.inventory.InventoryPage;

import static org.assertj.core.api.Assertions.assertThat;
import static serenityswag.authentication.User.STANDARD_USER;

@RunWith(SerenityRunner.class)
public class WhenLoggingOn {

    @Managed(driver = "Appium")
    WebDriver driver;

    @Steps
    LoginActions login;

    InventoryPage inventoryPage;

    @Test
    public void usersCanLogOnViaTheHomePage() {
        System.out.println("Starting. . . . . . .");
//        login.as(STANDARD_USER);
//
//        // Should see product catalog
//        Serenity.reportThat("The inventory page should be displayed with the correct title",
//                () -> assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("Products")
//        );
    }
}
