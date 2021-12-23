package pages.telecomunication

import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import pages.base.BasePage

class MobilePhoneReplanishmantPage(driver: ChromeDriver) : BasePage(driver) {

 private val buttonWallet:By =By.xpath("//div[contains(text(),'My wallet')]")


 fun  buttonWalletClick(): MobilePhoneReplanishmantPage {
  waitWebElement(buttonWallet).click()
     return this
 }
}