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

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Upload'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Upload'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Country')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), 'Philippines')

WebUI.waitForElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/Country Search/checkbox_1st search '), 
    0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/Country Search/checkbox_1st search '), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/Country Search/textlabel_selected country'), 
    0)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/Pricing/textbox_pricing'), '10')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/Pricing/button_edit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/textlabel_EDIT BULK PRICING'), 0)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_start'), '1')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_range_end'), '10')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/input_rate_cost'), '10')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/button_Add New Bulk Price'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/button_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Edit Bulk Pricing/bulk pricing/span_10'), 0)

