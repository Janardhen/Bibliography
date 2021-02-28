package edu.bsu.cs222;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//This class asks the user directly for citation info.
public class QueryCitationInfo {

    /**
    public static String authorName;
    public static String articleName;
    public static String publisherName;
    public static String publisherLocation;
    public static String publicationDate;
    public static String dateAccessed;
    public static String publicationLocation;
    public static String url;


    public Scanner in = new Scanner(System.in);

    public void queryUser(){
        System.out.println("Finish y");
            queryAuthor();
            queryArticleName();
            queryPublisherName();
            queryPublisherLocation();
            queryPublicationDate();
            queryPublicationLocation();
            queryDateAccessed();
            queryURL();
        }


    public void queryAuthor(){
        System.out.print("Author Name: ");
        int name= 0;
        List <String>Authors=new ArrayList<>();
        do {
                Authors.add(in.nextLine());
                name++;
                System.out.print("Author Name: ");

                int i;
                for (i = 0; i <= name; i++) {
                    System.out.println(Authors.get(i));
                }

        }while(!in.next().equalsIgnoreCase("y"));







    }

    public void queryArticleName(){
        System.out.print("Article Name: ");
        articleName = in.nextLine();
    }

    public void queryPublisherName(){
        System.out.print("Publisher: ");
        publisherName = in.nextLine();
    }
    public void queryPublisherLocation(){
        System.out.print("Location of Publisher: ");
        publicationDate = in.nextLine();
    }

    public void queryPublicationDate(){
        System.out.print("Date of Publication: ");
        publicationDate = in.nextLine();
    }

    public void queryPublicationLocation(){
        System.out.print("Location of Publication: ");
        publicationLocation = in.nextLine();
    }

    public void queryDateAccessed(){
        System.out.print("Date Accessed: ");
        dateAccessed = in.nextLine();
    }

    public void queryURL(){
        System.out.print("URL: ");
        url = in.nextLine();
    }
     **/

}
