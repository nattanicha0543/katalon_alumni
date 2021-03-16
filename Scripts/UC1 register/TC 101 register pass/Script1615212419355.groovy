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

WebUI.selectOptionByValue(findTestObject('Object Repository/register1/Page_Alumni/select_...                                 _8fd609'), 
    'นาย', true)

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__name'), 'ชวกร')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__name'), 'ชวกร')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__lastname'), 'รามเรือง')

WebUI.selectOptionByValue(findTestObject('Object Repository/register1/Page_Alumni/select_...                                 _54dc9e'), 
    'ชาย', true)

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__p_num'), '12345678945632')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__s_pe'), '2565')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__session'), '61/59')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__stu_id'), '614259066')

WebUI.setEncryptedText(findTestObject('Object Repository/register1/Page_Alumni/input__password'), 'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__h_number'), '12')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__swine'), '5')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__h_dis'), 'ดอนตูม')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__h_per'), 'กำแพงแสน')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__hpro'), 'นครปฐม')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__h_code'), '14526')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input_E-mail_email'), 'kon@gmail.com')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__phone'), '0859696963')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input_Facebook_facebook'), 'konnnn')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input_ID Line_line'), 'koneiei')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__w_ps'), 'พ่อค้า')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__w_name'), 'ตลาดนัด')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__w_code'), '45')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__w_mu'), '5')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__w_tum'), 'ดอนตูม')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__w_per'), 'กำแพงแสน')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__w_por'), 'นครปฐม')

WebUI.setText(findTestObject('Object Repository/register1/Page_Alumni/input__w_pai'), '14529')

WebUI.click(findTestObject('Object Repository/register1/Page_Alumni/button_'))

