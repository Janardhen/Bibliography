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
        stage.setTitle("Citation Machine");
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}


