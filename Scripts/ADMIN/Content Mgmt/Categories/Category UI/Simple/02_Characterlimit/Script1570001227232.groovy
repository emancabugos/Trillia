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
import com.thoughtworks.selenium.webdriven.commands.GetAttribute as GetAttribute
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementVisible(findTestObject('ADMIN/Categories/Category/textlabel_AddEdit a Category'), 0)

WebUI.clearText(findTestObject('ADMIN/Categories/Category/textfield_Category Name'))

WebUI.setText(findTestObject('ADMIN/Categories/Category/textfield_Category Name'), 'dfkldskhdsklhdsfkljfdakjldfskdjlfsdsfkjlsdfjlksafdjlasfdjl;safdlsdfajlsadfjljslaadjslfajldslsjsdajlfakljdasklj')

String diana = WebUI.getAttribute(findTestObject('ADMIN/Categories/Category/textfield_Category Name'), 'value')

maxlengthnicategory = WebUI.getAttribute(findTestObject('ADMIN/Categories/Category/textfield_Category Name'), 'maxlength')

WebUI.verifyMatch('30', maxlengthnicategory, false)

