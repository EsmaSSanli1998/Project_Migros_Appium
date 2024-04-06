package migros.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
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
                    //+ File.separator + "apps"
                    //+ File.separator + getProperty("apkName")

                    ;

            UiAutomator2Options optionsNoApk = new UiAutomator2Options()
                    //.setApp(appUrlNoApk)
                    .setPlatformVersion("10.0")
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setAppPackage("com.inomera.sm")
                    .setAppActivity("com.inomera.sm.ui.home.HomeActivity");


         //   driverNoApk = new AndroidDriver(serviceNoApk.getUrl(), optionsNoApk);
            try {
                driverNoApk = new AndroidDriver(new URL("http://localhost:4723"), optionsNoApk);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
            driverNoApk.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driverNoApk;
    }

    public static void serverBaslatNoApk(String ipAdres, int port) {
        System.out.println(System.getProperty("user.home") +
                File.separator + "AppData" +
                File.separator + "Roaming" +
                File.separator + "npm" +
                File.separator + "node_modules" +
                File.separator + "appium" +
                File.separator + "build" +
                File.separator + "lib" +
                File.separator + "main.js");
        serviceNoApk = new AppiumServiceBuilder()
//                .withAppiumJS(new File(System.getProperty("user.home") +
//                        File.separator + "AppData" +
//                        File.separator + "Roaming" +
//                        File.separator + "npm" +
//                        File.separator + "node_modules" +
//                        File.separator + "appium" +
//                        File.separator + "build" +
//                        File.separator + "lib" +
//                        File.separator + "main.js"))
                .withIPAddress(ipAdres)
                .usingPort(port)
                .withTimeout(Duration.ofSeconds(30))
                .build();
        serviceNoApk.start();
    }

    public static void uygulamayiKapatNoApk() {
        if (driverNoApk != null) {
            driverNoApk.quit();
            driverNoApk = null;
        }
    }

    public static void serverKapatNoApk() {
        serviceNoApk.stop();
    }


}
