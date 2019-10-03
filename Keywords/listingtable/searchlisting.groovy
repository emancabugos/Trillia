package listingtable

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import org.openqa.selenium.By
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

public class searchListing {

	@Keyword
	def searchFor(String item, int timeout) {
		'Expected value from Table'
		//String ExpectedValue = item

		WebDriver driver = DriverFactory.getWebDriver()
		WebElement tab = driver.findElement(By.xpath('/html/body/div[4]/div/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]'))
		List<WebElement> rows = tab.findElement(By.tagName('"tr"'))
		table: for (int i = 0; i <= rows.size(); i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName('td'))
			for (int j = 0; j <= cols.size(); j++) {
				if (cols.get(j).getText().equalsIgnoreCase(item)) {
					cols.get(8).findElement(By.tagName('a')).click()

					break
				}//if
			}//for
		}//for
	}//keyword

}