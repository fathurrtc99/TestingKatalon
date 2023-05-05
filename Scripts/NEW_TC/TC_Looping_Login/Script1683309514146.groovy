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

for (int i = 1; i < 5; i++) {
    WebUI.check(findTestObject('NEW_OBJECT/Login_Object/input_Username_username'))

    WebUI.setText(findTestObject('NEW_OBJECT/Login_Object/input_Username_username'), Username)

    WebUI.check(findTestObject('NEW_OBJECT/Login_Object/div_Password'))

    WebUI.setText(findTestObject('NEW_OBJECT/Login_Object/input_Password_password'), Password)

    WebUI.click(findTestObject('NEW_OBJECT/Login_Object/button_Login'))

    WebUI.delay(4)

    WebUI.click(findTestObject('NEW_OBJECT/Login_Object/i_PIM_oxd-icon bi-caret-down-fill oxd-userdropdown-icon'))

    WebUI.doubleClick(findTestObject('NEW_OBJECT/Login_Object/a_Logout'))
}

WebUI.comment('Success Running Looping Test Case')

WebUI.closeBrowser()

