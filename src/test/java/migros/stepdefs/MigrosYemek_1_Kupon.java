package migros.stepdefs;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import migros.pages.MigrosYemekPages;
import migros.utils.DriverNoApk;
import migros.utils.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class MigrosYemek_1_Kupon {

    String sonMesaj;

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



        /*
        locateler degismis yenisini yazdim
        migrosYemeke.telefonNumB.sendKeys("5436383913");
        bekle(2);
        migrosYemeke.girisYapB.click();
        bekle(2);



         */
        migrosYemeke.telefonNumB2.sendKeys("436383913");
        bekle(4);
        migrosYemeke.girisYapB2.click();
        bekle(4);

        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),154,772);
        bekle(2);



        System.out.println("telefon Numarasi Girilir");

    }

    @And("Mesajlar uygulamasina gidilir")
    public void mesajlarUygulamasinaGidilir() {

        DriverNoApk.getDriverNoApk().pressKey(home);
        bekle(2);


       // migrosYemeke.mesajlar.click();
       // bekle(2);


        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),531,2127);
        bekle(2);



        System.out.println("mesajlar Uygulamasina Gidilir");
    }


    @And("Gelen SMS kopyalanir")
    public void gelenSMSKopyalanir() {



        migrosYemeke.migrosMesajinaTikla.click();
        bekle(2);

         sonMesaj = migrosYemeke.sonMesaj.getText().split(" ")[0];

/*
        //migros mesajindaki dogrulama kodunun konumu
        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),136,1777);
        bekle(2);

        //kopyala butonu
        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),429,1709);
        bekle(2);




 */
/*

        String message = migrosYemeke.gelenMesaj.getText();
        System.out.println("Dogrulama deneme"+message);


        //migros mesajindaki dogrulama kodunun konumu
        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),136,1867);
        bekle(2);

        //kopyala butonu
        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),429,1792);
        bekle(2);
 */
        System.out.println("gelenSMSKopyalanir");


    }


    @And("SMS kodu girilir")
    public void smsKoduGirilir() {

        DriverNoApk.getDriverNoApk().pressKey(home);
        bekle(2);


        //telefon anasayfasini yukari kaydir
        //ReusableMethods.swipeGestureKoordinat(DriverNoApk.getDriverNoApk(),500,100,500,500,"up",3.0,500);


        //sol ekran tusuna tikla
        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),241,2334);

        bekle(3);



        /*
        migros uygulamasina tikla

        migrosYemeke.migrosUygulamasiArkaPlan.click();
        bekle(3);

        */

        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),60,971);

        bekle(3);

       // migrosYemeke.smsDogrulamaBoxy.click();

        migrosYemeke.smsDogrulamaBoxy2.click();
        bekle(2);

       // ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),484,1470);


        migrosYemeke.smsDogrulamaBoxy2.sendKeys(sonMesaj);
        bekle(2);

       // migrosYemeke.smsDogrulaB.click();

        migrosYemeke.smsDogrulaB2.click();
        bekle(3);

        System.out.println("smsKoduGirilir");


    }


    @When("arama kutusuna Pizza Bulls yazilir")
    public void aramaKutusunaPizzaBullsYazilir() {



        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),384,511);
        bekle(4);
