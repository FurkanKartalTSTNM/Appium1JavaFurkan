import com.Testinium.Mobile.HookImpl;
import com.Testinium.Mobile.StepImpl;
import org.junit.jupiter.api.Test;

public class Testasd extends HookImpl {

    StepImpl step= new StepImpl();

    @Test
    public void success(){

        step.waitBySecond(3);

    }

}
