package Assessment.Final_Assessment.Assessment_2;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestCase extends BaseClass {
	@Test
	public void TestCase1() throws InterruptedException {
		HomePagePom h = new HomePagePom(driver);
		h.getBuzzlink();
		BuzzPom b = new BuzzPom(driver);
		b.getTextarea();
		b.getPost();
		System.out.println(b.getPname());
		b.getRecentpost();
		Thread.sleep(10000);
		Boolean t = b.profileMsg(b.getPname(), "Hi Buddiess");
		
		
		Assert.assertTrue(t);
	}
}
