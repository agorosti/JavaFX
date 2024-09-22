package com.example.helloworld;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerNew {

    /**
     * Label that can display some text in the user interface.
     * It is linked with an ID of 'lbl' in the FXML file.
     */
    @FXML
    private Label lbl;

    /**
     * This method is used to update the text displayed in the 'lbl' label.
     * It receives a string message and sets it as the text of the 'lbl' label.
     */
    @FXML
    public void seeText(String message) {
        // Set the text of the 'lbl' label to the provided message.
        lbl.setText(message);
    }

}