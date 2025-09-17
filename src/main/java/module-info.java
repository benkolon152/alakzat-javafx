module com.example.javafxalakzat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxalakzat to javafx.fxml;
    exports com.example.javafxalakzat;
}