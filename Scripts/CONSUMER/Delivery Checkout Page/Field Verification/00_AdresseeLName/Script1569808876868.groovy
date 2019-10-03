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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.waitForElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/a_DeliveryAddress/textfield_AddreseeLastName'), 
    0)

WebUI.clearText(findTestObject('CONSUMER/Delivery Checkout Page/a_DeliveryAddress/textfield_AddreseeLastName'))

WebUI.click(findTestObject('CONSUMER/Delivery Checkout Page/a_DeliveryAddress/button_Add'))

String errornotif = WebUI.getCSSValue(findTestObject('CONSUMER/Delivery Checkout Page/a_DeliveryAddress/textfield_AddreseeLastName'), 
    'border-color')

KeywordLogger log = new KeywordLogger()

log.logInfo(errornotif)

WebUI.verifyMatch(errornotif, 'rgb(202, 11, 11)', false)

WebUI.verifyElementVisible(findTestObject('CONSUMER/Delivery Checkout Page/a_DeliveryAddress/button_Add'))

