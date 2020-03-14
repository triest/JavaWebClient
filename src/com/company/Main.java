package com.company;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        WebClient webClient = new WebClient();
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        HtmlPage page = null;
        try {
            page = webClient.getPage("https://qna.habr.com/");
            //    page = webClient.getPage("http://google.com/");
        } catch (IOException e) {
            //          e.printStackTrace();
            System.out.println("Exaption");
            System.exit(100500);
        }

        HtmlInput searchBox = page.getElementByName("q");
        searchBox.setValueAttribute("Selenium");
        System.out.println(searchBox.asText());

/*
        HtmlAnchor seleniumButton = page.getAnchorByText("Selenium");
        try {
            seleniumButton.click();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
/*

        //    HtmlSubmitInput googleSearchSubmitButton = page.getElementByName("btnK"); // sometimes it's "btnK"

        //  page=googleSearchSubmitButton.click();

        // HtmlDivision resultStatsDiv = page.getFirstByXPath("//div[@id='resultStats']");

        //    System.out.println(resultStatsDiv.asText()); // About 309,000 results
        webClient.close();*/
    }
}