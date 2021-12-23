package tests.telecomunication.positive

import tests.base.BaseTest
import common.Config.MOBILR_PAIMENT_URL
import org.junit.jupiter.api.Test

class MobilePhoneReplanishmantTest:BaseTest() {
    @Test
    fun CheckRedirectToAuth(){
        basePage?.goToUrl(MOBILR_PAIMENT_URL)
        mobilePhoneReplanishmantPage?.buttonWalletClick()
        basePage?.isAuthWidgetPresent()

    }

}