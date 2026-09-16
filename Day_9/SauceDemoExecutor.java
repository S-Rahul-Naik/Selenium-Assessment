package Assessment.Day_9;

import keyword_datadriven.saucedemoKDT;

public class SauceDemoExecutor {

	SauceDemoImplementation s = new SauceDemoImplementation();
	public void executor(String str) throws InterruptedException {
		if(str.equalsIgnoreCase("LAUNCH BROWSER")) {
			s.launchBrowser();
		}else if(str.equalsIgnoreCase("open url")) {
			s.open_Url();
		}else if(str.equalsIgnoreCase("un")) {
			s.un();
		}else if(str.equalsIgnoreCase("PWD")) {
			s.pwd();
		}else if(str.equalsIgnoreCase("login")) {
			s.login();
		}
		else {
			s.close_browser();
		}
		
	}

}
