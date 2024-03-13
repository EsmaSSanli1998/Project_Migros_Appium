package migros.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import migros.utils.ConfigReader;
import migros.utils.DriverAfra;

public class AfraHooks {
    @BeforeAll
    public static void beforeAll_A(){
        DriverAfra.serverBaslat_A(ConfigReader.getProperty("localIPAdres"), Integer.parseInt(ConfigReader.getProperty("localPort")));

    }


    //   @Before
    //  public void setUp(){


    //}

    @After
    public void tearDown_A(){

        DriverAfra.uygulamayiKapat_A();


    }


    @AfterAll
    public static void afterAll_A(){

        DriverAfra.serverKapat_A();

    }
}
