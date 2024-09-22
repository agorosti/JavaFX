module com.gui.login {
    requires javafx.fxml;
    requires com.jfoenix;
    requires javafx.controls;

    opens com.gui.login to javafx.fxml;
    exports com.gui.login;
    exports com.gui.login.controller;
    opens com.gui.login.controller to javafx.fxml;
}