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
    //telefon numarasi girdikten sonra home butonuna tiklanir, mesajlar uygulamsinin locateine tiklanir
    //mesajin locatine tiklanir, mesaj kopyalanir ve migros uygulamasina dönülür.




    }

    @And("Mesajlar uygulamasina gidilir")
    public void mesajlarUygulamasinaGidilir() {


    }


    @And("Gelen SMS kopyalanir")
    public void gelenSMSKopyalanir() {



    }


    @And("SMS kodu girilir")
    public void smsKoduGirilir() {




    }


    @When("arama kutusuna Pizza Bulls yazilir")
    public void aramaKutusunaPizzaBullsYazilir() {




    }


    @And("Pizza Bulls cikan sonuca tiklanir")
    public void pizzaBullsCikanSonucaTiklanir() {




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


}
