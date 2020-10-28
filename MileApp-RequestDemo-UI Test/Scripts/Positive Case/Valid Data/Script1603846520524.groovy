import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://dev.mile.app/request-demo')

WebUI.waitForPageLoad(50)

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Mileapp  Request Demo/input_Full name_name'), 'Test')

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Mileapp  Request Demo/input_Email_email'), 'Test@test.com')

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Mileapp  Request Demo/input_Phone number_phone'), '895365545200')

WebUI.delay(1)

WebUI.setText(findTestObject('Page_Mileapp  Request Demo/input_Company name_organization_name'), 'Test')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Mileapp  Request Demo/button_Request Demo'))

WebUI.verifyElementPresent(findTestObject('Page_Mileapp  Success/h1_Thank you for contacting us'), 50)

