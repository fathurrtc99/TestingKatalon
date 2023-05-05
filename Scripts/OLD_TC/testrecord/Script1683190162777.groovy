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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/NEW_OBJECT/Create_Employee/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/NEW_OBJECT/Create_Employee/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/NEW_OBJECT/Create_Employee/button_Login'))

WebUI.click(findTestObject('Object Repository/NEW_OBJECT/Create_Employee/a_PIM (1)'))

WebUI.click(findTestObject('Object Repository/NEW_OBJECT/Create_Employee/button_Add (1)'))

WebUI.click(findTestObject('Object Repository/NEW_OBJECT/Create_Employee/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/NEW_OBJECT/Create_Employee/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.setText(findTestObject('Object Repository/NEW_OBJECT/Create_Employee/input'), 'r')

WebUI.setText(findTestObject('Object Repository/NEW_OBJECT/Create_Employee/input_Username_oxd-input oxd-input--focus o_d4f516'), 
    'admin123')

WebUI.click(findTestObject('Object Repository/NEW_OBJECT/Create_Employee/input_Username_oxd-input oxd-input--focus'))

WebUI.setEncryptedText(findTestObject('Object Repository/NEW_OBJECT/Create_Employee/input_Password_oxd-input oxd-input--focus o_671073'), 
    '8JanWqnBZBrDwwj0ATxt2A==')

WebUI.click(findTestObject('Object Repository/NEW_OBJECT/Create_Employee/button_Save (1)'))

WebUI.click(findTestObject('Object Repository/NEW_OBJECT/Create_Employee/button_Save (1)'))

