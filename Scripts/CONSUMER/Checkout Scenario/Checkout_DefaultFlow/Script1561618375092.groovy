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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import internal.GlobalVariable as GlobalVariable

WebUI.comment('Verification of Home link text')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Homepage/textfield_Search'), 0)

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), 'Prescription Drug A')

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), 'Prescription Drug A')

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/button_AddtoEvaluation'), 0)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_MOQValue'), 0)

WebUI.comment('Computation')

def price = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_price'))

KeywordLogger log = new KeywordLogger()
log.logInfo(price)
WebUI.setText(findTestObject('CONSUMER/Item Details Page/domainUpDown_Quantity'), '100')

def quantity = WebUI.getText(findTestObject('CONSUMER/Item Details Page/domainUpDown_Quantity'))

log.logInfo(quantity)

def total
assert (price * quantity) == total

log.logInfo(total)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_up'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_EvaluateItems'), 0)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Evaluation Widget/dropdown_ListName'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/container_empty'), 0)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/dropdown_ListName'))

WebUI.selectOptionByLabel(findTestObject('CONSUMER/Evaluation Widget/dropdown_ListName'), 'Create new list', true)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/button_Cancel'), 0)

WebUI.setText(findTestObject('CONSUMER/Evaluation Widget/textfield_ListName'), 'Checkout 1')

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_Save'))

WebUI.waitForPageLoad(5)

WebUI.waitForElementAttributeValue(findTestObject('CONSUMER/Evaluation Widget/textlabel_ListNameTitle'), 'text', '(Checkout 1)', 
    5)

WebUI.verifyElementText(findTestObject('CONSUMER/Evaluation Widget/textlabel_ListNameTitle'), '(Checkout 1)')

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_down'))

WebUI.click(findTestObject('CONSUMER/Item Details Page/button_AddtoEvaluation'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Widget/a_Delete/button_delete'), 0)

WebUI.click(findTestObject('CONSUMER/Evaluation Widget/button_EvaluateItems'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Table/button_OrderNow'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Evaluation Table/textlabel_ItemName'), 'Prescription Drug A')

WebUI.click(findTestObject('CONSUMER/Evaluation Table/button_OrderNow'))

