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

WebUI.callTestCase(findTestCase('Login/Login_as_bsnow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Vitals_Entry_Page/open_Vitals_Entry_Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Vitals_Entry_Page/valid_Value_Entering_All_Mandatory_Fields'), [:], FailureHandling.STOP_ON_FAILURE)

def respvalidnumber = ['0','8','20','30','60']
int l=0;
while (l < respvalidnumber.size()){
	WebUI.clearText(findTestObject('Object Repository/Vitals_Entry_Page/respInput'))
	WebUI.setText(findTestObject('Object Repository/Vitals_Entry_Page/respInput'), "${respvalidnumber[l++]}")
WebUI.click(findTestObject('Object Repository/Vitals_Entry_Page/button_Confirm_Vitals_Entry_Page'))
WebUI.delay(3)
foundrespscore=WebUI.getText(findTestObject('Object Repository/Hews_Score_Page/respScore'))
String respscore = foundrespscore.toString()
if(l==1)
{
	WebUI.verifyMatch(respscore, "3",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for resp value 0 : ' + respscore)
}

if(l==2)
{
	WebUI.verifyMatch(respscore, "2",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for resp value 8 : ' + respscore)
}
if(l==3)
{
	WebUI.verifyMatch(respscore, "0",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for resp value 20 : ' + respscore)
}
if(l==4)
{
	WebUI.verifyMatch(respscore, "2",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for resp value 30 : ' + respscore)
}
if(l==5)
{
	WebUI.verifyMatch(respscore, "3",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for resp value 60 : ' + respscore)
}
WebUI.click(findTestObject('Object Repository/Hews_Score_Page/button_Back_HEWS_Score'))
//WebUI.waitForElementPresent(findTestObject('Object Repository/Vitals_Entry_Page/tempInput'))
WebUI.delay(3)
}
WebUI.click(findTestObject('Object Repository/Vitals_Entry_Page/button_Close_Vitals_Entry_Page'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Patient Searching/button_Cancel_Patient_Search'))
WebUI.delay(4)
