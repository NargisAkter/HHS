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

//WebUI.callTestCase(findTestCase('Login/Login_as_bsnow'), [:], FailureHandling.STOP_ON_FAILURE)

//Verify without entering any text into account number field Cancel button working
WebUI.click(findTestObject('Object Repository/Homepage/vitalsButton'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Patient Searching/button_Record Vitals'))
WebUI.waitForElementPresent(findTestObject('Object Repository/Patient Searching/accountNumberTextBox'),5)
WebUI.click(findTestObject('Object Repository/Patient Searching/button_Cancel_Patient_Search'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/vitalsButton'),5, FailureHandling.STOP_ON_FAILURE)
//Verify Cancel button working after a patient searching
WebUI.click(findTestObject('Object Repository/Homepage/vitalsButton'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Patient Searching/button_Record Vitals'))
//WebUI.delay(3)
WebUI.waitForElementPresent(findTestObject('Object Repository/Patient Searching/accountNumberTextBox'),5)
WebUI.setText(findTestObject('Object Repository/Patient Searching/accountNumberTextBox'), 'a03')

WebUI.click(findTestObject('Object Repository/Patient Searching/button_Ok_Patient_Search'))

WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Patient Searching/button_Cancel_Patient_Search'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Homepage/vitalsButton'),5, FailureHandling.STOP_ON_FAILURE)

//Verify cancel button is working after returning from vitals entry page

WebUI.click(findTestObject('Object Repository/Homepage/vitalsButton'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Patient Searching/button_Record Vitals'))
WebUI.waitForElementPresent(findTestObject('Object Repository/Patient Searching/accountNumberTextBox'),5)
WebUI.setText(findTestObject('Object Repository/Patient Searching/accountNumberTextBox'), 'a04')

WebUI.click(findTestObject('Object Repository/Patient Searching/button_Ok_Patient_Search'))

WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Patient Searching/button_Confirm_Patient_Search'))
WebUI.waitForElementPresent(findTestObject('Object Repository/Vitals_Entry_Page/button_Close_Vitals_Entry_Page'),5)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Vitals_Entry_Page/button_Close_Vitals_Entry_Page'))
WebUI.delay(4)
WebUI.click(findTestObject('Object Repository/Patient Searching/button_Cancel_Patient_Search'))
WebUI.delay(3)



