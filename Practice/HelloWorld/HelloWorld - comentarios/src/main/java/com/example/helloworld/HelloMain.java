package com.example.helloworld;

// We import the necessary JavaFX classes to create a graphical application.
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// The HelloMain class extends Application, which means it is a JavaFX application.
public class HelloMain extends Application {
    /**
     * The start method is the entry point of our JavaFX application.
     * This is where we configure and display the graphical interface.
     */
    @Override
    public void start(Stage stage) throws Exception {
        /**
         * FXMLLoader is used to load FXML files. These files define the graphical interface
         * (buttons, labels, etc.) in XML format.
         * Here, we load an FXML file called "hello_view.fxml" that is in the same package as this class.
         */
        FXMLLoader fxmlLoader = new FXMLLoader(HelloMain.class.getResource("hello_view.fxml"));

        /**
         * 'Parent' is the root node of all elements of the graphical interface.
         * The following line loads the interface structure from the FXML file.
         */
        Parent root = fxmlLoader.load();

        /**
         * We create a scene, which is basically what we will see in the window (buttons,
         * texts, etc.), and link it to the root node (root) that we loaded from the FXML.
         */
        stage.setScene(new Scene(root));

        // The window (Stage) is displayed on the screen using the 'show' method.
        stage.show();
    }

    /**
     * The main method is the entry point of the program in general.
     * It calls the launch method, which starts the JavaFX application and eventually calls 'start'.
     */
    public static void main(String[] args) {
        launch(args);  // This method handles starting the entire JavaFX lifecycle.
    }

}
