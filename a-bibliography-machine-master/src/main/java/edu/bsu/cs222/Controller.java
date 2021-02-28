package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.ResourceBundle;

public class Controller extends FormatSources {

    @FXML
    private TextField inputAuthor;

    @FXML
    private TextField inputArticleName;

    @FXML
    private TextField inputPublisher;

    @FXML
    private TextField inputPublisherLocation;

    @FXML
    private TextField inputPublicationDate;

    @FXML
    private TextField inputDateAccessed;

    @FXML
    private TextField inputURLBOTTOM;

    @FXML
    private TextArea outputText;

    @FXML
    private RadioButton MLAButton;

    @FXML
    private RadioButton APAButton;

    @FXML
    private RadioButton ChicagoButton;

    @FXML
    private Button submitButton;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private ResourceBundle resources;

    public Controller(){}

    @FXML
    private void initialize(){}

    public FormatSources sources = new FormatSources();

    @FXML
    private void addTextArea(){
        outputText.wrapTextProperty();

        citeSource(inputAuthor.getText(), inputArticleName.getText(), inputPublisher.getText(), inputPublisherLocation.getText(), inputPublicationDate.getText(),
                inputDateAccessed.getText(), inputURLBOTTOM.getText());

        outputText.setText(sources.getTotalList());
    }

    @FXML
    private void citeSource(String author, String articleName, String publisher, String publisherLocation, String publicationDate, String dateAccessed, String URL){
        if(MLAButton.isSelected()){
            sources.formatMLA(author, articleName, publisher, publicationDate, dateAccessed, URL);
        }else if(APAButton.isSelected()){
            sources.formatAPA(author, articleName, publicationDate, publisherLocation, dateAccessed);
        }else if(ChicagoButton.isSelected()){
            sources.formatChicago(author, articleName, publisherLocation, publisher, publicationDate);
        }
    }

}