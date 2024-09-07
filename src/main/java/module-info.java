module com.example.accountclassexercise {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.accountclassexercise to javafx.fxml;
    exports com.example.accountclassexercise;
}