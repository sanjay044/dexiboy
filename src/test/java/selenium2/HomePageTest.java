package selenium2;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import org.testng.Assert;
	import org.testng.annotations.Test;

import selenium.BasePage;
import selenium.HomePage;
	
	public class HomePageTest {

		HomePage HomePage;
		BasePage bp;

		public HomePageTest() {
			HomePage = new HomePage();               
			bp = new BasePage();
		}

		@Test
		public void verifydressesText() {
			Assert.assertTrue(bp.elementFound(HomePage.getdressesFromPanel()));
			
		}
		@Test
		public void verifytshirtsText() {
			Assert.assertTrue (bp.elementFound(HomePage.gettshirtsFromPanel()));
		}

		@Test
		public void verifywomenText() {
			Assert.assertTrue(bp.elementFound(HomePage.getwomenFromPanel()));
		}
		 @Test
		public void verifycasualdresses () {
			 HomePage.clickDress();
			 HomePage.clickdress1();
			Assert.assertTrue (bp.elementFound(HomePage.getcasualdresses()));
		
		}
	}
 