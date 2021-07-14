package tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AcessoPage;

import javax.security.auth.login.Configuration;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class Desafio {

    @BeforeMethod
    public void start() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://account.blip.ai/login";
    }

    @Test
    public void testDesafio1() {
        $("input[id=email]").sendKeys("caique@teste.com");
        $("input[id=password]").sendKeys("asd12345");
        $("input[id=blip-login]").click();
    }
}

    @Test
    public void testDesafio1() {
        $("input[id=email]").sendKeys("caasddque@teste.com");
        $("input[id=password]").sendKeys("bdrtbd");
        $("input[id=blip-login]").click();
    }
}