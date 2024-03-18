@migrosyemekiki
Feature: Migros yemek - Kupon sepette goruntulenebilmesi(alt limit tutuyor) - Indirim kuponu sepette kullanlabilmeli
  @migroskuponfailed
  Scenario: TC01 | Indirim kuponu test edilir(60 TL ve 40 TL indirim kuponu goruntulenmeli)
    Given migros uygulamasina giris yapilir
    When insan simgesine tiklanir
    And uye ol veya giris yapilir sekmesine tiklanir
    And giris yap butonuna tiklanir
    When telefon numarasi girilir
    And Mesajlar uygulamasina gidilir
    And Gelen SMS kopyalanir
    And SMS kodu girilir
    When arama kutusuna Pizza Bulls yazilir
    And Pizza Bulls cikan sonuca tiklanir
    When Pizza Bulls, Fatih (Molla Gurani Mah) Buyuk Boy Pepperoni Pizza, Normal Hamur, Kenar Sos Istemiyorum secilir
    And sepet gidilir
    And sepeti onayla butonuna tiklanir
    Then 60 TL ve 40 TL indirim kuponu goruntulenmeli


  @migrosyemekpassed
  Scenario: TC02 | Indirim kuponu test edilir(60 TL ve 40 TL indirim kuponu goruntulenmeli)
    Given migros uygulamasina giris yapilir
    When insan simgesine tiklanir
    And uye ol veya giris yapilir sekmesine tiklanir
    And giris yap butonuna tiklanir
    When telefon numarasi girilir
    And Mesajlarin uygulamasina gidilir
    And Gelen SMS kopyalanirr
    And SMS kodu girilir
    When Arama kutusuna Royal Dessert, Fatih yazilir
    And Royal Dessert, Fatih Cikan sonuca tiklanir
    When Royal Dessert, Fatih (Seyyid Omer Mah.) dukkanindan New York Mag Banana siparis edilir
    And eklenen sepet gidilir
    And eklenen sepeti onayla butonuna tiklanir
    Then 60 TL ve 40 TL indirim kuponu goruntulenmelidir




  #given data ve url düzenlemesi, bir data kaydedilecekse, düzenlenecekse, örnegin siteye gidilir
  #eylem kisimlari when ile, tiklanir, secme metin girme
  #and her seyden sonra kullanilabilir, joker eleman
  #then den sonra dogrulama yapilirsa yine and yazilir, when den sonra gorunus acisindan and kullanmak daha güzel durur
  #ayni sayfada isleme devam edilirse when ile devam edilebilir, birbiriyle baglantili isleri tekrar when acarak yapariz
  #then assertionda kullanilir