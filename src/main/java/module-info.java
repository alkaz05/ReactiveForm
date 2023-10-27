module com.example.reactiveform {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.reactiveform to javafx.fxml;
    exports com.example.reactiveform;
}