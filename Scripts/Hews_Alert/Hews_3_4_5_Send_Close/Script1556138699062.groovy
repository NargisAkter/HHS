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
WebUI.callTestCase(findTestCase('Login/Login_as_twire402'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

def accountnumber = ['a02', 'a03', 'a04']

def i = 0

while (i < accountnumber.size()) {
    WebUI.click(findTestObject('Object Repository/Homepage/vitalsButton'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Patient Searching/button_Record Vitals'))

    WebUI.delay(4)

    //WebUI.waitForElementPresent(findTestObject('Object Repository/Patient Searching/accountNumberTextBox'),5)
    WebUI.setText(findTestObject('Object Repository/Patient Searching/accountNumberTextBox'), "${accountnumber[(i++)]}")

    WebUI.click(findTestObject('Object Repository/Patient Searching/button_Ok_Patient_Search'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Patient Searching/button_Confirm_Patient_Search'))

    WebUI.delay(4)

    WebUI.setText(findTestObject('Object Repository/Vitals_Entry_Page/tempInput'), '37')

    WebUI.setText(findTestObject('Object Repository/Vitals_Entry_Page/hrInput'), '100')

    WebUI.setText(findTestObject('Object Repository/Vitals_Entry_Page/respInput'), '11')

    WebUI.setText(findTestObject('Object Repository/Vitals_Entry_Page/SpO2_Input'), '90')

    WebUI.click(findTestObject('Object Repository/Vitals_Entry_Page/No - Room Air'))

    WebUI.setText(findTestObject('Object Repository/Vitals_Entry_Page/bpSysInput'), '100')

    WebUI.setText(findTestObject('Object Repository/Vitals_Entry_Page/bpDiaInput'), '70')

    WebUI.click(findTestObject('Object Repository/Vitals_Entry_Page/cam_Input_No'))

    if (i == 1) {
        WebUI.selectOptionByValue(findTestObject('Object Repository/Vitals_Entry_Page/select_AVPU'), 'A', true)
    }
    
    if (i == 2) {
        WebUI.selectOptionByValue(findTestObject('Object Repository/Vitals_Entry_Page/select_AVPU'), 'V', true)
    }
    
    if (i == 3) {
        WebUI.selectOptionByValue(findTestObject('Object Repository/Vitals_Entry_Page/select_AVPU'), 'P', true)
    }
    
    /*  if (i == 4) {
        WebUI.selectOptionByValue(findTestObject('Object Repository/Vitals_Entry_Page/select_AVPU'), 'U', true)
    }
    */
    WebUI.click(findTestObject('Object Repository/Vitals_Entry_Page/button_Confirm_Vitals_Entry_Page'))

    WebUI.delay(4)

    //WebUI.waitForElementPresent(findTestObject('Object Repository/Hews_Score_Page/button_Confirm_Hews_Score_Page'),4)
    WebUI.click(findTestObject('Object Repository/Hews_Score_Page/button_Confirm_Hews_Score_Page'))

    //WebUI.verifyCheckpoint(findCheckpoint(DBCheckpoint),true)
    WebUI.delay(30)

    WebUI.click(findTestObject('Object Repository/Meditech_Page/button_Ok_For_Meditech'))

    //WebUI.delay(3)
    WebUI.waitForElementPresent(findTestObject('Object Repository/Homepage/button_Notification_Icon'), 4)

    WebUI.click(findTestObject('Object Repository/Homepage/button_Notification_Icon'))

    WebUI.delay(2)

    WebUI.scrollToElement(findTestObject('Object Repository/Notification_Page/button_Ok_Acknowledge'), 2)

    WebUI.click(findTestObject('Object Repository/Notification_Page/button_Ok_Acknowledge'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Notification_Page/button_Close_Event_After_Acknowledge'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Notification_Page/button_Clear_Remove_Ackowledge_Notification'))

    println('Hews Score 3_4_5 closed by Cnurse successfully')

    WebUI.delay(2)

    println('Hews Score 3/4/5 closed by Cnurse')
}

WebUI.closeBrowser()

