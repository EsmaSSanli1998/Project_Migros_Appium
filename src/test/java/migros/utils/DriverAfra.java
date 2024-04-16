package migros.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.time.Duration;

public class DriverAfra {

        public static AndroidDriver driver_Afra;
        public static AppiumDriverLocalService service_Afra;

        public static AndroidDriver getDriver_Afra() {
            if (driver_Afra == null) {
                String appUrl = System.getProperty("user.dir")
                        + File.separator + "src"
                        + File.separator + "test"
                        + File.separator + "resources"
                        + File.separator + "apps";
                //   + File.separator + getProperty("apkName");

                UiAutomator2Options options = new UiAutomator2Options()
                        //.setApp(appUrl);
                        .setAppPackage("com.inomera.sm")
                        .setAppActivity("com.inomera.sm.ui.home.HomeActivity")
                        ;
                driver_Afra = new AndroidDriver(service_Afra.getUrl(), options);
                driver_Afra.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            }
            return driver_Afra;
        }

        public static void serverBaslat_A(String ipAdres, int port){


            service_Afra = new AppiumServiceBuilder()
                  //  .withAppiumJS(new File("C:\\Users\\Lenova\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                    .withIPAddress(ipAdres)
                    .usingPort(port)
                    .build();
            service_Afra.start();
        }

        public static void uygulamayiKapat_A() {
            if (driver_Afra != null) {
                driver_Afra.quit();
                driver_Afra = null;
            }
        }

        public static void serverKapat_A(){
            service_Afra.stop();
        }



    }

