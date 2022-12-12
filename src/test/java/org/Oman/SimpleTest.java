package org.Oman;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SimpleTest {
    @Test
    void fillFromTest() {

        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $("#firstName").setValue("Ivan");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("Mail@mail.ru");
        $("#gender-radio-1").doubleClick();
        $("#userNumber").setValue("7999111123");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1993");
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("July");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__day--004").click();
        $("#subjectsInput").setValue("Economics").pressEnter();
        $("#hobbies-checkbox-1").parent().click();
        $("#currentAddress").setValue("Subject one or no one:)");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Noida").pressEnter();
        $("#submit").click();
        $(".table-responsive").shouldHave(text("Ivan Ivanov"), text("Mail@mail.ru"), text("male"), text("7999111123"),
                text("04 July,1993"), text("Economics"), text("Sports"), text("Subject one or no one:)"),
                text("NCR Noida") );
        $("#closeLargeModal").click();

    }
}
