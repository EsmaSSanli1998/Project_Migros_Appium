package migros.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.time.Duration;


public class DriverNoApk {//.setUdid("R58N527PKNJ")

    public static AndroidDriver driverNoApk;
    public static AppiumDriverLocalService serviceNoApk;

    public static AndroidDriver getDriverNoApk() {

        if (driverNoApk == null) {

            String appUrlNoApk = System.getProperty("user.dir")
                    + File.separator + "src"
                    + File.separator + "test"
                    + File.separator + "resources"
                    + File.separator + "apps"
                    //+ File.separator + getProperty("apkName")

                    ;

            UiAutomator2Options optionsNoApk = new UiAutomator2Options()
                    //.setApp(appUrlNoApk)
                     .setAppPackage("com.sec.android.app.launcher")
                    .setAppActivity("com.sec.android.app.launcher.activities.LauncherActivity")                    ;


            driverNoApk = new AndroidDriver(serviceNoApk.getUrl(), optionsNoApk);
            driverNoApk.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driverNoApk;
    }

    public static void serverBaslatNoApk(String ipAdres, int port){
        serviceNoApk = new AppiumServiceBuilder()
                .withAppiumJS(new File("C:\\Users\\esmas\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress(ipAdres)
                .usingPort(port)
                .build();
        serviceNoApk.start();
    }

    public static void uygulamayiKapatNoApk() {
        if (driverNoApk != null) {
            driverNoApk.quit();
            driverNoApk = null;
        }
    }

    public static void serverKapatNoApk(){
        serviceNoApk.stop();
    }



}
