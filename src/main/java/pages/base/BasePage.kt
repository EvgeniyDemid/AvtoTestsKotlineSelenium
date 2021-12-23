package pages.base

import common.Config
import  constants.Constant.IMPLISIT_WAIT
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

open class BasePage(var driver: ChromeDriver) {

    private val wait: WebDriverWait = WebDriverWait(driver, IMPLISIT_WAIT);
    private val authWidret:By= By.xpath("//div[@style='padding-top: 80px; padding-bottom: 80px;']")

 fun goToUrl(url:String){
     driver.get(url)
 }
    fun waitWebElement(element: By): WebElement {
      return wait.until(ExpectedConditions.presenceOfElementLocated(element))
    }
    fun waitElementIsVisibl(element:WebElement):WebElement{
        return wait.until(ExpectedConditions.visibilityOf(element))
    }
    fun isAuthWidgetPresent(){
        val authFrame:WebElement=waitWebElement(authWidret)
        waitElementIsVisibl(authFrame)
    }
}
