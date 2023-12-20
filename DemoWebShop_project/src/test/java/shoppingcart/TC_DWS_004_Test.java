package shoppingcart;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tricentis.genericutility.BaseClass;

public class TC_DWS_004_Test extends BaseClass {
	@Test
	public void removeFromCart() {
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		String demo = driver.findElement(By.xpath("//div[@class='order-summary-content']")).getText();
		if(demo.equalsIgnoreCase("\r\n"
				+ "    \r\n"
				+ "    \r\n"
				+ "Your Shopping Cart is empty!    ")) {
			Reporter.log("Product removed from cart successfully",true);
		}
}
}
