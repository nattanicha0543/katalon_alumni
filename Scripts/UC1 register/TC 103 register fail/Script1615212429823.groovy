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

WebUI.selectOptionByValue(findTestObject('Object Repository/sy3/Page_Alumni/select_...                                 _8fd609'), 
    'นาย', true)

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__name'), 'ศรันสุข')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__lastname'), 'ศรีสวัส')

WebUI.selectOptionByValue(findTestObject('Object Repository/sy3/Page_Alumni/select_...                                 _54dc9e'), 
    'ชาย', true)

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__s_pe'), '2565')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__session'), '61/96')

WebUI.click(findTestObject('Object Repository/sy3/Page_Alumni/input__stu_id'))

WebUI.setEncryptedText(findTestObject('Object Repository/sy3/Page_Alumni/input__password'), 'WP0tjoHIylU=')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__h_number'), '65')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__swine'), '8')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__h_dis'), 'ปิ่นเกลียว')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__h_per'), 'ปิ่นเกลียว')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__hpro'), 'นครปฐม')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__h_code'), '73190')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input_E-mail_email'), 'name@gmail.com')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__phone'), '0859641524')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input_Facebook_facebook'), 'namenamne')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input_ID Line_line'), 'nameeieie')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__w_ps'), 'ยูทูปเบอ')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__w_name'), 'บ้าน')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__w_code'), '85')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__w_mu'), '5')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__w_tum'), 'ปิ่นเกลียว')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__w_per'), 'ปิ่นเกลียว')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__w_por'), 'นครปฐม')

WebUI.setText(findTestObject('Object Repository/sy3/Page_Alumni/input__w_pai'), '45896')

WebUI.click(findTestObject('Object Repository/sy3/Page_Alumni/button_'))

WebUI.verifyTextPresent('ลงทะเบียน', false)

