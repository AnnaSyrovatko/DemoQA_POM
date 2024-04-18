package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm();
    }

    @Test
    public void createStudentAccountTest(){
       // new PracticeFormPage(driver).hideIframes();
        new PracticeFormPage(driver).enterPersonalData("Ema","Thomson","ema1989@gm.com", "1234567890")
                .selectGender("Male")
                .enterBirthDate("31 August 2000")
                .enterSubject(new String[]{"Maths", "Chemistry"})
                .selectHobby(new String[]{"Sports", "Reading"})
                .uploadFile("C:/Tools/lions.jpg")
                .selectState("NCR")
                .selectCity("Delhi")
                .clickOnSubmit()
                .verifySuccessTitle("Thanks for submitting the form");
    }

}
