package com.example.fxmlproject;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public Label message_lbl;

    @FXML
    public Button button;

    private final String message;

    public Controller(String message){
        this.message = message;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) { //its called when fxml is loaded
        button.setOnAction(event-> message_lbl.setText("Message: " + message));
    }
}
