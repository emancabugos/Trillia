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

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Welcome Mail/dropdown_AdminConsumerGeneralIte'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Welcome Mail/dropdown_AdminConsumerGeneralIte'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('ADMIN/Email Notifications/Welcome Mail/dropdown_AdminConsumerGeneralIte'), 'Marketplace', 
    true)

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Welcome Mail/Marketplace Parameters/Logo'), 0)

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Welcome Mail/Marketplace Parameters/Logo'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Welcome Mail/Marketplace Parameters/Market Domain'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Welcome Mail/Marketplace Parameters/Market name'))

WebUI.verifyElementVisible(findTestObject('ADMIN/Email Notifications/Welcome Mail/Marketplace Parameters/Marketplace URL'))

WebUI.delay(2)

