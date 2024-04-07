package migros.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import migros.pages.MigrosYemekPages;
import migros.utils.DriverNoApk;
import migros.utils.ReusableMethods;



public class MigrosYemek_2_NoRegister {


    MigrosYemekPages migrosYemekPages = new MigrosYemekPages();




    @And("teslimat adresini belirle sekmesine tiklanir")
    public void teslimat_adresini_belirle_sekmesine_tiklanir() {
        bekle(2);

        //BILDIRIMLER
        migrosYemekPages.bildirimleriEtkinlestir.click();
        bekle(2);

        migrosYemekPages.izinVerme.click();
        bekle(2);

        migrosYemekPages.konumErisimIzni.click();
        bekle(2);

        migrosYemekPages.uygulamayiKullanirken.click();
        bekle(2);

        migrosYemekPages.cizgilerMigrosYemekIcin.click();
        bekle(2);

        migrosYemekPages.migrosYemekSekmesi.click();
        bekle(2);


       // ---------------------------------------------------------


        migrosYemekPages.teslimatAdresiniBelirle.click();
        System.out.println("teslimat_adresini_belirle_sekmesine_tiklanir");
        bekle(2);

    }


    @And("uye olmadan devam et sekmesine tiklanir")
    public void uye_olmadan_devam_et_sekmesine_tiklanir() {

        migrosYemekPages.uyeOlmadanDevamEt.click();

        System.out.println("uye_olmadan_devam_et_sekmesine_tiklanir");

        bekle(2);
    }


    @And("isaretledigim konumu ekle butonuna tiklanir")
    public void isaretledigim_konumu_ekle_butonuna_tiklanir() {


        migrosYemekPages.isaretledigimKonumuEkleB.click();

        System.out.println("isaretledigim_konumu_ekle_butonuna_tiklanir");
        bekle(2);
    }


    @When("il, ilce, mahalle, cadde, bina, kat, daire, adres tarifi, adres basligi, ad soyad eklenir")
    public void il_ilce_mahalle_cadde_bina_kat_daire_adres_tarifi_adres_basligi_ad_soyad_eklenir() {

/*
       // istanbul,arnavutköy,arnavutköy merkez mh.,mevlana,120,1,2,aaa,aaa,baki demir
        ---------------------------------------------------------------

        //1. Sayfanin locate i alinir
        WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        //2. Select objesi olusturulur
        Select select = new Select(ddm);

        //3. Opsiyonlardan bir tanesi secilir
        select.selectByVisibleText("Books");





        Select il = new Select(migrosYemekPages.il);
        bekle(2);

        il.selectByIndex(0);
        bekle(2);

        Select ilce = new Select(migrosYemekPages.ilce);
        ilce.selectByIndex(1);
        bekle(2);

        Select mahalle = new Select(migrosYemekPages.mahalle);
        mahalle.selectByIndex(15);
        bekle(2);

*/

        migrosYemekPages.il.click();
        bekle(2);
        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),169,1009);

        migrosYemekPages.ilce.click();
        bekle(2);
        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),315,1420);

        migrosYemekPages.mahalle.click();
        bekle(2);
        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),292,525);


        // istanbul,arnavutköy,arnavutköy merkez mh.,mevlana,120,1,2,aaa,aaa,baki demir

        migrosYemekPages.cadde.sendKeys("Mevlana");
        bekle(2);

        migrosYemekPages.bina.sendKeys("120");
        bekle(2);

        migrosYemekPages.kat.sendKeys("1");
        bekle(2);

        migrosYemekPages.daire.sendKeys("2");
        bekle(2);

        migrosYemekPages.adresTarifi.sendKeys("aaa");
        bekle(2);

        migrosYemekPages.adresBasligi.sendKeys("aaa");
        bekle(2);


        ReusableMethods.swipeGestureKoordinat(DriverNoApk.getDriverNoApk(),500,100,500,500,"up",1.0,500);

        //scrollGesture(DriverNoApk.getDriverNoApk(),migrosYemekPages.soyad,"down",2.0,500);


        //swipeGestureKoordinat(DriverNoApk.getDriverNoApk(),400,1400,210,1780,"up",2.0,500);
        bekle(4);


        migrosYemekPages.ad.sendKeys("baki");
        bekle(2);

        migrosYemekPages.soyad.sendKeys("demir");
        bekle(2);

        ReusableMethods.clickGestureKonum(DriverNoApk.getDriverNoApk(),539,2178);
        bekle(3);


        System.out.println("il_ilce_mahalle_cadde_bina_kat_daire_adres_tarifi_adres_basligi_ad_soyad_eklenir");
    }


    @And("evet adresim dogru butonuna tiklanir")
    public void evet_adresim_dogru_butonuna_tiklanir() {



        migrosYemekPages.evetAdresimDogru.click();

        System.out.println("evet_adresim_dogru_butonuna_tiklanir");
    }



    @When("alisveris sayfasina gidilmeli")
    public void alisveris_sayfasina_gidilmeli() {


        migrosYemekPages.migrosDolasimMenusuCizgiliOlan.click();
        bekle(2);

        System.out.println("alisveris_sayfasina_gidilmeli");
    }



    @And("sepet e tiklanir, alisverise basla butonuna tiklanir")
    public void sepet_e_tiklanir_alisverise_basla_butonuna_tiklanir() {

        migrosYemekPages.migrosYemekSekmessiB.click();
        bekle(2);

        System.out.println("sepet_eklenir_alisverise_basla_butonuna_tiklanir");
    }



    @Then("sayfaya yonlendirildigi dogrulanire")
    public void sayfaya_yonlendirildigi_dogrulanire() {

        if (migrosYemekPages.baskaBirAdresSecYazisiDogrula.isDisplayed()) {
            System.out.println("YÖNLENDIRILMEDI");
        }else {
            System.out.println("sayfaya_yonlendirildigi_dogrulanire");
        }




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
