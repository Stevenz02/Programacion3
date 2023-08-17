module com.example.tallerprogranocturna {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.tallerprogranocturna to javafx.fxml;
    exports com.example.tallerprogranocturna;
}