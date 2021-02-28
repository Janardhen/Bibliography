package edu.bsu.cs222;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class FormatSourcesTest extends FormatsInArrayList{
    @Test
    public void testFormatMLA(){
        String inputAuthorName = "James";
        String articleName  ="Corona Virus";
        String publisher  ="ABC publishers";
        String publishingDate ="10.10.2005";
        String dateAccessed  ="20.10.2021";
        String url = "https://www.abc.com/";

        FormatSources sources = new FormatSources();
        sources.formatMLA(inputAuthorName, articleName, publisher, publishingDate, url, dateAccessed);

        String result = list.get(0);

        Assertions.assertEquals("James. \"Corona Virus\" 10.10.2005, Ohio, 20.10.2021.", result);
    }
}