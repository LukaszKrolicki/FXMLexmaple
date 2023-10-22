module com.example.fxmlproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxmlproject to javafx.fxml;
    exports com.example.fxmlproject;
}