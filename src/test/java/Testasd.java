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
        driver.findElement(By.id("com.gratis.android:id/navigation_bar_item_icon_view")).click();
    }

}
