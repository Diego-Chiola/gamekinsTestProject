package com.unige.gamekins_plugin_test.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class CheckStyle {

    private final String path="C:\\Users\\chiol\\Desktop\\università\\Tirocinio\\gamekinsTestProject\\target\\site\\checkstyle.html";
    public Document createDocument(){
        try {
            File input = new File(path);
            return Jsoup.parse(input, "UTF-8");
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     *
     * @param document the document obtained from Jsoup
     * @return the error elements found in a certain file or null if there aren't any
     */
    public static Elements parseTable(Document document){
        Element anchorElement = document.select("a[name=com.2Funige.2Fgamekins_plugin_test.2FBankAccount.java]").get(1);
        if (anchorElement != null){
            //Element parent = anchorElement.parent();
            //System.out.println("parent:" + anchorElement);
            Element targetElement = Objects.requireNonNull(anchorElement).nextElementSibling();
            //System.out.println("target element:" + targetElement);
            return Objects.requireNonNull(targetElement).select("tr");
        }
        return null;
    }
}
