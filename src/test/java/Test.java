import com.Testinium.Mobile.HookImpl;
import com.Testinium.Mobile.StepImpl;
import org.openqa.selenium.By;

public class Test extends HookImpl {

    StepImpl step= new StepImpl();

    @org.junit.jupiter.api.Test
    public void IOSBasicTestSuccess() throws InterruptedException {

        step.waitBySecond(3);
        appiumDriver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Markalar\"]")).click();
        step.waitBySecond(3);
        appiumDriver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Kategoriler\"]")).click();
        step.waitBySecond(3);
        appiumDriver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Kampanyalar\"]")).click();
        step.waitBySecond(3);
        appiumDriver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Markalar\"]")).click();
        step.waitBySecond(3);
        appiumDriver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Kategoriler\"]")).click();
        step.waitBySecond(3);
        appiumDriver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Kampanyalar\"]")).click();
        step.waitBySecond(3);

    }

}
