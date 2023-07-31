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

Mobile.tap(findTestObject('Happy Day Shoping/1- Flash Sale_Imageview'), 0)

Mobile.scrollToText('Frozen Collagen Serum')

Mobile.tap(findTestObject('Object Repository/Happy Day Shoping/5- Flash Sale_Frozen Collagen Serum'), 0)

Mobile.tap(findTestObject('Happy Day Shoping/1.2- Add to Bag_Button'), 0)

Mobile.tap(findTestObject('Happy Day Shoping/1.3- Menu_Button'), 0)

Mobile.tap(findTestObject('Object Repository/Happy Day Shoping/5.1- Perfume_Catalog'), 0)

Mobile.tap(findTestObject('Happy Day Shoping/5.2- Perfume_Products'), 0)

Mobile.setText(findTestObject('Happy Day Shoping/3.2- Input Quantity'), '3', 0)

Mobile.tap(findTestObject('Happy Day Shoping/1.2- Add to Bag_Button'), 0)

Mobile.tap(findTestObject('Object Repository/Happy Day Shoping/5.3- Cart_Imageview'), 0)

Mobile.tap(findTestObject('Object Repository/Happy Day Shoping/5.4- Checkout_Button'), 0)

Mobile.tap(findTestObject('Happy Day Shoping/5.5- Browser_Imageview'), 0)

Mobile.verifyElementVisible(findTestObject('Happy Day Shoping/5.6- Checkout_Assertion'), 0)

Mobile.closeApplication()

