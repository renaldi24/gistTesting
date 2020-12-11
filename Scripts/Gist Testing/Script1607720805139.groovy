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

WebUI.navigateToUrl('https://github.com/login/')

WebUI.setText(findTestObject('Object Repository/Login page/Page_Sign in to GitHub  GitHub/input_Username or email address_login'),'renaldi24')

WebUI.setEncryptedText(findTestObject('Object Repository/Login page/Page_Sign in to GitHub  GitHub/input_Forgot password_password'),'EHsAiQV5jmK7vxxYDkz9uw==')

WebUI.click(findTestObject('Object Repository/Login page/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

//create new
WebUI.navigateToUrl('https://gist.github.com/')

WebUI.getWindowTitle() == 'https://gist.github.com/'

WebUI.setText(findTestObject('Object Repository/Create gist/Page_Create a new Gist/input_Instantly share code, notes, and snippets._gistdescription'), 'Test123')

WebUI.setText(findTestObject('Object Repository/Create gist/Page_Create a new Gist/input_Instantly share code, notes, and snippets._gistcontentsname'), 'Hanya Testing')

WebUI.setText(findTestObject('Object Repository/Create gist/Page_Create a new Gist/pre_'),'Hello World')

if(WebUI.verifyElementClickable(findTestObject('Object Repository/Create gist/Page_Create a new Gist/button_Create secret gist'),FailureHandling.OPTIONAL)){
	WebUI.click(findTestObject('Object Repository/Create gist/Page_Create a new Gist/summary_Create secret gist_btn btn-primary BtnGroup-item select-menu-button float-none'))
	
	WebUI.click(findTestObject('Object Repository/Create gist/Page_Create a new Gist/span_Create public gist'))
	
	WebUI.click(findTestObject('Object Repository/Create gist/Page_Create a new Gist/button_Create public gist'))
}
else{
	WebUI.click(findTestObject('Object Repository/Create gist/Page_Create a new Gist/button_Create public gist'))
}

//edit existing
WebUI.verifyElementText(findTestObject('Object Repository/Create gist/Page_Gist Summary/div_'), 'Test123')

WebUI.click(findTestObject('Object Repository/Create gist/Page_Gist Summary/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Create gist/Page_Editing Gist/input_Instantly share code, notes, and snippets._gistdescription'), 'Edited')

WebUI.setText(findTestObject('Object Repository/Create gist/Page_Editing Gist/input_Delete_gistcontentsname'), 'Edited nih')

WebUI.setText(findTestObject('Object Repository/Create gist/Page_Editing Gist/span_'), ' Edited')

WebUI.click(findTestObject('Object Repository/Create gist/Page_Editing Gist/button_Update public gist'))

//delete existing
WebUI.verifyElementText(findTestObject('Object Repository/Create gist/Page_Gist Summary/div_'), 'Edited')

WebUI.click(findTestObject('Object Repository/Create gist/Page_Gist Summary/button_Delete'))

WebUI.acceptAlert()

//view gist
WebUI.click(findTestObject('Object Repository/Create gist/Page_Gist Summary/img_Sign out_avatar avatar-user'))

WebUI.click(findTestObject('Object Repository/Create gist/Page_Gist Summary/a_Your gists'))

