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
        //wait until element is visible
       // step.existElement("com.gratis.android:id/nav_graph_campaign");
        step.swipe("down");
    }

}
