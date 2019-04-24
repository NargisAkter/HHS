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

WebUI.click(findTestObject('Object Repository/Vitals_Entry_Page/button_Confirm_Vitals_Entry_Page'))*/
WebUI.delay(3)

foundo2therpscore=WebUI.getText(findTestObject('Object Repository/Hews_Score_Page/o2TherapyScore'))
String o2therpscore = foundo2therpscore.toString()
WebUI.verifyMatch(o2therpscore, "0",true, FailureHandling.CONTINUE_ON_FAILURE)
println('Contributing score for o2therp  value for no-room air : ' + o2therpscore)
WebUI.click(findTestObject('Object Repository/Hews_Score_Page/button_Back_HEWS_Score'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Vitals_Entry_Page/O2_Ther_Yes'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Vitals_Entry_Page/O2_Ther_Yes_FiO2'),'21')
WebUI.click(findTestObject('Object Repository/Vitals_Entry_Page/button_Confirm_Vitals_Entry_Page'))

foundo2therpscore=WebUI.getText(findTestObject('Object Repository/Hews_Score_Page/o2TherapyScore'))
String o2therpscore1 = foundo2therpscore.toString()
WebUI.verifyMatch(o2therpscore1, "1",true, FailureHandling.CONTINUE_ON_FAILURE)
println('Contributing score for FiO2  value for  21 : ' + o2therpscore1)

