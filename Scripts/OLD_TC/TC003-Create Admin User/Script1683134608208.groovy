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

//Login Default Admin
WebUI.callTestCase(findTestCase('Test Cases/OLD_TC/TC001-Login'), [('Username') : 'Admin', ('Password') : 'admin123'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.comment('Succes showing dashboard')

//Create User Page
WebUI.click(findTestObject('Object Repository/Create _User_Admin/a_Admin'), FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Object Repository/Create _User_Admin/div_Add'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Create _User_Admin/button_Add'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.check(findTestObject('Object Repository/Create _User_Admin/h6_Add User'), FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Object Repository/Create _User_Admin/div_User Role-- Select --'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create _User_Admin/div_Admin'))

WebUI.check(findTestObject('Object Repository/Create _User_Admin/div_Status-- Select --'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create _User_Admin/div_Enabled'))

WebUI.check(findTestObject('Create _User_Admin/input'))

WebUI.setText(findTestObject('Create _User_Admin/input'), 'O')

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Create _User_Admin/tambahan/div_Odis  Adalwin'))

WebUI.check(findTestObject('Object Repository/Create _User_Admin/input_Username_oxd-input oxd-input--active'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Create _User_Admin/input_Username_oxd-input oxd-input--active'), 'RTC112', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Create _User_Admin/tambahan/input_Password_oxd-input oxd-input--active'), '8JanWqnBZBrDwwj0ATxt2A==')

WebUI.setEncryptedText(findTestObject('Create _User_Admin/tambahan/input_Confirm Password_oxd-input oxd-input--focus'), 
    '8JanWqnBZBrDwwj0ATxt2A==')

WebUI.delay(4)

WebUI.click(findTestObject('Create _User_Admin/button_Save'))

WebUI.takeFullPageScreenshot()

WebUI.delay(4)

WebUI.closeBrowser()

