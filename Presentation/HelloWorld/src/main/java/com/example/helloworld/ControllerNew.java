package com.example.helloworld;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerNew {

    @FXML
    private Label lbl;

    @FXML
    public void seeText(String message) {
        lbl.setText(message);
    }

}






















