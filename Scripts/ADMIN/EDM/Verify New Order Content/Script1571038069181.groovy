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
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), 0)

WebUI.setText(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), 'New Order')

WebUI.sendKeys(findTestObject('ADMIN/Gmail Page/textfield_searchbar'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('ADMIN/Gmail Page/link_New Order'), 0)

WebUI.delay(0)

WebUI.click(findTestObject('ADMIN/Gmail Page/link_New Order'))

WebUI.waitForElementVisible(findTestObject('EDM/Common/textlabel_Email Subject'), 0)

WebUI.click(findTestObject('EDM/Common/btn_Show Details'))

WebUI.verifyElementPresent(findTestObject('EDM/Common/textfield_to'), 0)

strEmail = WebUI.getAttribute(findTestObject('EDM/Common/textfield_to'), 'email')

WebUI.verifyElementAttributeValue(Email, 'email', to, 0)

WebUI.verifyElementPresent(findTestObject('EDM/Common/textfield_cc'), 0)

strMail = WebUI.getAttribute(findTestObject('EDM/Common/textfield_cc'), 'email')

WebUI.verifyElementAttributeValue(Mail, 'email', cc, 0)

WebUI.verifyElementPresent(findTestObject('EDM/New Order/textlabel_Hi'), 0)

WebUI.verifyTextPresent('Hi Seller,', false)

WebUI.verifyElementPresent(findTestObject('EDM/New Order/textlabel_You have a new order from'), 0)

WebUI.verifyTextPresent('You have a new order from trisha.', false)

WebUI.verifyElementPresent(findTestObject('EDM/New Order/textlabel_ORDER IDvalue'), 0)

WebUI.verifyTextPresent('ORDER ID : 38896', false)

WebUI.verifyElementPresent(findTestObject('EDM/New Order/textlabel_INVOICE ID'), 0)

WebUI.verifyTextPresent('INVOICE ID 0625UN1571037953UDXF', false)

