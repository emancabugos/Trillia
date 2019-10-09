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

'To verify if the user will be redirected to Email Template Edit page after clicking "Sent to the Seller when their offer is declined by the Buyer."'
WebUI.callTestCase(findTestCase('Utilities/ADMIN/Admin Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/linktext_EmailNotifications'), 0)

WebUI.click(findTestObject('ADMIN/Email Notifications/Email Template/linktext_EmailNotifications'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/linktext_EmailTemplate'), 0)

WebUI.click(findTestObject('ADMIN/Email Notifications/Email Template/linktext_EmailTemplate'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/logo_emailTemplate'), 0)

WebUI.verifyElementPresent(findTestObject('ADMIN/Email Notifications/Offer Declined/linktext_OfferDeclinedEdit'), 0)

WebUI.scrollToElement(findTestObject('ADMIN/Email Notifications/Offer Declined/linktext_OfferDeclinedEdit'), 0)

WebUI.click(findTestObject('ADMIN/Email Notifications/Offer Declined/linktext_OfferDeclinedEdit'))

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Offer from Seller/button_Preview'), 0)

