package migros.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import migros.pages.MigrosYemekPages;

public class MigrosYemek_1_Kupon {


    MigrosYemekPages migrosYemeke = new MigrosYemekPages();


    @Given("migros uygulamasina giris yapilir")
    public void migrosUygulamasinaGirisYapilir() {


    }



    @When("insan simgesine tiklanir")
    public void insanSimgesineTiklanir() {



    }




    @And("uye ol veya giris yapilir sekmesine tiklanir")
    public void uyeOlVeyaGirisYapilirSekmesineTiklanir() {




    }


    @And("giris yap butonuna tiklanir")
    public void girisYapButonunaTiklanir() {



    }


    @When("telefon numarasi girilir")
    public void telefonNumarasiGirilir() {



    }


    @And("SMS kodu girilir")
    public void smsKoduGirilir() {




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

    //TC02

    @When("Pasa Doner, Fatih \\(Ali Kuscu Mah.) dukkanindan Ramazan Menusu iki tane siparis edilir")
    public void pasaDonerFatihAliKuscuMahDukkanindanRamazanMenusuIkiTaneSiparisEdilir() {




    }


}
