package tests.base


import common.Config.CLOSE_BROWSER
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode
import org.openqa.selenium.chrome.ChromeDriver
import pages.base.BasePage
import pages.car_loans.CarLoansPage
import pages.telecomunication.MobilePhoneReplanishmantPage
//@Execution(ExecutionMode.CONCURRENT)//запуск многопоточного теста
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
open class BaseTest{
    open var driver: ChromeDriver? = null
    protected var basePage:BasePage?=null
    protected var carLoansPage:CarLoansPage?= null
    protected var mobilePhoneReplanishmantPage: MobilePhoneReplanishmantPage?=null

    @BeforeEach
    fun setUp(){
        System.setProperty("webdriver.chrome.driver", "/home/demidov/AvtoTestsKotlineSelenium/Driver/chromedriver")
        driver = ChromeDriver()
        (driver as ChromeDriver).manage().window().maximize()
        if (driver!=null){
             basePage= BasePage(driver!!)
             carLoansPage= CarLoansPage(driver!!)
             mobilePhoneReplanishmantPage=MobilePhoneReplanishmantPage(driver!!)
        }
    }

    @AfterEach
    fun tearDown() {
        if (CLOSE_BROWSER){
            driver?.quit()
        }

    }

}