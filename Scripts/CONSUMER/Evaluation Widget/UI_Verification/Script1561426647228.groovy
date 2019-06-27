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

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), 'Item ni April')

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), 'Item ni April')

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/domainUpDown_Quantity'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/button_AddtoEvaluation'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Item Details Page/button_ContactSupplier'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_up'))

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_up'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_Previous'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_Previous'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/container_empty'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_Next'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/dropdown_ListName'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_EvaluateItems'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_Edit'))

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_Edit'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_Cancel'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_close'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/textlabel_ListName'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/textfield_ListName'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_Cancel'))

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_Save'))

