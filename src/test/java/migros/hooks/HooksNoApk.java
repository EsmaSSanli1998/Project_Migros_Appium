package migros.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import migros.utils.ConfigReader;
import migros.utils.DriverNoApk;

public class HooksNoApk {

    //before_or_after_all()

    @BeforeAll
    public static void beforeAllNoApk(){
        DriverNoApk.serverBaslatNoApk(ConfigReader.getProperty("localIPAdres"), Integer.parseInt(ConfigReader.getProperty("localPort")));

    }



    @After
    public void tearDownNoAPk(){

        DriverNoApk.uygulamayiKapatNoApk();


    }


    @AfterAll
    public static void afterAllNoApk(){

        DriverNoApk.serverKapatNoApk();

    }


}
