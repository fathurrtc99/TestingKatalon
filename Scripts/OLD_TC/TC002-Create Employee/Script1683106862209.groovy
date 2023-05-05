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

/**
 *Panggil Test case login 
 */
WebUI.callTestCase(findTestCase('Test Cases/OLD_TC/TC001-Login'), [('Username') : 'Admin', ('Password') : 'admin123'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.comment('Succes showing dashboard')

/*
 * Lanjut masuk kedalam dashboard dan buka creater employee page
 */
WebUI.click(findTestObject('Object Repository/add-employee/add_employee_page/a_PIM'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/add-employee/add_employee_page/li_Add Employee'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/add-employee/add_employee_page/h6_Add Employee'), 0)

WebUI.setText(findTestObject('Object Repository/add-employee/add_employee_page/input_Employee Full Name_firstName'), 'Gol ', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/add-employee/add_employee_page/input_Employee Full Name_middleName'), 'D.', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/add-employee/add_employee_page/input_Employee Full Name_lastName'), 'Rahman', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/add-employee/add_employee_page/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.closeBrowser()

