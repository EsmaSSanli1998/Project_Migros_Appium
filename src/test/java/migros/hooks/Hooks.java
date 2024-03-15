package migros.hooks;

import migros.utils.ConfigReader;
import migros.utils.Driver;
import io.cucumber.java.*;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {

    //before_or_after_all()

    @BeforeAll
    public static void beforeAll(){
        Driver.serverBaslat(ConfigReader.getProperty("localIPAdres"), Integer.parseInt(ConfigReader.getProperty("localPort")));

    }


 //   @Before
  //  public void setUp(){


    //}

    @After
    public void tearDown(){

        Driver.uygulamayiKapat();


    }


    @AfterAll
    public static void afterAll(){

        Driver.serverKapat();

    }
}
