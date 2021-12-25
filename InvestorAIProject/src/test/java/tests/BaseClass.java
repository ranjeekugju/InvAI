package tests;

import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class BaseClass {
	
//	AppiumDriver<MobileElement> driver;
	AndroidDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() {
		
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			
			caps.setCapability("automationName", "UiAutomator1");
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Rans");
			caps.setCapability(MobileCapabilityType.UDID, "43e7b51d");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
//			caps.setCapability(MobileCapabilityType.APP, "ANDROID");
//			caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
			caps.setCapability("appPackage", "com.bridgeweave.investorai");
			caps.setCapability("appActivity", "investorai.features.splash.ui.SplashHostActivity");
			caps.setCapability("unicodeKeyboard", "true");                                     
			caps.setCapability("resetKeyboard", "true");
//			com.example.aiolosinsub.view.acitivity.CreateAccountActivity
//			investorai.feature.account.AccountActivity
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			
//			driver = new AppiumDriver<MobileElement>(url,caps);
			driver = new AndroidDriver<MobileElement>(url,caps);
			
			Thread.sleep(15000);
			MobileElement email = driver.findElement(By.id("com.bridgeweave.investorai:id/etEmailId"));
//			MobileElement pin = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout"));
			MobileElement pin1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.TextView"));
			MobileElement pin2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TextView"));
			MobileElement pin3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.TextView"));
			MobileElement pin4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.TextView"));
			MobileElement pin5 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[5]/android.widget.TextView"));
			MobileElement pin6 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[6]/android.widget.TextView"));
			MobileElement loginBtn = driver.findElement(By.id("com.bridgeweave.investorai:id/tvSignNext"));
			
			email.clear();
			email.sendKeys("ranjeeku4u@gmail.com");
			
			Thread.sleep(8000);
			
//			adb shell input text 0000;
			pin1.click();
			driver.pressKey(new KeyEvent(AndroidKey.DIGIT_5));
			
//			String cmd5 = "adb shell input keyevent 5";
//			Runtime.getRuntime().exec(cmd5);
			Thread.sleep(2000);
			
			pin2.click();
			driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
//			String cmd0 = "adb shell input keyevent 0";
//			Runtime.getRuntime().exec(cmd0);
			Thread.sleep(2000);
			
			pin3.click();
			driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2));
			Thread.sleep(2000);
			
			pin4.click();
			driver.pressKey(new KeyEvent(AndroidKey.DIGIT_8));
			Thread.sleep(2000);
			
			pin5.click();
			driver.pressKey(new KeyEvent(AndroidKey.DIGIT_5));
			Thread.sleep(2000);
			
			pin6.click();
			driver.pressKey(new KeyEvent(AndroidKey.DIGIT_0));
			Thread.sleep(2000);
			
//			pin1.sendKeys("5");
//			Thread.sleep(5000);
//			pin1.sendKeys("\n");
////			driver.pressKeyCode(AndroidKeyCode.ENTER);
//			
//			pin2.sendKeys("0");
//			Thread.sleep(2000);
//			pin3.sendKeys("2");
//			Thread.sleep(2000);
//			pin4.sendKeys("8");
//			Thread.sleep(2000);
//			pin5.sendKeys("5");
//			Thread.sleep(2000);
//			pin6.sendKeys("0");
//			Thread.sleep(2000);
//			pin1.sendKeys("\n");
			
			loginBtn.click();
			Thread.sleep(10000);
			
			String lastActivityName = driver.currentActivity();
			System.out.println("lastActivityName");
			
			MobileElement loginNextBtn = driver.findElement(By.id("com.bridgeweave.investorai:id/layout_SignIn"));
//			com.bridgeweave.investorai:id/layout_SignIn
			
		//	com.bridgeweave.investorai:id/nextWelcome
			loginNextBtn.click();
			
			
//			MobileElement dontShowAgain = driver.findElement(By.id("com.bridgeweave.investorai:id/switchCompact"));
//			if (dontShowAgain.isDisplayed()){
//				dontShowAgain.click();
//				System.out.println("Welcome page disabled");
//			}
//			else {
//				System.out.println("No Welcome page");
//			}
			
		
			MobileElement skipBtn = driver.findElement(By.id("com.bridgeweave.investorai:id/skip"));
			skipBtn.click();
			
			
			MobileElement companyNameTextbx = driver.findElement(By.id("com.bridgeweave.investorai:id/etCompanyName"));
			companyNameTextbx.sendKeys("Apple");	
//			/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/androidx.cardview.widget.CardView/android.view.ViewGroup
			
			MobileElement firstElement = driver.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/androidx.cardview.widget.CardView/android.view.ViewGroup"));
			firstElement.click();
			
//			/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button
			
//			MobileElement goBtn = driver.findElement(By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button"));
//			firstElement.click();
			
			
//SerachImage			/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.ImageView
			
// home		com.bridgeweave.investorai:id/imgHome1	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView[1]
					
//					com.bridgeweave.investorai:id/imgPortfolio   com.bridgeweave.investorai:id/LiPortfolio
//			com.bridgeweave.investorai:id/LiWatchlist
//			com.bridgeweave.investorai:id/LiIdeas
//			com.bridgeweave.investorai:id/LiPlay
//			com.bridgeweave.investorai:id/LiForum
//			com.bridgeweave.investorai:id/LiHome
			
// bell notification			com.bridgeweave.investorai:id/appCompatImageView
// menu bar			com.bridgeweave.investorai:id/ivMenu
			
			Thread.sleep(3000);
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("cause is : "+e.getCause());
			System.out.println("message is : "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void sampleTest() { 
		System.out.println("I am in Test");
	}
		
	
	@AfterTest
	public void teardown () {
		
	}

}
