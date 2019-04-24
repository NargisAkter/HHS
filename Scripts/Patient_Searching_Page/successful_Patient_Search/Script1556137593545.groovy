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
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import groovy.sql.Sql;

/*WebUI.openBrowser('')

WebUI.navigateToUrl('https://as.mtl.twamb.ca/agent-server/launch?uri=http://thoughtwire.ca/ont/sln/nm/hhs')

WebUI.setText(findTestObject('Object Repository/accepting_notification/Page_Welcome to ThoughtWire Ambiant/input_User name_username'), 
    'sbelle')

WebUI.setEncryptedText(findTestObject('Object Repository/accepting_notification/Page_Welcome to ThoughtWire Ambiant/input_Password_password'), 
    'WfhbnYCDenevwEefKBoKjA==')

WebUI.click(findTestObject('Object Repository/accepting_notification/Page_Welcome to ThoughtWire Ambiant/input_Password_twLogin_button'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Homepage/vitalsButton'),30)

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
*/

//verify patient found successfully
WebUI.clearText(findTestObject('Object Repository/Patient Searching/accountNumberTextBox'))

WebUI.setText(findTestObject('Object Repository/Patient Searching/accountNumberTextBox'), 'a02')

WebUI.click(findTestObject('Object Repository/Patient Searching/button_Ok_Patient_Search'))

WebUI.delay(3)

pntMRNPntSrchPg = WebUI.getText(findTestObject('Object Repository/Patient Searching/patient_MRN_label'))
patientNamePntSrchPg=WebUI.getText(findTestObject('Object Repository/Patient Searching/patient_Name_label'))

println('Name and MRN of Patient for account number a02:' + patientNamePntSrchPg  +pntMRNPntSrchPg)

/*//DB checking for patient account number a02
CustomKeywords.'com.thoughtwire.DBConnection.sql3DemoConnection.connectDB'('//sql3.demo.thoughtwire.com.test:1433;dataBaseName=HHSTest_MTL1', 
    'sa', 'Fr33w0rld')

def mrnindb=CustomKeywords.'com.thoughtwire.DBConnection.sql3DemoConnection.executeQuery'('select MRN from patients where accountnumber=\'a02\';')
println('mrn in db' + mrnindb)
//WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/a02_MRN_DB_Check'), true)

CustomKeywords.'com.thoughtwire.DBConnection.sql3DemoConnection.closeDatabaseConnection'()

WebUI.click(findTestObject('Object Repository/Patient Searching/button_Confirm_Patient_Search'))
WebUI.delay(3)
//patientnamefora02=WebUI.getAttribute(findTestObject('Object Repository/accepting_notification/Page_ThoughtWire - Digital Hospital - HHS HEWS - Notifier/patientName_Vitals_Page'),'textContent')
patientNameVitalPg=WebUI.getText(findTestObject('Object Repository/accepting_notification/Page_ThoughtWire - Digital Hospital - HHS HEWS - Notifier/patientName_Vitals_Page'))

println('patient name in vitals page ' + patientNameVitalPg)
WebUI.verifyMatch(patientNamePntSrchPg,patientNameVitalPg,true,FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/accepting_notification/Page_ThoughtWire - Digital Hospital - HHS HEWS - Notifier/button_Close_Vitals_Entry_Page'))
WebUI.waitForElementPresent(findTestObject('Object Repository/Patient Searching/button_Confirm_Patient_Search'),3)
confirmbuttonattribute = WebUI.getAttribute(findTestObject('Object Repository/Patient Searching/button_Confirm_Patient_Search'),
	'class')

println(confirmbuttonattribute)

WebUI.verifyMatch(confirmbuttonattribute, 'twDisabledInput', true, FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.closeBrowser()
*/
