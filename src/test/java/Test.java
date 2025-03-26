import com.Testinium.Mobile.HookImpl;
import com.Testinium.Mobile.StepImpl;
import io.appium.java_client.AppiumDriver;

public class Test extends HookImpl {

    StepImpl step= new StepImpl();
    private AppiumDriver driver;

    @org.junit.jupiter.api.Test
    public void success() throws InterruptedException {

        step.waitBySecond(3);
        step.swipe("down");
        step.swipeUP(Integer.parseInt("2"));
        step.waitBySecond(3);
        step.swipe("up");
        step.swipeUP(Integer.parseInt("2"));
        step.waitBySecond(3);

    }

}
