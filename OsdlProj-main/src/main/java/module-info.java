module com.shivam.hotelmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires java.sql;

    exports com.shivam.hotelmanagement;
    exports com.shivam.hotelmanagement.model;

    opens com.shivam.hotelmanagement.controller to javafx.fxml;
}