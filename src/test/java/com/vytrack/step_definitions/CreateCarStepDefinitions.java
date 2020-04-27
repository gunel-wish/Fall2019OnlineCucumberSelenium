package com.vytrack.step_definitions;

import com.vytrack.pages.fleet.VehiclesPage;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class CreateCarStepDefinitions {

    VehiclesPage vehiclesPage = new VehiclesPage();

    @Then("user click on create a car button")
    public void user_click_on_create_a_car_button() {
        System.out.println("User click on create a car button");
        vehiclesPage.clickCreateCar();

    }

    // Then user creates a car which following info:
    //     | License Plate | Driver   |Location     | Model Year | Color  |
    //     | SDET          | Pro Racer| Rome ,Italy |     2020   |red     |
    @Then("user creates a car which following info:")
    public void user_creates_a_car_which_following_info(List<Map<String ,String>>  dataTable) {



    }



}
