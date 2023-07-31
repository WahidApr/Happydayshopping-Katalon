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

Mobile.tap(findTestObject('Object Repository/Happy Day Shoping/6- Search_Imageview'), 0)

Mobile.setText(findTestObject('Object Repository/Happy Day Shoping/6.1- Search_Input Products'), 'Drinks\\\\n', 0)

Mobile.scrollToText('Sprite 330ml')

Mobile.tap(findTestObject('Object Repository/Happy Day Shoping/6.2- Menu_Button'), 0)

Mobile.tap(findTestObject('Object Repository/Happy Day Shoping/6.3- Covid Essentials_Catalog'), 0)

Mobile.tap(findTestObject('Happy Day Shoping/6.4- Search_item'), 0)

Mobile.setText(findTestObject('Object Repository/Happy Day Shoping/6.5-Search_Input'), 'Flash Sale\\\\n', 0)

Mobile.tap(findTestObject('Object Repository/Happy Day Shoping/6.6- Back_Button'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Happy Day Shoping/6.7- Flash Sale_Item'), 0)

Mobile.tap(findTestObject('Happy Day Shoping/6.4- Search_item'), 0)

Mobile.setText(findTestObject('Object Repository/Happy Day Shoping/6.8- Search_Input Flash Sale'), 'Merry Sun\\\\n', 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Happy Day Shoping/6.9- Search_Assertion'), 
    0)

Mobile.closeApplication()

