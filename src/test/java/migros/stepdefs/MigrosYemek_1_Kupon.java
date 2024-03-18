package migros.stepdefs;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import migros.pages.MigrosYemekPages;
import migros.utils.DriverNoApk;
import migros.utils.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MigrosYemek_1_Kupon {


    MigrosYemekPages migrosYemeke = new MigrosYemekPages();
    KeyEvent home = new KeyEvent(AndroidKey.HOME);

    @Given("migros uygulamasina giris yapilir")
    public void migrosUygulamasinaGirisYapilir() {

        DriverNoApk.getDriverNoApk();
        System.out.println("Giris Yapildi");
        bekle(2);

        //BILDIRIMLER
        migrosYemeke.bildirimleriEtkinlestir.click();
        bekle(2);

        migrosYemeke.izinVerme.click();
        bekle(2);

        migrosYemeke.konumErisimIzni.click();
        bekle(2);

        migrosYemeke.uygulamayiKullanirken.click();
        bekle(2);

        migrosYemeke.cizgilerMigrosYemekIcin.click();
        bekle(2);

        migrosYemeke.migrosYemekSekmesi.click();
        bekle(2);



    }



    @When("insan simgesine tiklanir")
    public void insanSimgesineTiklanir() {

        migrosYemeke.kullaniciAdam.click();
        bekle(2);



        System.out.println("insan Simgesine Tiklanir");


    }




    @And("uye ol veya giris yapilir sekmesine tiklanir")
    public void uyeOlVeyaGirisYapilirSekmesineTiklanir() {

        migrosYemeke.uyeOlGirisYapB.click();
        bekle(2);


        System.out.println("uye Ol Veya Giris Yapilir Sekmesine Tiklanir");
    }


    @And("giris yap butonuna tiklanir")
    public void girisYapButonunaTiklanir() {

        migrosYemeke.girisYapSekmesi.click();
        bekle(2);

        System.out.println("giris Yap Butonuna Tiklanir");

    }


    @When("telefon numarasi girilir")
    public void telefonNumarasiGirilir() {
    //telefon numarasi girdikten sonra home butonuna tiklanir, mesajlar uygulamsinin locateine tiklanir
    //mesajin locatine tiklanir, mesaj kopyalanir ve migros uygulamasina dönülür.

        migrosYemeke.telefonNumB.sendKeys("5436383913");
        bekle(2);
        migrosYemeke.girisYapB.click();
        bekle(2);


        DriverNoApk.getDriverNoApk().pressKey(home);
        bekle(2);






        System.out.println("telefon Numarasi Girilir");

    }

    @And("Mesajlar uygulamasina gidilir")
    public void mesajlarUygulamasinaGidilir() {

        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),543,2137);
        bekle(2);

        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),530,380);
        bekle(4);





        System.out.println("mesajlar Uygulamasina Gidilir");
    }


    @And("Gelen SMS kopyalanir")
    public void gelenSMSKopyalanir() {

        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),128,1776);
        bekle(4);

        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),430,1662);
        bekle(2);

        DriverNoApk.getDriverNoApk().pressKey(home);
        bekle(5);

    }


    @And("SMS kodu girilir")
    public void smsKoduGirilir() {

        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),233,2338);
        bekle(2);

        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),40,1000);
        bekle(2);

        migrosYemeke.smsDogrulamaBoxy.click();
        bekle(2);

        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),484,1479);
        bekle(2);

        migrosYemeke.smsDogrulaB.click();
        bekle(3);



    }


    @When("arama kutusuna Pizza Bulls yazilir")
    public void aramaKutusunaPizzaBullsYazilir() {

        migrosYemeke.aramaKutusuy.click();
        bekle(4);





        //burdasin
        migrosYemeke.aramaKutusuy.sendKeys("Pizza Bulls");
        bekle(2);

        migrosYemeke.aramaKutusuIkinciy.click();
        bekle(2);
    }


    @And("Pizza Bulls cikan sonuca tiklanir")
    public void pizzaBullsCikanSonucaTiklanir() {

        migrosYemeke.pizzaBulls.click();


    }


    @When("Pizza Bulls, Fatih \\(Molla Gurani Mah) Buyuk Boy Pepperoni Pizza, Normal Hamur, Kenar Sos Istemiyorum secilir")
    public void pizzaBullsFatihMollaGuraniMahBuyukBoyPepperoniPizzaNormalHamurKenarSosIstemiyorumSecilir() {




    }



    @And("sepet gidilir")
    public void sepetGidilir() {




    }


    @And("sepeti onayla butonuna tiklanir")
    public void sepetiOnaylaButonunaTiklanir() {




    }


    @Then("{int} TL ve {int} TL indirim kuponu goruntulenmeli")
    public void tlVeTLIndirimKuponuGoruntulenmeli(int sayi1, int sayi2) {

        sayi1 = 40;
        sayi2 = 60;


    }







    //US01_TC02

    @And("Mesajlarin uygulamasina gidilir")
    public void mesajlarinUygulamasinaGidilir() {




    }


    @And("Gelen SMS kopyalanirr")
    public void gelenSMSKopyalanirr() {




    }

    @When("Arama kutusuna Royal Dessert, Fatih yazilir")
    public void aramaKutusunaRoyalDessertFatihYazilir() {





    }


    @And("Royal Dessert, Fatih Cikan sonuca tiklanir")
    public void royalDessertFatihCikanSonucaTiklanir() {





    }


    @When("Royal Dessert, Fatih \\(Seyyid Omer Mah.) dukkanindan New York Mag Banana siparis edilir")
    public void royalDessertFatihSeyyidOmerMahDukkanindanNewYorkMagBananaSiparisEdilir() {





    }


    @And("eklenen sepet gidilir")
    public void eklenenSepetGidilir() {




    }


    @And("eklenen sepeti onayla butonuna tiklanir")
    public void eklenenSepetiOnaylaButonunaTiklanir() {




    }



    @Then("{int} TL ve {int} TL indirim kuponu goruntulenmelidir")
    public void tlVeTLIndirimKuponuGoruntulenmelidir(int sayi1, int sayi2) {

        sayi1 = 40;
        sayi2 = 60;



    }



    //METHODLAR


    public void bekle(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            System.out.println("Bekleme yapilamadi");
            throw new RuntimeException(e);
        }
    }



}
