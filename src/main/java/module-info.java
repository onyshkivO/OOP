module com.example.lab111java {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.lab111java to javafx.fxml;
    exports com.example.lab111java;
}