package edu.bsu.cs222;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;


public class Main extends Application{

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("GUI.fxml")));
        stage.setScene(new Scene(root));
        stage.setTitle("Test");
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }

    /**
     *
     * This is only here for in case stuff breaks. IGNORE IT FOR NOW. It will be deleted later.
     public static void main(String[] args) throws IOException {
     String continueMain="y";
     QueryCitationInfo userInfo = new QueryCitationInfo();
     Scanner in = new Scanner(System.in);

     do{
     System.out.println("Do you want to enter the info yourself? [y or n]");//Automatic content put-in has not been implemented
     if(in.nextLine().equals("y")) {
     System.out.println("Which format you would like to use?");
     if (in.nextLine().equalsIgnoreCase("APA")) {
     userInfo.queryUser();//Adjusted the code so that the displayed content is as expected
     System.out.println(formatAPA());
     } else if(in.nextLine().equalsIgnoreCase("MLA")) {
     userInfo.queryUser();
     System.out.println(formatMLA());
     } else if(in.nextLine().equalsIgnoreCase("Chicago")){
     userInfo.queryUser();
     System.out.println(formatChicago());
     }//All three formats were created, and they can be presented by visible UI
     }else
     System.out.println("Enter URL of source: ");
     String sourceURL = in.nextLine();
     JSONObject json = JSONFromURL(sourceURL);
     System.out.println(json.toString());

     System.out.println("Continue? [y or n]: ");
     continueMain = in.nextLine();

     }while(continueMain.equals("y"));
     }
     **/
}