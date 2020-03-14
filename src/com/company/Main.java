package com.company;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.net.MalformedURLException;


public class Main {

    public static void main(String[] args) {
        try (final WebClient webClient = new WebClient()) {
            final HtmlPage page = webClient.getPage("http://htmlunit.sourceforge.net");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}