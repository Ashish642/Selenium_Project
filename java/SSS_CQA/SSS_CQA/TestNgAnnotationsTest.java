package SSS_CQA.SSS_CQA;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgAnnotationsTest {
	@Test
	public void test() {
		Reporter.log("testMethod", true);

	}
	@BeforeMethod

	public void beforeMethod() {

		Reporter.log("beforeMethod", true);

	}
	@AfterMethod

	public void afterMethod() {

		Reporter.log("afterMethod", true);

	}

	@BeforeClass

	public void beforeClass() {

		Reporter.log("beforeClass", true);

	}

	@AfterClass

	public void afterClass() {

		Reporter.log("afterClass", true);

	}
	@BeforeTest

	public void beforeTest() {

		Reporter.log("beforeTest", true);

	}

	@AfterTest

	public void afterTest() {

		Reporter.log("afterTest", true);

	}
	@BeforeSuite

	public void beforeSuite() {

		Reporter.log("beforeSuite", true);
	}
	@AfterSuite

	public void afterSuite() {

		Reporter.log("afterSuite", true);

	}
	//	InvocationCount Attribute:

	@Test(invocationCount=4)

	public void editUser(){

		System.out.println("editUser...");

	}
	//	skip a test method from execution without using invocationCOunt

	@Test(invocationCount=4, enabled=false)

	public void edittUser(){

		System.out.println("editUser...");

	}

	//	Using dependsOnMethods attribute of Test annotation.
	@Test(priority=1)

	public void createUser(){

		System.out.println("createUser...user created successufuly");

		Assert.fail();

	}
	@Test(priority=3, dependsOnMethods="createUser")

	public void deleteUser(){

		System.out.println("deleteUser...");

	}
	//	When two test methods are dependent on each other, it results in to Testng
	@Test(priority=1, dependsOnMethods="deleteUser")

	public void createUserq(){

		System.out.println("createUser...user created successufuly");

	}


	@Test(priority=3, dependsOnMethods="createUser")

	public void deleteUserq(){

		System.out.println("deleteUser...");
	}
	//	Example

	@Test(priority=1, groups={"user", "smoke"})
	public void CreateUser(){
		Reporter.log("CreateUser", true);
	}

	@Test(priority=2, invocationCount=1, enabled=true, groups={"user"})
	public void editUserw(){
		Reporter.log("editUser", true);
	}
	@Test(priority=3, groups={"user"})
	public void deleteUserw(){
		Reporter.log("deleteUser", true);
	}
	@Test(priority=1, groups={"product", "smoke"})
	public void createProduct(){
		Reporter.log("createProduct", true);
	}
	@Test(priority=2, invocationCount=1, enabled=true, groups={"product"})
	public void editProduct(){
		Reporter.log("editProduct", true);
	}
	@Test(priority=3, groups={"product"})
	public void deleteProduct(){
		Reporter.log("deleteProduct", true);
	}

	//	Parameterisation using @DataProvider
	@DataProvider

	public Object[][] dataBank(){

		Object[][] data = new Object[2][2];

		data[0][0] = "admin1";

		data[0][1] = "manager1";

		data[1][0] = "admin2";

		data[1][1] = "manager2";

		return data;
	}
	@Test(dataProvider="dataBank")
	public void useDataBank(String un, String pwd){

		Reporter.log(un + "--->"+ pwd, true);

	}



	//		------------------------------




}













