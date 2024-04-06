package migros.hooks;

import io.cucumber.java.*;
import migros.utils.ConfigReader;
import migros.utils.Driver;
import migros.utils.DriverAfra;
import org.openqa.selenium.OutputType;

public class AfraHooks {
    @BeforeAll
    public static void beforeAll_A(){
        DriverAfra.serverBaslat_A(ConfigReader.getProperty("localIPAdres"), Integer.parseInt(ConfigReader.getProperty("localPort")));

    }

//@Before
//public void setUp(){

//}


  /*  @After
    public static void tearDown_A(Scenario scenario){
if (scenario.isFailed()) {
    byte[] screenshotAs = Driver.getDriver().getScreenshotAs(OutputType.BYTES);
scenario.attach(screenshotAs, "image/png", "Hata Resmi");
Driver.getDriver().terminateApp("");
}
        Driver.getDriver().terminateApp("");

    }
/*


   */
   @AfterAll
 public static void afterAll_A(){
       DriverAfra.uygulamayiKapat_A();
       DriverAfra.serverKapat_A();


    }
}
