package com.company;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        final WebClient webClient = new WebClient();
        HtmlPage page = null;
        try {
            page = webClient.getPage("http://google.com");
        } catch (IOException e) {
            //     e.printStackTrace();
            System.out.println("Exaption");
        }

        HtmlInput searchBox = page.getElementByName("q");
        searchBox.setValueAttribute("Selenium");
/*
        HtmlAnchor seleniumButton = page.getAnchorByText("Selenium");
        try {
            seleniumButton.click();
        } catch (IOException e) {
            System.out.println("Exaption");
        }
        */

        //   List<HtmlDivision> date = page.getByXPath("//div[@class='question question_short']");
        //   System.out.println(date.toString());


        //    HtmlSubmitInput googleSearchSubmitButton = page.getElementByName("btnK"); // sometimes it's "btnK"

        //  page=googleSearchSubmitButton.click();

        // HtmlDivision resultStatsDiv = page.getFirstByXPath("//div[@id='resultStats']");

        //    System.out.println(resultStatsDiv.asText()); // About 309,000 results
        webClient.close();
    }
}