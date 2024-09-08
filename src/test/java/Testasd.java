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
        driver.findElement(By.xpath("/hierarchy/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView/android.widget.ImageView")).click();
    }

}
