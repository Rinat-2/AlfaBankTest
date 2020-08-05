package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


class AlfaBankTest {
    @Test
    void selenideSearchTest() {
        open("https://alfabank.ru/");

        $(byText("Вклады")).click();
        $$(byText("Депозиты")).find(visible).click();
        $(byText("Архивные депозиты")).click();

        $("html").shouldHave(text("Архивные депозиты"));
    }
}
class AlfaBank1Test {
    @Test
    void selenideSearchTest() {
        open("https://alfabank.ru/");

        $(byText("Вклады")).click();
        $(".selected").sibling(4).click();

        $(".col-sm-8").parent().shouldHave(text("АО «АЛЬФА-БАНК» является участником системы обязательного страхования вкладов. Это означает,\n" +
                "что средства клиентов Альфа-Банка, размещенные во вкладах и на банковских счетах,\n" +
                "надежно защищены государством. Если банк прекращает работу при наступлении страхового случая,\n" +
                "по закону его вкладчикам выплачиваются возмещения по вкладам."));
    }
}