/*
        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),530,174);
        bekle(2);



 */
        migrosYemeke.aramaKutusuIkinciy.sendKeys("Pizza Bulls");
        bekle(2);

        System.out.println("aramaKutusunaPizzaBullsYazilir");
    }


    @And("Pizza Bulls cikan sonuca tiklanir")
    public void pizzaBullsCikanSonucaTiklanir() {

        migrosYemeke.pizzaBulls.click();
        bekle(2);

        System.out.println("pizzaBullsCikanSonucaTiklanir");

    }


    @When("Pizza Bulls, Fatih \\(Molla Gurani Mah) Buyuk Boy Pepperoni Pizza, Normal Hamur, Kenar Sos Istemiyorum secilir")
    public void pizzaBullsFatihMollaGuraniMahBuyukBoyPepperoniPizzaNormalHamurKenarSosIstemiyorumSecilir() {

        ReusableMethods.swipeGestureKoordinat(DriverNoApk.getDriverNoApk(),500,100,500,500,"up",1.0,500);
        migrosYemeke.buyukBoyPepperoniPizza.click();
        bekle(2);



        migrosYemeke.normalHamur.click();
        bekle(2);




        migrosYemeke.kenarSosIstemiyorum.click();
        bekle(2);

        System.out.println("pizzaBullsFatihMollaGuraniMahBuyukBoyPepperoniPizzaNormalHamurKenarSosIstemiyorumSecilir");

    }



    @And("sepet gidilir")
    public void sepetGidilir() {

        migrosYemeke.sepeteEkleButton.click();
        bekle(2);

        migrosYemeke.sepetimy.click();
        bekle(2);

        System.out.println("sepetGidilir");

    }


    @And("sepeti onayla butonuna tiklanir")
    public void sepetiOnaylaButonunaTiklanir() {

        migrosYemeke.sepetiOnaylabir.click();
        bekle(2);

        System.out.println("sepetiOnaylaButonunaTiklanir");


    }


    @Then("{int} TL ve {int} TL indirim kuponu goruntulenmeli")
    public void tlVeTLIndirimKuponuGoruntulenmeli(int sayi1, int sayi2) {

        sayi1 = 40;
        sayi2 = 60;

        ReusableMethods.swipeGestureKoordinat(DriverNoApk.getDriverNoApk(),500,100,500,500,"up",1.0,500);


        migrosYemeke.altmisTLindirimdogrula.isDisplayed();

        System.out.println("tlVeTLIndirimKuponuGoruntulenmeli");

    }







    //US01_TC02


    @When("Arama kutusuna Royal Dessert, Fatih yazilir")
    public void aramaKutusunaRoyalDessertFatihYazilir() {

/*

        migrosYemeke.reklam.click();
        bekle(2);

        migrosYemeke.cizgilerMigrosYemekIcin.click();
        bekle(2);

        migrosYemeke.migrosYemekSekmesi.click();
        bekle(2);



        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),384,511);
        bekle(4);

        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),530,174);
        bekle(2);



 */
        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),384,511);
        bekle(4);

        migrosYemeke.aramaKutusuIkinciy.sendKeys("Royal Dessert Fatih");
        bekle(2);



    }


    @And("Royal Dessert, Fatih Cikan sonuca tiklanir")
    public void royalDessertFatihCikanSonucaTiklanir() {

        migrosYemeke.RoyalDessert.click();
        bekle(2);



    }


    @When("Royal Dessert, Fatih \\(Seyyid Omer Mah.) dukkanindan New York Mag Banana siparis edilir")
    public void royalDessertFatihSeyyidOmerMahDukkanindanNewYorkMagBananaSiparisEdilir() {

        migrosYemeke.tatlininArtisi.click();
        bekle(2);

        migrosYemeke.sepeteEkleB.click();
        bekle(2);

        migrosYemeke.tatlininArtisi.click();
        bekle(2);

        migrosYemeke.sepeteEkleB.click();
        bekle(2);



    }


    @And("eklenen sepet gidilir")
    public void eklenenSepetGidilir() {

        migrosYemeke.sepeteGitB.click();
        bekle(2);


    }


    @And("eklenen sepeti onayla butonuna tiklanir")
    public void eklenenSepetiOnaylaButonunaTiklanir() {

        migrosYemeke.sepetiOnaylaB.click();
        bekle(2);


    }



    @Then("{int} TL ve {int} TL indirim kuponu goruntulenmelidir")
    public void tlVeTLIndirimKuponuGoruntulenmelidir(int sayi1, int sayi2) {

        sayi1 = 40;
        sayi2 = 60;

        ReusableMethods.swipeGestureKoordinat(DriverNoApk.getDriverNoApk(),500,100,500,500,"up",1.0,500);

        migrosYemeke.altmisTLIndirimD.isDisplayed();
        migrosYemeke.kirkTLIndirimD.isDisplayed();



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
