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

Mobile.startExistingApplication('com.ecwid.ShopAt.HappyDayShopping')

Mobile.tap(findTestObject('Object Repository/Happy Day Shoping/3- Bread and Bakery_Imageview'), 0)

Mobile.scrollToText('Tres Marias Polvoron')

Mobile.tap(findTestObject('Object Repository/Happy Day Shoping/3.1- Bread and Bakery_Product'), 0)

Mobile.tap(findTestObject('Happy Day Shoping/1.2- Add to Bag_Button'), 0)

Mobile.setText(findTestObject('Object Repository/Happy Day Shoping/3.2- Input Quantity'), '3', 0)

Mobile.tap(findTestObject('Object Repository/Happy Day Shoping/3.3- Add More_Button'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Happy Day Shoping/1.3- Menu_Button'), 0)

Mobile.tap(findTestObject('Object Repository/Happy Day Shoping/3.4- Bread Bakery_Catalog'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Happy Day Shoping/3.5- Bread Bakery_Assertion'), 0)

Mobile.closeApplication()

