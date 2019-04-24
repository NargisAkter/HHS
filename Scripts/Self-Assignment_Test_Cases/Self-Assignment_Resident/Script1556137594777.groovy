import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login/login_as_twire404'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Homepage/vitalsButton'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Self_Assignment/open_self_Assignment_Form_Button'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Self_Assignment/button_Clear all'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Self_Assignment/select_Role'), 5)

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Self_Assignment/select_Unit'), 1)

WebUI.delay(4)

WebUI.selectOptionByValue(findTestObject('Object Repository/Self_Assignment/select_Physicians_Res'), 'http://hl7.org/fhir/practitioner/twire107', 
    true)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Self_Assignment/button_Add_Selected_Assignment'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Self_Assignment/button_Save_Assignment'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Self_Assignment/button_Assignment_Icon'))

attribute = WebUI.getAttribute(findTestObject('Object Repository/Self_Assignment/button_Assignment_Icon'), 'class')

WebUI.verifyMatch(attribute, 'userIcon Resident twSelectedDiv', true)

println(attribute)

println('Resident self-assigned successfully')

WebUI.closeBrowser()

