package edu.bsu.cs222;

//This class formats the info from QueryCitationInfo into MLA format.

import java.util.ArrayList;

public class FormatSources extends FormatsInArrayList{

    public FormatSources(){
    }

    public void formatMLA(String authorName, String articleName, String publisherName, String publicationDate, String url, String dateAccessed){
        String source = authorName + ". \"" + articleName + "\" " + publisherName + ", " + publicationDate + ", " + url + ". Accessed " + dateAccessed;
        addToList(source);
    }
    public void formatAPA(String authorName, String articleName, String publicationDate, String dateAccessed, String publisherLocation){
        String source = authorName + ". \"" + articleName + "\" "+ publicationDate +  ", "+ publisherLocation+  ", "  + dateAccessed+".";
        addToList(source);
    }
    public void formatChicago(String authorName, String articleName, String publisherName, String publicationDate, String publisherLocation){
        String source = authorName + ". \"" + articleName + "\" " + publisherLocation + ", " + publisherName + ", "  +  publicationDate+".";
        addToList(source);
    }

    public String getTotalList(){
        String totalList = "";
        for(int i = 0; i < list.size(); i++){
            totalList = totalList + "\n" + getListItem(i);
        }
        return totalList;
    }

}
