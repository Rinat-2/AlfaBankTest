package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

class AlfaBankContributionTest {
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

class AlfaBankDepositTest {
    @Test
    void selenideSearchTest() {
        open("https://alfabank.ru/");

        $(byText("Вклады")).click();
        $("body").shouldHave(text("Депозиты"));
        $$(byText("Депозиты")).find(visible).click();
        $(byText("Архивные депозиты")).click();

        $(".product-cell__row-header").shouldHave(text("Архивные депозиты"));
    }
}
