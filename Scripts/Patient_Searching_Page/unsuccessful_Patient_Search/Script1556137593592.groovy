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


WebUI.click(findTestObject('Object Repository/Homepage/vitalsButton'))

//WebUI.waitForElementPresent(findTestObject('Object Repository/accepting_notification/Page_ThoughtWire - Digital Hospital - HHS HEWS - Notifier/button_Record Vitals'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Patient Searching/button_Record Vitals'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Patient Searching/button_Confirm_Patient_Search'), 10)

// verify confim button disabled upon opening on patient searching form
confirmbuttonattribute = WebUI.getAttribute(findTestObject('Object Repository/Patient Searching/button_Confirm_Patient_Search'), 
    'class')

println(confirmbuttonattribute)

WebUI.verifyMatch(confirmbuttonattribute, 'twDisabledInput', true, FailureHandling.CONTINUE_ON_FAILURE)

//verify patient not found on without entering any text at account number text box
WebUI.click(findTestObject('Object Repository/Patient Searching/button_Ok_Patient_Search'))

WebUI.delay(2)

patientnotfoundmsg = WebUI.getText(findTestObject('Object Repository/Patient Searching/patient_not_exists_message'))

println(patientnotfoundmsg)

WebUI.verifyMatch(patientnotfoundmsg, 'Could not find patient.', true, FailureHandling.CONTINUE_ON_FAILURE)

//verify patient not found with a space only
WebUI.sendKeys(findTestObject('Object Repository/Patient Searching/accountNumberTextBox'), ' ')

WebUI.click(findTestObject('Object Repository/Patient Searching/button_Ok_Patient_Search'))

WebUI.delay(2)

patientnotfoundmsg = WebUI.getText(findTestObject('Object Repository/Patient Searching/patient_not_exists_message'))

println(patientnotfoundmsg)

WebUI.verifyMatch(patientnotfoundmsg, 'Could not find patient.', true, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Patient_Searching_Page/successful_Patient_Search'), [:], FailureHandling.STOP_ON_FAILURE)

