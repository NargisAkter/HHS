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
def hrvalidnumber = ['0','40','50','100','101','130','300']
int k=0;
while (k < hrvalidnumber.size()){
WebUI.clearText(findTestObject('Object Repository/Vitals_Entry_Page/hrInput'))
WebUI.setText(findTestObject('Object Repository/Vitals_Entry_Page/hrInput'),"${hrvalidnumber[k++]}")
WebUI.click(findTestObject('Object Repository/Vitals_Entry_Page/button_Confirm_Vitals_Entry_Page'))
WebUI.delay(3)
foundhrscore=WebUI.getText(findTestObject('Object Repository/Hews_Score_Page/hrScore'))
String hrscore = foundhrscore.toString()
if(k==1)
{
	WebUI.verifyMatch(hrscore, "2",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for hr value 0 : ' + hrscore)
}

if(k==2)
{
	WebUI.verifyMatch(hrscore, "2",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for hr value 40 : ' + hrscore)
}
if(k==3)
{
	WebUI.verifyMatch(hrscore, "1",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for hr value 50 : ' + hrscore)
}
if(k==4)
{
	WebUI.verifyMatch(hrscore, "0",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for hr value 100 : ' + hrscore)
}
if(k==5)
{
	WebUI.verifyMatch(hrscore, "1",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for hr value 101 : ' + hrscore)
}
if(k==6)
{
	WebUI.verifyMatch(hrscore, "2",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for hr value 130 : ' + hrscore)
}
if(k==7)
{
	WebUI.verifyMatch(hrscore, "3",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for hr value 300 : ' + hrscore)
}
WebUI.click(findTestObject('Object Repository/Hews_Score_Page/button_Back_HEWS_Score'))
//WebUI.waitForElementPresent(findTestObject('Object Repository/Vitals_Entry_Page/tempInput'))
WebUI.delay(3)
}
WebUI.click(findTestObject('Object Repository/Vitals_Entry_Page/button_Close_Vitals_Entry_Page'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Patient Searching/button_Cancel_Patient_Search'))
WebUI.delay(4)
