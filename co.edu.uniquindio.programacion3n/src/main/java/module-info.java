module com.example.programacion3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.programacion3 to javafx.fxml;
    exports com.example.programacion3;
}