package com.vytrack.step_definitions;

import com.vytrack.pages.activities.CalendarEventsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class CreateCalendarEventStepDefinitions {
    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();


    @Then("user clicks on create calendar event button")
    public void user_clicks_on_create_calendar_event_button() {
        System.out.println("User click on create calendar event button");
        calendarEventsPage.clickToCreateCalendarEvent();
    }


    @Then("user enters {string} as title")
    public void user_enters_as_title(String string) {
        System.out.println("User enters title: " + string);
        calendarEventsPage.enterCalendarEventTitle(string);
    }

    @Then("user enters {string} as a description")
    public void user_enters_as_a_description(String string) {
        System.out.println("User enters description: " + string);
        calendarEventsPage.enterCalendarEventDescription(string);
    }



    @Then("user verify that description of new calendar event is {string}")
    public void user_verify_that_description_of_new_calendar_event_is(String string) {
        Assert.assertEquals(string,calendarEventsPage.getGeneralInfoDescriptionText());

    }

    @Then("user click on saved and close button")
    public void user_click_on_saved_and_close_button() {
        System.out.println("User click on save and close button");
        calendarEventsPage.clickOnSaveAndClose();
    }

    @Then("user verify that title  of new calendar event is {string}")
    public void user_verify_that_title_of_new_calendar_event_is(String string) {
        Assert.assertEquals(string,calendarEventsPage.getGeneralInfoTitleText());
    }


    // And user enters new calendar event information:
    //      |description | On this meeting we discuss what went well, what went wrong and what can be be improved |
    //      |title       | Sprint Retrospective

    @Then("user enters new calendar event information:")
    public void user_enters_new_calendar_event_information(Map<String , String> dataTable) {
        calendarEventsPage.enterCalendarEventDescription(dataTable.get("description"));
        calendarEventsPage.enterCalendarEventTitle(dataTable.get("title"));
    }

    @Then("user verifies new calendar event new created successfully")
    public void user_verifies_new_calendar_event_new_created_successfully(Map<String , String>  dataTable) {
        Assert.assertEquals(dataTable.get("description"), calendarEventsPage.getGeneralInfoDescriptionText());
        Assert.assertEquals(dataTable.get("title") , calendarEventsPage.getGeneralInfoTitleText());
    }








}
