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

'Verify if password textfield can accept valid data\r\n'
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.HomepageURL)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Landing Page/button_Buyer Sign in'), 0)

WebUI.click(findTestObject('CONSUMER/Landing Page/button_Buyer Sign in'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Login Buyer/linktext_ForgottenYourPassword'), 0)

WebUI.comment('Password textfield can accept valid data')

WebUI.setText(findTestObject('CONSUMER/Login Buyer/textfield_username'), '')

WebUI.setText(findTestObject('CONSUMER/Login Buyer/textfield_password'), '')

WebUI.click(findTestObject('CONSUMER/Login Buyer/button_SignIn'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'))

WebUI.closeBrowser()

