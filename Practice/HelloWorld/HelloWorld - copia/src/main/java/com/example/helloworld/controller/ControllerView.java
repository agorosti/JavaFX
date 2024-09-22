package com.example.helloworld.controller;

import com.example.helloworld.HelloMain;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerView {

    @FXML
    private Button btn;

    @FXML
    private Label lbl;

    @FXML
    private Label lbl_validation;

    @FXML
    private TextField txt;

    @FXML
    void showText(ActionEvent event) throws IOException {
        String text = txt.getText();

        if (text.isEmpty()) {
            // If the text is empty, it displays the message in the Label
            lbl_validation.setText("Please write something");
        } else {
            lbl_validation.setText("");

            // If the text is not empty, it loads the new window
            FXMLLoader fxmlLoader = new FXMLLoader(HelloMain.class.getResource("view/my_new_window.fxml"));
            Parent root = fxmlLoader.load();

            ControllerNew controller = fxmlLoader.getController();
            controller.seeText(text);

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node) (event.getSource())).getScene().getWindow());
            stage.show();
        }
    }


}
