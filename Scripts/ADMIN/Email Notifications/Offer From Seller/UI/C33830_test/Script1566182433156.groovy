import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/linktext_EmailNotifications'), 0)

WebUI.click(findTestObject('ADMIN/Email Notifications/Email Template/linktext_EmailNotifications'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/linktext_EmailTemplate'), 0)

WebUI.click(findTestObject('ADMIN/Email Notifications/Email Template/linktext_EmailTemplate'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/logo_emailTemplate'), 0)

if (true == WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/button_Enable'))) {
    WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/button_Enable'))

    WebUI.click(findTestObject('ADMIN/Email Notifications/Email Template/button_Enable'))

    WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/button_Disable'), 0)
} 

else if (true == WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/button_Disable'))) {
    WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/button_Disable'))

    WebUI.delay(2)
}

WebUI.scrollToElement(findTestObject('ADMIN/Email Notifications/Offer from Seller/linktext_OfferFromSellerEdit'), 0)

WebUI.click(findTestObject('ADMIN/Email Notifications/Offer from Seller/linktext_OfferFromSellerEdit'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Offer from Seller/button_Preview'), 0)

if (true == WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Offer from Seller/button_ShowCcBcc'))) {
    WebUI.verifyElementNotClickable(findTestObject('ADMIN/Email Notifications/Offer from Seller/button_ShowCcBcc'))

    WebUI.click(findTestObject('ADMIN/Email Notifications/Offer from Seller/toggle_emailNotification'))

    WebUI.waitForElementClickable(findTestObject('ADMIN/Email Notifications/Offer from Seller/button_ShowCcBcc'), 0)
	
} 

else if (true == WebUI.verifyElementClickable(findTestObject('ADMIN/Email Notifications/Offer from Seller/button_ShowCcBcc'))) 
{
    WebUI.verifyElementClickable(findTestObject('ADMIN/Email Notifications/Offer from Seller/button_ShowCcBcc'))

    WebUI.delay(2)
}

