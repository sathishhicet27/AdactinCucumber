package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	public static WebDriver driver = RunnerClass.driver;

	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/BookedItinerary.php");

	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("sathishhicet");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("hicet.322");
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		driver.findElement(By.id("login")).click();
	}

	@When("^user Select The Location In Location Field$")
	public void user_Select_The_Location_In_Location_Field() throws Throwable {
		WebElement findElement7 = driver.findElement(By.id("location"));
		Select a = new Select(findElement7);
		a.selectByValue("London");
	}

	@When("^user Select The Hotel Name In Hotel Field$")
	public void user_Select_The_Hotel_Name_In_Hotel_Field() throws Throwable {
		WebElement findElement8 = driver.findElement(By.id("hotels"));
		Select b = new Select(findElement8);
		b.selectByValue("Hotel Sunshine");

	}

	@When("^user Select Type Of Room In Room Type Field$")
	public void user_Select_Type_Of_Room_In_Room_Type_Field() throws Throwable {
		WebElement findElement9 = driver.findElement(By.id("room_type"));
		Select c = new Select(findElement9);
		c.selectByValue("Double");

	}

	@When("^user Select The Number Of Room In Number Of Rooms Field$")
	public void user_Select_The_Number_Of_Room_In_Number_Of_Rooms_Field() throws Throwable {
		WebElement findElement10 = driver.findElement(By.id("room_nos"));
		Select d = new Select(findElement10);
		d.selectByValue("4");

	}

	@When("^user Enter The Check In Date In Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
		WebElement findElement11 = driver.findElement(By.id("datepick_in"));
		findElement11.clear();
		findElement11.sendKeys("13/11/2022");

	}

	@When("^user Enter The Check Out Date In Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
		WebElement findElement6 = driver.findElement(By.id("datepick_out"));
		findElement6.clear();
		findElement6.sendKeys("15/11/2022");

	}

	@When("^user Select The Number Of Adults Per Room In Adults Per Room Field$")
	public void user_Select_The_Number_Of_Adults_Per_Room_In_Adults_Per_Room_Field() throws Throwable {
		WebElement findElement12 = driver.findElement(By.id("adult_room"));
		Select e = new Select(findElement12);
		e.selectByValue("3");

	}

	@When("^user Select The Number Of Children Per Room in Adults Per Room Field$")
	public void user_Select_The_Number_Of_Children_Per_Room_in_Adults_Per_Room_Field() throws Throwable {
		WebElement findElement13 = driver.findElement(By.id("child_room"));
		Select f = new Select(findElement13);
		f.selectByValue("2");

	}

	@Then("^user Click The Search Button It Navigate To Select Hotel Page$")
	public void user_Click_The_Search_Button_It_Navigate_To_Select_Hotel_Page() throws Throwable {
		WebElement findElement14 = driver.findElement(By.id("Submit"));
		findElement14.click();

	}

	@When("^user Select The Hotel From Search Results$")
	public void user_Select_The_Hotel_From_Search_Results() throws Throwable {
		WebElement findElement15 = driver.findElement(By.id("radiobutton_0"));
		findElement15.click();

	}

	@Then("^user Click The Continue Button Navigate To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_Navigate_To_Book_A_Hotel_Page() throws Throwable {
		driver.findElement(By.id("continue")).click();

	}

	@When("^user Enter The First Name In First Name field$")
	public void user_Enter_The_First_Name_In_First_Name_field() throws Throwable {
		WebElement findElement18 = driver.findElement(By.id("first_name"));
		findElement18.sendKeys("Thar");
	}

	@When("^user Enter The Last Name In Last Name field$")
	public void user_Enter_The_Last_Name_In_Last_Name_field() throws Throwable {
		WebElement findElement19 = driver.findElement(By.id("last_name"));
		findElement19.sendKeys("Worx");

	}

	@When("^user Enter The Address In Billing Address field$")
	public void user_Enter_The_Address_In_Billing_Address_field() throws Throwable {
		WebElement findElement20 = driver.findElement(By.id("address"));
		findElement20.sendKeys("Attur Salem district Pin-636113");

	}

	@When("^user Enter The Credit Card No In Credit Card No field$")
	public void user_Enter_The_Credit_Card_No_In_Credit_Card_No_field() throws Throwable {
		WebElement findElement21 = driver.findElement(By.id("cc_num"));
		findElement21.sendKeys("1234567890123456");

	}

	@When("^user Select The Credit Card Type In Credit Card Type field$")
	public void user_Select_The_Credit_Card_Type_In_Credit_Card_Type_field() throws Throwable {
		WebElement findElement22 = driver.findElement(By.id("cc_type"));
		Select h = new Select(findElement22);
		h.selectByValue("MAST");

	}

	@When("^user Select The Expiry Date In Expiry Date Field$")
	public void user_Select_The_Expiry_Date_In_Expiry_Date_Field() throws Throwable {
		WebElement findElement24 = driver.findElement(By.id("cc_exp_year"));
		Select j = new Select(findElement24);
		j.selectByValue("2022");
	}

	@When("^user Enter The CVV Number In CVV Number Field$")
	public void user_Enter_The_CVV_Number_In_CVV_Number_Field() throws Throwable {
		WebElement findElement25 = driver.findElement(By.name("cc_cvv"));
		findElement25.sendKeys("654");
	}

	@Then("^user Click The Book Now Button to Navigate to Confirmation Page$")
	public void user_Click_The_Book_Now_Button_to_Navigate_to_Confirmation_Page() throws Throwable {
		WebElement findElement17 = driver.findElement(By.id("book_now")); // book now button
		findElement17.click();

	}

	@Then("^user Click The Logout page$")
	public void user_Click_The_Logout_page() throws Throwable {
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();
		;

	}

}
