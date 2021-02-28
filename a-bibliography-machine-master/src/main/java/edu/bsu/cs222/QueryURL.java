package edu.bsu.cs222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
/**
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
**/

public class QueryURL extends FormatSources {
    /**
    public static JSONObject JSONFromURL(String url) throws IOException{
        InputStream inputStream = new URL(url).openStream();
        JSONObject empty = new JSONObject();
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
            String jsonText = reader.toString();
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(jsonText);
            return json;
        } catch (ParseException e) {
            e.printStackTrace();
        }finally {
            inputStream.close();
        }
        return empty;
    }
     **/
}
