module com.example.salaryandrest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.salaryandrest to javafx.fxml;
    exports com.example.salaryandrest;
}