import com.Testinium.Mobile.HookImpl;
import com.Testinium.Mobile.StepImpl;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Testasd extends HookImpl {

    StepImpl step= new StepImpl();
    private AppiumDriver driver;

    @Test
    public void success(){

        step.waitBySecond(3);
        try {
            step.findElement(By.id("com.google.android.apps.messaging:id/conversation_list_google_tos_popup_positive_button")).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
