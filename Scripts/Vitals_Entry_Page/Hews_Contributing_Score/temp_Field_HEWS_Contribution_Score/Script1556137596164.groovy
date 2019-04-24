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
def tempvalidnumber = ['30','35','36.9',,'38.9','45']
int j=0;
while (j < tempvalidnumber.size()){
	WebUI.clearText(findTestObject('Object Repository/Vitals_Entry_Page/tempInput'))
	WebUI.setText(findTestObject('Object Repository/Vitals_Entry_Page/tempInput'), "${tempvalidnumber[j++]}")
WebUI.click(findTestObject('Object Repository/Vitals_Entry_Page/button_Confirm_Vitals_Entry_Page'))
WebUI.delay(3)
tempscore=WebUI.getText(findTestObject('Object Repository/Hews_Score_Page/tempScore'))
String tmpscore = tempscore.toString()
if(j==1)
{
	WebUI.verifyMatch(tmpscore, "3",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for temp value 30 : ' + tmpscore)
}

if(j==2)
{
	WebUI.verifyMatch(tmpscore, "3",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for temp value 35 : ' + tmpscore)
}
if(j==3)
{
	WebUI.verifyMatch(tmpscore, "0",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for temp value 36.9 : ' + tmpscore)
}
if(j==4)
{
	WebUI.verifyMatch(tmpscore, "1",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for temp value 38.9 : ' + tmpscore)
}
if(j==5)
{
	WebUI.verifyMatch(tmpscore, "2",true, FailureHandling.CONTINUE_ON_FAILURE)
	println('Contributing score for temp value 45 : ' + tmpscore)
}
WebUI.click(findTestObject('Object Repository/Hews_Score_Page/button_Back_HEWS_Score'))
//WebUI.waitForElementPresent(findTestObject('Object Repository/Vitals_Entry_Page/tempInput'))
WebUI.delay(3)
}
/*WebUI.click(findTestObject('Object Repository/Vitals_Entry_Page/button_Close_Vitals_Entry_Page'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Patient Searching/button_Cancel_Patient_Search'))
WebUI.delay(4)
*/
