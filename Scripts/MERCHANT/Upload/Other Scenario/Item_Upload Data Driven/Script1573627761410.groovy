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

WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/tab_Basic Details'), 0)

WebUI.comment('Listing Name')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_listing-name'), varListingName)

WebUI.comment('Categories')

if (varCategory == 'allcategories') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Select all'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Select all'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'multiplecategories') {
    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Select all'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/textlabel_Select all'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'category1') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 1'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'category2.1') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 2.1'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'category3.1') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/Category 3.1.1'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varCategory == 'Category Name mAx 021!!@#$%^&!') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_category-name'), varCategory)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Category/maxcat'), FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.comment('Item Cover Image')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/icon_browse'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('MERCHANT/Image Cropper/button_upload item'), varImage)

WebUI.waitForElementVisible(findTestObject('MERCHANT/Image Cropper/div_crop'), 0)

WebUI.click(findTestObject('MERCHANT/Image Cropper/div_crop'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.comment('Item Description')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_item-description'), varDescription)

WebUI.comment('Custom Fields')

WebUI.delay(2)

WebUI.comment('Country')

if (varDeliversTo == 'allcountries') {
    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/Country Search/select all'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/Country Search/select all'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varDeliversTo == 'multiplecountries') {
    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Item Upload/Country Search/select all'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/Country Search/select all'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varDeliversTo == 'MY') {
    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Country/MY'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Country/MY'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varDeliversTo == 'PH') {
    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Country/PH'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Country/PH'), FailureHandling.CONTINUE_ON_FAILURE)
} else if (varDeliversTo == 'SG') {
    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/searchbar_country'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementVisible(findTestObject('MERCHANT/Upload Item Page/Country/SG'), 0)

    WebUI.click(findTestObject('MERCHANT/Upload Item Page/Country/SG'), FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.comment('Stock/Unlimited')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_SKU'), varSKU)

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_MOQ'), varMOQ)

WebUI.comment('Stock')

WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_Stocks'), varStock)

WebUI.comment('Price')

if (varDeliversTo == 'allcountries') {
    WebUI.callTestCase(findTestCase('MERCHANT/Upload/xpath_iteration Price'), [(varPrice) : varPrice], FailureHandling.CONTINUE_ON_FAILURE)
} else if (varPrice == 'multiplecountries') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Price/PH'), '14.25')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Price/SG'), '15')

    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Price/MY'), '17')
} else if (varPrice == 'single') {
    WebUI.setText(findTestObject('MERCHANT/Upload Item Page/Item Upload/textbox_price'), varPrice)
}

WebUI.comment('Delivery Method')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/checkbox_available'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Pickup')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/checkbox_available2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Click Upload Button')

WebUI.click(findTestObject('MERCHANT/Upload Item Page/Item Upload/button_Upload Now'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('MERCHANT/Inventory Page/button_ Upload Item'), 0)

