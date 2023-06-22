package firstpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
@Test
public class loginnpage {
	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
	  driver.navigate().to("https://www.makemytrip.com/");
	  
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	}
	
	@And("click on Charter Flights")	
	public void click_on_charter_flights() throws InterruptedException {
	    driver.findElement(By.xpath("//span[text()=\"Charter Flights\"]")).click();
	    Thread.sleep(3000);
	}
	@Then("click on ROUND TRIP")
	public void click_on_round_trip() throws InterruptedException {
		 driver.findElement(By.xpath("//li[@data-cy=\"roundTrip\"]")).click();
		 Thread.sleep(3000);
		
	}
	@And("click on FROM")
	public void click_on_from() throws InterruptedException {
		 driver.findElement(By.xpath("//span[@class=\"lbl_input latoBold  appendBottom5\"]")).click();
		 Thread.sleep(3000);
	}
	@When("user enter location in serch field")
	public void user_enter_location_in_serch_field() throws InterruptedException {
		 driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bengaluru");
		 Thread.sleep(3000);
	}
	@Then("select the location")
	public void select_the_location() throws InterruptedException {
	    driver.findElement(By.xpath("//p[text()=\"Bengaluru, India\"]")).click();
	    Thread.sleep(3000);
	}
	@And("click on TO button")
	public void click_on_to_button() throws InterruptedException {
	    driver.findElement(By.xpath("//input[@id=\"toCity\"]")).click();
	    Thread.sleep(3000);
	}
	@When("user enter location into search field")
	public void user_enter_location_into_search_field() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Hyderabad");
		Thread.sleep(3000);
	}
	@Then("select the to location")
	public void select_the_to_location() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()=\"Hyderabad, India\"]")).click();
		Thread.sleep(3000);
	}
	@And("select date")
	public void select_date() throws InterruptedException {
		driver.findElement(By.xpath("//div[@aria-label=\"Thu Nov 24 2022\"]")).click();
		Thread.sleep(3000);
	}
	@Then("select time")
	public void select_time() throws InterruptedException {
		driver.findElement(By.xpath("//li[text()=\"02:00\"]")).click();
		Thread.sleep(3000);
	}
	@And("select return date")
	public void select_return_date() throws InterruptedException {
		driver.findElement(By.xpath("//div[@aria-label='Sat Nov 26 2022']")).click();
		Thread.sleep(3000);
	}
	@Then("select return time")
	public void select_return_time() throws InterruptedException {
		driver.findElement(By.xpath("//li[text()='02:00']")).click();
		Thread.sleep(3000);
	}
	@Then("select number of passengers")
	public void select_number_of_passengers() throws InterruptedException {
		driver.findElement(By.xpath("//li[@data-cy='adults-3']")).click();
		Thread.sleep(3000);

	}

@Then("click on search")
	public void click_on_search() {

		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn']")).click();
	}
/*@And("close the browser")
public void close_the_browser() {
    driver.quit();*/
@Then("click on chepest flight")
public void click_on_chepest_flight() {
    driver.findElement(By.className("customRadioBtn")).click();
}


}

