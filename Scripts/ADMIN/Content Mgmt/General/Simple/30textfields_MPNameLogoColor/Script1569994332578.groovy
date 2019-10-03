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

WebUI.clearText(findTestObject('ADMIN/General/textfield_marketplaceName'))

WebUI.setText(findTestObject('ADMIN/General/textfield_marketplaceName'), '0625UN')

WebUI.waitForElementVisible(findTestObject('ADMIN/General/textfiled_LogoURL'), 0)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('ADMIN/General/textfiled_LogoURL'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('ADMIN/General/textfiled_LogoURL'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('ADMIN/General/textfiled_LogoURL'), '0625un.test.arcadier.io')

WebUI.clearText(findTestObject('ADMIN/General/textfield_CallToAction'))

WebUI.setText(findTestObject('ADMIN/General/textfield_CallToAction'), 'EC13FF')

WebUI.click(findTestObject('ADMIN/General/toggle_enableSearch'))

WebUI.click(findTestObject('ADMIN/General/button_SaveHomepage'))

WebUI.verifyElementVisible(findTestObject('ADMIN/General/Toaster_SuccessPanel details were'))

