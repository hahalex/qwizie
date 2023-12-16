module com.example.qwiz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.qwiz to javafx.fxml;
    exports com.example.qwiz;
}