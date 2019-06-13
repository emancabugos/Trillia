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

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Merchant Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Upload'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Upload'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)

WebUI.comment('Listing Name')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_listing-name'), 'Item For Search')

WebUI.comment('Categories')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), 'Category 1')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Select all'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Item Cover Image')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/icon_browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Upload Image'), [('varImagePath') : 'C:\\\\Katalon\\\\Image\\\\coverimage2.jpg'], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/icon_browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Upload Image'), [('varImagePath') : 'C:\\\\Katalon\\\\Image\\\\coverimage1.jpg'], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/icon_browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Upload Image'), [('varImagePath') : 'C:\\\\Katalon\\\\Image\\\\image1.jpg'], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/icon_browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Upload Image'), [('varImagePath') : 'C:\\\\Katalon\\\\Image\\\\image2.jpg'], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/icon_browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Upload Image'), [('varImagePath') : 'C:\\\\Katalon\\\\Image\\\\image3.jpg'], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Item Description')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_item-description'), 'Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Nymphetamine Methamphetamine Nymphetamine Ny')

WebUI.comment('Country')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), 'Philippines')

WebUI.waitForElementPresent(findTestObject('MERCHANT/Upload Item Page/Item Upload/Country Search/checkbox_1st search '), 
    0)

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/Country Search/checkbox_1st search '), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Stock/Unlimited')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_SKU'), '123')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_MOQ'), '123N')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_Stocks'), '2')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_price'), '1')

WebUI.comment('Click Upload Button')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/button_Upload Now'), FailureHandling.CONTINUE_ON_FAILURE)

