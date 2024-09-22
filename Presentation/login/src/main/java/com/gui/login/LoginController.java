package com.gui.login;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private JFXButton btn_login;

    @FXML
    private Label lbl_validation;

    @FXML
    private PasswordField txt_password;

    @FXML
    private TextField txt_username;

    @FXML
    void loginValidate(ActionEvent event) {
        String username = txt_username.getText();
        String password = txt_password.getText();

        if (username.isEmpty() || password.isEmpty()) {
            lbl_validation.setText("Enter your credentials");
        } else {
            lbl_validation.setText("");
            lbl_validation.setText("Successful login: " + username);
        }
    }
}



