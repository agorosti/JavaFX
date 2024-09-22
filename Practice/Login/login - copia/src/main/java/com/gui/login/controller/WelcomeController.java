package com.gui.login.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class WelcomeController {

    @FXML
    private HBox hbx_red;

    @FXML
    private AnchorPane large;

    @FXML
    private Label lbl_welcome;

    public void setWelcomeMessage(String username){
        lbl_welcome.setText("WELCOME " + username.toUpperCase());
    }

}
