package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.adactin.baseclass.BaseClass;
import com.adactin.configuration.File_Reader_Manager;
import com.adactin.configuration.Page_Object_Manager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class Stepdefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;

	Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^User want to launch the adactin application$")
	public void user_want_to_launch_the_adactin_application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		getUrl(url);
	}

	@When("^User enter \"([^\"]*)\" the valid username$")
	public void user_enter_the_valid_username(String arg1) throws Throwable {
		inputValueElement(pom.getInstanceLoginPage().getUsername(), arg1);
	}

	@When("^User enter \"([^\"]*)\" the valid password$")
	public void user_enter_the_valid_password(String arg1) throws Throwable {
		inputValueElement(pom.getInstanceLoginPage().getPassword(), arg1);
	}

	@Then("^User verify the valid username and password$")
	public void user_verify_the_valid_username_and_password() throws Throwable {
		clickOnElement(pom.getInstanceLoginPage().getLogin());
	}

}
