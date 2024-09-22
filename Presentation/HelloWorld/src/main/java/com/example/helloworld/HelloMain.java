package com.example.helloworld;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloMain extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloMain.class.getResource("hello_view.fxml"));

        //ControllerView controller = new ControllerView();

        //fxmlLoader.setController(controller);

        Parent root = fxmlLoader.load();

        stage.setScene(new Scene(root));
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
