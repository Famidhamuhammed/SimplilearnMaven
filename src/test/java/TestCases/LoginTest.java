package TestCases;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;

@Test
public class LoginTest extends BaseClass {
	public void test1() {
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("abc@xyz.com","Abc@1234");
		
		WebElement error = driver.findElement(By.id("msg_box"));
		
		String ActError = error.getText();
		String ExpError = "The email or password you have entered is invalid.";
		
		AssertJUnit.assertEquals(ActError, ExpError);
		
	}
	
	public void test2() {
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("pqr@xyz.com","Abc@1234");
		
	}

		@Test
		public void test4() throws FilloException {
			
			Recordset recordset = connection.executeQuery("select * from data where TestName='test4'");
			recordset.next();
				
			String UserName = recordset.getField("UserName");
			String Password = recordset.getField("Password");
			
			LoginPage login = new LoginPage(driver);
			login.LoginFunction(UserName, Password);

			
		}


		
	}


		
	

		
	

		
		

