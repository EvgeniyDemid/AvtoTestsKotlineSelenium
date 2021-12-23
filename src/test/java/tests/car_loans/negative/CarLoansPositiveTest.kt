package tests.car_loans.negative

import tests.base.BaseTest
import common.Config.CAR_LOANS_URL
import org.junit.jupiter.api.Test

class CarLoansPositiveTest:BaseTest() {
    @Test
    fun selectAgrimentsTabInPablicSession(){
        basePage?.goToUrl(CAR_LOANS_URL)
        carLoansPage?.agreementsButtonClick()
        basePage?.isAuthWidgetPresent()
    }
}