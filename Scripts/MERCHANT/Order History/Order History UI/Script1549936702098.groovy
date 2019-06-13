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

WebUI.waitForElementVisible(findTestObject('Utilities/Header/Merchant Header/linktext_Orders'), 0)

WebUI.click(findTestObject('Utilities/Header/Merchant Header/linktext_Orders'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Header')

WebUI.waitForElementVisible(findTestObject('Utilities/Header/marketplace_logo'), 0)

WebUI.verifyElementPresent(findTestObject('Utilities/Header/marketplace_logo'), 0)

WebUI.verifyElementText(findTestObject('Utilities/Header/Merchant Header/linktext_Dashboard'), 'DASHBOARD')

WebUI.verifyElementText(findTestObject('Utilities/Header/Merchant Header/linktext_Your Items'), 'INVENTORY')

WebUI.verifyElementText(findTestObject('Utilities/Header/Merchant Header/linktext_Upload'), 'UPLOAD')

WebUI.verifyElementText(findTestObject('Utilities/Header/Merchant Header/linktext_Orders'), 'ORDERS')

WebUI.verifyElementPresent(findTestObject('Utilities/Header/icon_inbox'), 0)

WebUI.verifyElementPresent(findTestObject('Utilities/Header/icon_cart'), 0)

WebUI.verifyElementPresent(findTestObject('Utilities/Header/language'), 0)

WebUI.comment('Body')

WebUI.verifyElementText(findTestObject('MERCHANT/Order Page/textlabel_Order History'), 'Order History')

WebUI.verifyElementPresent(findTestObject('MERCHANT/Order Page/button_Change Status'), 0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Order Page/textbox_search-item'), 0)

WebUI.verifyElementAttributeValue(findTestObject('MERCHANT/Order Page/textbox_search-item'), 'placeholder', 'Search by Invoice ID', 
    0)

WebUI.verifyElementPresent(findTestObject('MERCHANT/Order Page/button_Change Status'), 0)

WebUI.verifyElementText(findTestObject('MERCHANT/Order Page/textlabel_Invoice No'), 'Invoice No')

WebUI.verifyElementText(findTestObject('MERCHANT/Order Page/textlabel_Order No'), 'Order No')

WebUI.verifyElementText(findTestObject('MERCHANT/Order Page/textlabel_Timestamp'), 'Timestamp')

WebUI.verifyElementText(findTestObject('MERCHANT/Order Page/textlabel_No of Item(s)'), 'No of Item(s)')

WebUI.verifyElementText(findTestObject('MERCHANT/Order Page/textlabel_Order Total'), 'Order Total')

WebUI.verifyElementText(findTestObject('MERCHANT/Order Page/textlabel_Order Status'), 'Order Status')

WebUI.verifyElementText(findTestObject('MERCHANT/Order Page/textlabel_Payment Method'), 'Payment Method')

WebUI.verifyElementText(findTestObject('MERCHANT/Order Page/textlabel_Payment Status'), 'Payment Status')

WebUI.callTestCase(findTestCase('Utilities/MERCHANT/Header Footer Redirection'), [:], FailureHandling.CONTINUE_ON_FAILURE)

