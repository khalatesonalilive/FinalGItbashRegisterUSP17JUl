package Steps;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsSnippet extends BaseClass {

	public static RegisterPage registerPage;
	

	@Given("user open {string} browser")
	public void user_open_browser(String browserName) {

		BaseClass.initialization(browserName);
		
			}

	@When("user enter valid {string}, {string},{string},{string},{string} and {string}")
	public void user_enter_valid_and(String fname, String lname, String gender, String emailid, String password,
			String cpassword) {

		 registerPage=new RegisterPage();
		 registerPage.personalInfoFunctionality(fname, lname, gender, emailid, password, cpassword);
	}

	@Given("user enter valid {string}, {string}")
	public void user_enter_valid(String companyname, String Jobtitle) {

		registerPage.companyAndOrgInfo(companyname, Jobtitle);
	}

	@Given("user enter the valid streetaddress,city,state, country,zipcode,")
	public void user_enter_the_valid_streetaddress_city_state_country_zipcode(DataTable dataTable) {

		List<List<String>> ls = dataTable.asLists();
		String streetadd = ls.get(0).get(0);
		String City = ls.get(0).get(1);
		String State = ls.get(0).get(2);
		String Country = ls.get(0).get(3);
		String Zcode = ls.get(0).get(4);

		registerPage.addressFunctionality(streetadd, City, State, Country, Zcode);
	}

	@Given("user enter valid phonenumber")
	public void user_enter_valid_phonenumber() {
 
		registerPage.contactInfo("9898989898");
		
	}

	@When("user select and validate the role from dropdownlist")
	public void user_select_and_validate_the_role_from_dropdownlist() {

		registerPage.roleFunctionality("Student");
	}

	@Then("user again validate and enter industry from dropdownlist")
	public void user_again_validate_and_enter_industry_from_dropdownlist() {

		registerPage.industryFunction("Media");

	}

	@Then("user agree the registration policy and click on i agree checkbox")
	public void user_agree_the_registration_policy_and_click_on_i_agree_checkbox() {

		registerPage.agreeCheckbox();
	}

	@AfterStep
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {

			byte[] f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

			String date = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());

			scenario.attach(f, "image/png", date + scenario.getName());
		}
		
		else {
			
		

		byte[] f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

		String date = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());

		scenario.attach(f, "image/png", date + scenario.getName());

	}
	}}


