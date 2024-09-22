package com.example.helloworld;

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

    /**
     * The button defined in the FXML file, associated with an ID of 'btn'.
     * When the user clicks this button, the 'showText' method is triggered.
     */
    @FXML
    private Button btn;

    /**
     * Label that can display some text in the user interface.
     * It is linked with an ID of 'lbl' in the FXML file.
     */
    @FXML
    private Label lbl;

    /**
     * TextField where the user can enter text.
     * The value of this field is obtained in the 'showText' method.
     */
    @FXML
    private TextField txt;

    /**
     * This method is triggered when the button is clicked. Its function is to open a new window.
     * First, it gets the text from the 'txt' text field, then it loads a new FXML file
     * called "new_window.fxml", and finally, shows that new window.
     */
    @FXML
    void showText(ActionEvent event) throws IOException {
        // Gets the text entered by the user in the 'txt' text field.
        String text = txt.getText();

        // We load the new view from the "new_window.fxml" file.
        FXMLLoader fxmlLoader = new FXMLLoader(HelloMain.class.getResource("new_window.fxml"));

        // We load the FXML file and create the interface structure.
        Parent root = fxmlLoader.load();

        // We obtain the controller of the new window to pass the text to it.
        ControllerNew controller = fxmlLoader.getController();

        // We pass the text from the 'txt' text field to the controller of the new window.
        controller.seeText(text);

        // We create a new window (Stage) to show the new scene.
        Stage stage = new Stage();

        // We set the new scene that we loaded from the FXML.
        stage.setScene(new Scene(root));

        // We set the modality of the new window to make it modal and block the previous window.
        stage.initModality(Modality.WINDOW_MODAL);

        // We set the window that launched the event as the owner of this new window.
        stage.initOwner(((Node) (event.getSource())).getScene().getWindow());

        // We show the new window on the screen.
        stage.show();
    }
}

