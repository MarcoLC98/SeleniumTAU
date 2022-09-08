package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {
	@Test
	public void testNavigator() {
		homePage.clickDinamycLoading().clickExample1();
		getWindowManager().goBack();
		getWindowManager().refreshPage();
		getWindowManager().goForward();
		getWindowManager().goTo("google.com");
	}
	@Test
	public void testSwitch_tab (){
		homePage.clickMultipleWindows().clickHere();
		getWindowManager().switchToTab("New Window");
	}
}
	
