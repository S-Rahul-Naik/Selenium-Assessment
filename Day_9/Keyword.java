package Assessment.Day_9;

public class Keyword {

	public static void main(String[] args) throws InterruptedException {
		SauceDemoExecutor ss = new SauceDemoExecutor();
		ss.executor("launch browser");
		ss.executor("open url");
		ss.executor("un");
		Thread.sleep(3000);
		ss.executor("pwd");
		Thread.sleep(3000);
		ss.executor("login");
		Thread.sleep(5000);
		ss.executor("close");

	}

}
