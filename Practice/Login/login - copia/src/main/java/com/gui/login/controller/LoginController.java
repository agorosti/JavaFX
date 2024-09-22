package com.gui.login.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private JFXButton btn_login;

    @FXML
    private JFXButton btn_recovery;

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

            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/gui/login/view/welcome.fxml"));
                Parent welcomeRoot = fxmlLoader.load();

                WelcomeController welcomeController = fxmlLoader.getController();
                welcomeController.setWelcomeMessage(username);

                Stage welcomeStage = new Stage();
                welcomeStage.setScene(new Scene(welcomeRoot));
                welcomeStage.show();

                // Closes the login window
                Stage loginStage = (Stage) btn_login.getScene().getWindow();
                loginStage.close();

            } catch (IOException e) {
                e.printStackTrace();
                lbl_validation.setText("Error loading welcome screen");
            }

        }
    }

    @FXML
    void recoveryPassword(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/gui/login/view/recovery.fxml"));
        Parent welcomeRoot = fxmlLoader.load();

        Stage welcomeStage = new Stage();
        welcomeStage.setScene(new Scene(welcomeRoot));
        welcomeStage.show();

        // Closes the login window
        Stage loginStage = (Stage) btn_recovery.getScene().getWindow();
        loginStage.close();
    }

}



