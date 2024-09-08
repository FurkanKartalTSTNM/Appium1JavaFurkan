import com.Testinium.Mobile.HookImpl;
import com.Testinium.Mobile.StepImpl;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Testasd extends HookImpl {

    StepImpl step= new StepImpl();
    private AppiumDriver driver;

    @Test
    public void success() throws InterruptedException {

        step.waitBySecond(3);
        step.swipe("down");
        driver.quit();

    }

}
