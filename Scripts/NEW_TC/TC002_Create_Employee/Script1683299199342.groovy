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

WebUI.callTestCase(findTestCase('Test Cases/1TC_Login'), [('Username') : 'Admin', ('Password') : 'admin123'], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Success showing dashboard page')

WebUI.click(findTestObject('NEW_OBJECT/Create_Employee/a_PIM'))

WebUI.check(findTestObject('NEW_OBJECT/Create_Employee/div_Add'))

WebUI.click(findTestObject('NEW_OBJECT/Create_Employee/button_Add'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('NEW_OBJECT/Create_Employee/button_Add Employee_oxd-icon-button employee-image-action'), 
    'C:\\Users\\Fathur Rahman\\Desktop\\profile.jpg')

WebUI.setText(findTestObject('NEW_OBJECT/Create_Employee/input_Employee Full Name_firstName'), firstName)

WebUI.setText(findTestObject('NEW_OBJECT/Create_Employee/input_Employee Full Name_middleName'), middName)

WebUI.setText(findTestObject('NEW_OBJECT/Create_Employee/input_Employee Full Name_lastName'), lastName)

WebUI.click(findTestObject('NEW_OBJECT/Create_Employee/span_Employee Id_oxd-switch-input oxd-switch-input--active --label-right'))

WebUI.setText(findTestObject('NEW_OBJECT/Create_Employee/input_Username_oxd-input oxd-input--active'), new_Username)

WebUI.check(findTestObject('NEW_OBJECT/Create_Employee/div_Password'))

WebUI.setEncryptedText(findTestObject('NEW_OBJECT/Create_Employee/input_Password_oxd-input oxd-input--active'), 'YN6DFnKYEXxLSXoYoEp0Zg==')

WebUI.check(findTestObject('NEW_OBJECT/Create_Employee/div_Confirm Password'))

WebUI.setEncryptedText(findTestObject('NEW_OBJECT/Create_Employee/input_Confirm Password_oxd-input oxd-input--active'), 
    'YN6DFnKYEXxLSXoYoEp0Zg==')

WebUI.delay(5)

WebUI.click(findTestObject('NEW_OBJECT/Create_Employee/button_Save'))

WebUI.verifyElementPresent(findTestObject('NEW_OBJECT/Create_Employee/div_SuccessSuccessfully Saved'), 2)

WebUI.delay(5)

