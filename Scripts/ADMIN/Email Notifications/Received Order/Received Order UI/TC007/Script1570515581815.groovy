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

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/linktext_EmailNotifications'), 0)

WebUI.click(findTestObject('ADMIN/Email Notifications/Email Template/linktext_EmailNotifications'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/linktext_EmailTemplate'), 0)

WebUI.click(findTestObject('ADMIN/Email Notifications/Email Template/linktext_EmailTemplate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Email Notifications/Email Template/Linktext_Edit Received Order'), 0)

WebUI.click(findTestObject('ADMIN/Email Notifications/Email Template/Linktext_Edit Received Order'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyOptionSelectedByLabel(findTestObject('ADMIN/Email Notifications/Offer from Seller/dropdown_Template'), 'Received Order', 
    true, 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Email Notifications/Welcome Mail/textarea (1)'), 'value', '                                                                                <body><div style="max-width:700px; width:100%; margin:0 auto; border:1px solid #ddd; color:#999; font-size:16px; font-family:sans-serif; line-height:25px;">', 
    0)

