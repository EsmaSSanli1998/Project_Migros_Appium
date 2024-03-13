package migros.pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import migros.utils.DriverNoApk;
import org.openqa.selenium.support.PageFactory;

public class Migros_Macro_Pages {

    public Migros_Macro_Pages() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverNoApk.getDriverNoApk()), this);
    }

}
