package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


class AlfaBankDepositTest {
    @Test
    void selenideSearchTest() {
        open("https://alfabank.ru/");

        $(byText("Вклады")).click();
        $("body").shouldHave(text("Депозиты"));
        $$(byText("Депозиты")).find(visible).click();
        $(byText("Архивные депозиты")).click();

        $("html").shouldHave(text("Архивные депозиты"));
    }
}








