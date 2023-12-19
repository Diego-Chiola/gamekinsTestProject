package com.unige.gamekins_plugin_test;

import com.unige.gamekins_plugin_test.parser.CheckStyle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParserTest {
    @Test
    public void createDocumentTest(){
        var checkstyle_doc = new CheckStyle();
        var JsoupDoc = checkstyle_doc.createDocument();
        assertNotNull(JsoupDoc);
    }
    @Test
    public void parseTableTest1(){
        var checkstyle_doc = new CheckStyle();
        var JsoupDoc = checkstyle_doc.createDocument();
        var elements = CheckStyle.parseTable(JsoupDoc);
        assertNotNull(elements);
    }
    @Test
    public void parseTableTest2(){
        var checkstyle_doc = new CheckStyle();
        var JsoupDoc = checkstyle_doc.createDocument();
        var elements = CheckStyle.parseTable(JsoupDoc);
        var td_elements = elements.next().select("td");
        System.out.println(td_elements.get(1).text());
    }
}
