import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.stringtemplate.v4.compiler.STParser.namedArg_return as namedArg_return
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

WebUI.setText(findTestObject('CONSUMER/Homepage/textfield_Search'), 'Item Test Checkout')

WebUI.click(findTestObject('CONSUMER/Homepage/button_Search'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Search Result Page/itembox_SearchResultPage'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'), 'Item Test Checkout')

WebUI.click(findTestObject('CONSUMER/Search Result Page/itemName_SearchResultPage'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/button_AddtoEvaluation'), 0)

WebUI.waitForElementVisible(findTestObject('CONSUMER/Item Details Page/textlabel_MOQValue'), 0)

WebUI.comment('Computation')

def price = WebUI.getText(findTestObject('CONSUMER/Item Details Page/textlabel_price'))

KeywordLogger log = new KeywordLogger()

log.logInfo(price)

WebUI.setText(findTestObject('CONSUMER/Item Details Page/domainUpDown_Quantity'), '10')

def quantity = 10 /*WebUI.getText(findTestObject('CONSUMER/Item Details Page/domainUpDown_Quantity'))*/ 

//log.logInfo(quantity)
def total = price * quantity

//assert total
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

WebUI.comment('Evaluation Table')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Evaluation Table/button_OrderNow'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Evaluation Table/textlabel_ItemName'), 'Item Test Checkout')

WebUI.click(findTestObject('CONSUMER/Evaluation Table/button_OrderNow'))

WebUI.comment('Delivery Checkout Page')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/textlabel_FirstName'), 0)

name = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_Name'))

address = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_Address'))

country = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_Country'))

state = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_State'))

city = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_City'))

postalcode = WebUI.getText(findTestObject('CONSUMER/Delivery Checkout Page/default_PostalCode'))

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/default_Delivery'))

WebUI.scrollToElement(findTestObject('CONSUMER/Delivery Checkout Page/button_Next'), 0)

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/button_Next'))

WebUI.comment('Checkout Review Page')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Checkout Review Page/button_ConfirmOrder'), 0)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_ConsumerName'), name)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_Address'), address)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_Country'), country)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_City'), city)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_State'), state)

WebUI.verifyElementText(findTestObject('CONSUMER/Checkout Review Page/textlabel_PostalCode'), postalcode)

WebUI.click(findTestObject('CONSUMER/Checkout Review Page/button_radio1'))

WebUI.comment('Verification of computation')

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Checkout Review Page/button_ConfirmOrder'))

WebUI.waitForElementVisible(findTestObject('CONSUMER/Transaction Complete Page/textlabel_InvoiceIDValue'), 0)

invoice = WebUI.getText(findTestObject('CONSUMER/Transaction Complete Page/textlabel_InvoiceIDValue'))

WebUI.delay(1)

WebUI.click(findTestObject('CONSUMER/Transaction Complete Page/button_PurchaseHistory'))

WebUI.comment('Purchase History List')

WebUI.waitForElementVisible(findTestObject('CONSUMER/Purchase History List/textfield_Search'), 0)

WebUI.sendKeys(findTestObject('CONSUMER/Purchase History List/textfield_Search'), invoice.toLowerCase())

WebUI.delay(1)

WebUI.waitForElementAttributeValue(findTestObject('CONSUMER/Purchase History List/tablecontent_Invoice'), 'text', invoice, 
    5)

WebUI.verifyElementText(findTestObject('CONSUMER/Purchase History List/tablecontent_Invoice'), invoice.toLowerCase())

WebUI.acceptAlert()

