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

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Feature Control List/sidemenu_Features Control'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Feature Control List/sidemenu_Features Control'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Feature Control List/button_Edit cookies'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Feature Control List/button_Edit cookies'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Cookie Policy/textbox_message'), 0)

WebUI.setText(findTestObject('ADMIN/Cookie Policy/textbox_message'), 'Nang mainlove ako sayo kala ko\'y pag ibig mo ay tunay...')

WebUI.setText(findTestObject('ADMIN/Cookie Policy/textbox_cookie policy'), 'Cookies and Cream')

WebUI.setText(findTestObject('ADMIN/Cookie Policy/textbox_button url'), 'arcadier.com')

WebUI.setText(findTestObject('ADMIN/Cookie Policy/textbox_accept button'), 'Accept Pookies')

WebUI.click(findTestObject('ADMIN/Cookie Policy/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('ADMIN/Features Control/Feature Control List/button_Edit cookies'), 0)

WebUI.click(findTestObject('ADMIN/Features Control/Feature Control List/button_Edit cookies'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/Cookie Policy/textbox_message'), 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Cookie Policy/textbox_message'), 'value', 'Nang mainlove ako sayo kala ko\'y pag ibig mo ay tunay...', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Cookie Policy/textbox_cookie policy'), 'value', 'Cookies and Cream', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Cookie Policy/textbox_button url'), 'value', 'arcadier.com', 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/Cookie Policy/textbox_accept button'), 'value', 'Accept Pookies', 
    0)

