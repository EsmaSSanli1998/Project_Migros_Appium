package migros.utils;

public class NotClass {

    /*

        KeyEvent back = new KeyEvent(AndroidKey.BACK);
        DriverNoApk.pressKey(back);

        KeyEvent home = new KeyEvent(AndroidKey.HOME);
        DriverNoApk.pressKey(home);

        DriverNoApk.setClipboardText("Migros");//ctrl c komutunun islevini görür
        ...  .sendkeys(driver.getClipboardText());//ctrl v komutunun islevini görür

driver.hideKeyboard();-->yazi yazinca klavye cikarsa kapatmak icin
----------------------------------------------------------------------------------------------------
      assertion yaparken testNG' önce actal sonra expected, JUnit önce expected sonra actual yazilir

-----------------------------------------------------------------------------------------------------------------
        DROPDOWN MENU

        // https://www.amazon.com/ sayfasina gidin
        driver.get("https://www.amazon.com/");

        Thread.sleep(2000);

        // dropdown'dan "Books" secenegini secin

        //Dropdown 3 adimda handle edilir

        //1. Sayfanin locate i alinir
        WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        //2. Select objesi olusturulur
        Select select = new Select(ddm);

        //3. Opsiyonlardan bir tanesi secilir
        select.selectByVisibleText("Books");

        Thread.sleep(2000);

        // arama cubuguna "Java" aratın
        WebElement aramaKutsusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
          aramaKutsusu.sendKeys("Java");

        // arama sonuclarinin Java icerdigini test edin
        WebElement aramaSonucElementi = driver.findElement(By.xpath("(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));

        Assert.assertTrue(aramaSonucElementi.getText().contains("Java"));


--------------------------------------------------------------------------------------------------
elementId: Tıklanacak elementin benzersiz ID’si
● left: Sınır alanın sol koordinatı
● top: Sınır alanın üstkoordinatı
● width: Sınır alanın genişliği
● height: Sınır alanın yüksekliği
● direction: Kaydırma yönü (up, down, left, right) Zorunlu parametre
● percent: Kaydırma boyutu. 1.0 = %100 Zorunlu parametre
● speed: Hareketin saniyedeki pixel cinsinden hızı








































































 */
}
