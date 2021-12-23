package pages.car_loans

import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import pages.base.BasePage

class CarLoansPage(driver: ChromeDriver):BasePage(driver) {
    private val agreementsButton:By= By.xpath("//div[contains(text(),'Agreements')]")

    fun agreementsButtonClick(){
        waitWebElement(agreementsButton).click()
    }

}