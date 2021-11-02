module com.chat.chat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.Calc to javafx.fxml;
    exports com.Calc;
}