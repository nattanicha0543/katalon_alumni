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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/alumni_pro2/')

WebUI.click(findTestObject('Object Repository/login 2/Page_Alumni/div__md-form my-0'))

WebUI.click(findTestObject('Object Repository/login 2/Page_Alumni/a_Login'))

WebUI.setText(findTestObject('Object Repository/login 2/Page_Alumni/input_Login_stu_id'), '614259041')

WebUI.setEncryptedText(findTestObject('Object Repository/login 2/Page_Alumni/input_Student_ID_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/login 2/Page_Alumni/button_Login'))

WebUI.click(findTestObject('Object Repository/login 2/Page_Alumni/button_614259041'))

WebUI.click(findTestObject('Object Repository/login 2/Page_Alumni/a_'))

WebUI.click(findTestObject('Object Repository/login 2/Page_Alumni/div_'))

WebUI.verifyTextPresent('เมืองแมน', false)

WebUI.closeBrowser()

