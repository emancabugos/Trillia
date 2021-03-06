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

WebUI.setText(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_firstname'), 'Coffin')

WebUI.setText(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_lastname'), 'Maker')

WebUI.setText(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_username'), 'submerchant1')

WebUI.setText(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_password'), 'welcome8')

WebUI.setText(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_reconfirm-password'), 'welcome8')

WebUI.setText(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_notificationemail'), '')

WebUI.click(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/button_account-submit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_firstname'), 'value', 'Coffin', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_lastname'), 'value', 'Maker', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_username'), 'value', 'submerchant1', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_password'), 'value', 'welcome8', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/Merchant Sub Account/Onboarding/input_reconfirm-password'), 'value', 
    'welcome8', 0)

