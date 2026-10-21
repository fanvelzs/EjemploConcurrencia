module com.example.ejemploconcurrencia {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemploconcurrencia to javafx.fxml;
    exports com.example.ejemploconcurrencia;
}