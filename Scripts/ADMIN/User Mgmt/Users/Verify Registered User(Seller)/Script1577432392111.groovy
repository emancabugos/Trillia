import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementVisible(findTestObject('ADMIN/New Sidebar Menu/a_User Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/New Sidebar Menu/a_User Mgmt.'))

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users Page/a_Users'), 0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Users Page/a_Users'))

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users Page/textfield_searchdisplaynameNotif'), 0)

WebUI.setText(findTestObject('ADMIN/User Mgmt/Users Page/textfield_searchdisplaynameNotif'), varDisplayName)

WebUI.click(findTestObject('ADMIN/User Mgmt/Users Page/button_Search'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users Page/text_displayName'), 0)

WebUI.verifyElementAttributeValue(findTestObject('ADMIN/User Mgmt/Users Page/text_displayName'), 'text', varDisplayName, 
    0)

