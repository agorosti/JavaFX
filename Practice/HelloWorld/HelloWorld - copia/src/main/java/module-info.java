module com.example.helloworld {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.helloworld to javafx.fxml;
    exports com.example.helloworld;
    exports com.example.helloworld.controller;
    opens com.example.helloworld.controller to javafx.fxml;
}