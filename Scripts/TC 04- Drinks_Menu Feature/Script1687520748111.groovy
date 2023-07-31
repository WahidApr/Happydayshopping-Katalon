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

Mobile.tap(findTestObject('Object Repository/Happy Day Shoping/1.3- Menu_Button'), 0)

Mobile.tap(findTestObject('Object Repository/Happy Day Shoping/4- Drinks_Catalog'), 0)

Mobile.tap(findTestObject('Object Repository/Happy Day Shoping/4.1- Coffee Chocolate Powder_Product'), 0)

Mobile.scrollToText('San Miguel Sugar Free White 3in1 Coffee')

Mobile.tap(findTestObject('Happy Day Shoping/4.2- Menu_Checked Catalog'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Happy Day Shoping/4.3- Drinks_Assertion'), 0)

Mobile.closeApplication()

