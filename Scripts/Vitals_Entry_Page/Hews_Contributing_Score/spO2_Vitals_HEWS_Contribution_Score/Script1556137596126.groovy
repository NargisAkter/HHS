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

/*WebUI.callTestCase(findTestCase('Login/Login_as_bsnow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Vitals_Entry_Page/open_Vitals_Entry_Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Vitals_Entry_Page/valid_Value_Entering_All_Mandatory_Fields'), [:], FailureHandling.STOP_ON_FAILURE)
*/
def spo2validnumber = ['0','85','92','100']
int m=0;
while (m < spo2validnumber.size()){
	WebUI.clearText(findTestObject('Object Repository/Vitals_Entry_Page/SpO2_Input'))
	WebUI.setText(findTestObject('Object Repository/Vitals_Entry_Page/SpO2_Input'), "${spo2validnumber[m++]}")
WebUI.click(findTestObject('Object Repository/Vitals_Entry_Page/button_Confirm_Vitals_Entry_Page'))
WebUI.delay(3)
foundspo2score=WebUI.getText(findTestObject('Object Repository/Hews_Score_Page/spO2Score'))
String spo2score = foundspo2score.toString()
if(m==1)
{
	WebUI.verifyMatch(spo2score, "3",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for sp02 value 0 : ' + spo2score)
}

if(m==2)
{
	WebUI.verifyMatch(spo2score, "1",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for spo2 value 85 : ' + spo2score)
}
if(m==3)
{
	WebUI.verifyMatch(spo2score, "1",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for spo2 value 92 : ' + spo2score)
}
if(m==4)
{
	WebUI.verifyMatch(spo2score, "0",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for spo2 value 100 : ' + spo2score)
}

WebUI.click(findTestObject('Object Repository/Hews_Score_Page/button_Back_HEWS_Score'))
//WebUI.waitForElementPresent(findTestObject('Object Repository/Vitals_Entry_Page/tempInput'))
WebUI.delay(3)
}
WebUI.click(findTestObject('Object Repository/Vitals_Entry_Page/button_Close_Vitals_Entry_Page'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Patient Searching/button_Cancel_Patient_Search'))
WebUI.delay(4)
