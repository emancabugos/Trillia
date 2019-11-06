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

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users Page/textlink_User Mgmt.'), 0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Users Page/textlink_User Mgmt.'))

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users Page/Buyer Invite/linktext_Waiting List'), 0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Users Page/Buyer Invite/linktext_Waiting List'))

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users Page/Buyer Invite/linktext_Consumer'), 0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Users Page/Buyer Invite/linktext_Consumer'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users Page/Buyer Invite/div_Invite Consumer'), 0)

WebUI.click(findTestObject('ADMIN/User Mgmt/Users Page/Buyer Invite/div_Invite Consumer'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('ADMIN/User Mgmt/Users Page/Buyer Invite/textarea'), 0)

WebUI.setText(findTestObject('ADMIN/User Mgmt/Users Page/Buyer Invite/textarea'), GlobalVariable.ConsumerNotif)

WebUI.click(findTestObject('ADMIN/User Mgmt/Users Page/Buyer Invite/input_mybtn btn-blue'), FailureHandling.STOP_ON_FAILURE)

