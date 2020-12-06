import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8282/confia/exte/')

WebUI.click(findTestObject('Titular/a_Firmas Externas'))

WebUI.click(findTestObject('Titular/a_Gestin de Titulares'))

WebUI.click(findTestObject('Titular/span_Nuevo'))

WebUI.click(findTestObject('Titular/input_Nombres_frmNewidNombre'))

WebUI.setText(findTestObject('Titular/input_Nombres_frmNewidNombre'), 'oscar')

WebUI.click(findTestObject('Titular/input_Primer Ap._frmNewidPrimero'))

WebUI.setText(findTestObject('Titular/input_Primer Ap._frmNewidPrimero'), 'oscar')

WebUI.click(findTestObject('Titular/input_Segundo Ap._frmNewidSegundo'))

WebUI.click(findTestObject('Titular/input_Ap. Casada_frmNewj_idt450'))

WebUI.click(findTestObject('Titular/span_Seleccionar..._ui-icon ui-icon-triangl_d1b480'))

WebUI.click(findTestObject('Titular/li_CEDULA DE IDENTIDAD'))

WebUI.setText(findTestObject('Titular/input_Nro.Doc._frmNewidNro'), '1234')

WebUI.click(findTestObject('Titular/input_Complemento_frmNewidCompl'))

WebUI.click(findTestObject('Titular/label_Seleccionar'))

WebUI.click(findTestObject('Titular/li_LA PAZ'))

WebUI.click(findTestObject('Titular/span_Guardar'))

WebUI.click(findTestObject('Titular/td_8'))

WebUI.closeBrowser()

