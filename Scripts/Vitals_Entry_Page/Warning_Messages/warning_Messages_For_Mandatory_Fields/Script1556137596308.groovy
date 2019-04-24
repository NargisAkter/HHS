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
*/
WebUI.click(findTestObject('Object Repository/Vitals_Entry_Page/button_Confirm_Vitals_Entry_Page'))
//WebUI.delay(2)

//Warning messages for Temp field
tmpfoundwarnmsg=WebUI.getText(findTestObject('Object Repository/Warning_Messages_Vitals_entry_Page/temp_Warn_Msg_label'))
String tmpactualwarnmsg = tmpfoundwarnmsg.toString()
WebUI.verifyMatch(tmpactualwarnmsg, "Temperature is invalid or empty.",true, FailureHandling.CONTINUE_ON_FAILURE)
println('Temperature Warning message for empty value: ' + tmpactualwarnmsg)

//Warning messages for HR field
hrfoundwarnmsg=WebUI.getText(findTestObject('Object Repository/Warning_Messages_Vitals_entry_Page/hr_Warn_Msg_label'))
String hractualwarnmsg = hrfoundwarnmsg.toString()
WebUI.verifyMatch(hractualwarnmsg, "Heart Rate is invalid or empty.",true, FailureHandling.CONTINUE_ON_FAILURE)
println('HR Warning message for empty value: ' + hractualwarnmsg)

//Warning messages for Resp field
respfoundwarnmsg=WebUI.getText(findTestObject('Object Repository/Warning_Messages_Vitals_entry_Page/resp_Warn_Msg_label'))
String respactualwarnmsg = respfoundwarnmsg.toString()
WebUI.verifyMatch(respactualwarnmsg, "Respiratory Rate is invalid or empty.",true, FailureHandling.CONTINUE_ON_FAILURE)
println('Respiratory Warning message for empty value: ' + respactualwarnmsg)

//Warning messages for SpO2 field
spO2foundwarnmsg=WebUI.getText(findTestObject('Object Repository/Warning_Messages_Vitals_entry_Page/spO2_Warn_Msg_label'))
String spO2actualwarnmsg = spO2foundwarnmsg.toString()
WebUI.verifyMatch(spO2actualwarnmsg, "SpO2 is invalid or empty.",true, FailureHandling.CONTINUE_ON_FAILURE)
println('SpO2 Warning message for empty value: ' + spO2actualwarnmsg)

//Warning messages for O2 Therp field
o2foundwarnmsg=WebUI.getText(findTestObject('Object Repository/Warning_Messages_Vitals_entry_Page/o2_Therp_Warn_Msg_label'))
String o2actualwarnmsg = o2foundwarnmsg.toString()
WebUI.verifyMatch(o2actualwarnmsg, "O2 Therapy is a required field.",true, FailureHandling.CONTINUE_ON_FAILURE)
println('O2 Therp Warning message for empty value: ' + o2actualwarnmsg)

//Warning messages for BP field
bppfoundwarnmsg=WebUI.getText(findTestObject('Object Repository/Warning_Messages_Vitals_entry_Page/bp_Warn_Msg_label'))
String bpactualwarnmsg = bppfoundwarnmsg.toString()
WebUI.verifyMatch(bpactualwarnmsg, "Blood Pressure is invalid or empty.",true, FailureHandling.CONTINUE_ON_FAILURE)
println('BP Warning message for empty value: ' + bpactualwarnmsg)

//Warning messages for CAM field
camfoundwarnmsg=WebUI.getText(findTestObject('Object Repository/Warning_Messages_Vitals_entry_Page/cam_Warn_Msg_label'))
String camactualwarnmsg = camfoundwarnmsg.toString()
WebUI.verifyMatch(camactualwarnmsg, "CAM is a required field.",true, FailureHandling.CONTINUE_ON_FAILURE)
println('CAM Warning message for empty value: ' + camactualwarnmsg)

//Warning messages for AVPU field
avpufoundwarnmsg=WebUI.getText(findTestObject('Object Repository/Warning_Messages_Vitals_entry_Page/avpu_Warn_Msg_label'))
String avpuactualwarnmsg = avpufoundwarnmsg.toString()
WebUI.verifyMatch(avpuactualwarnmsg, "AVPU is a required field.",true, FailureHandling.CONTINUE_ON_FAILURE)
println('CAM Warning message for empty value: ' + avpuactualwarnmsg)

