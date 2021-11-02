package com.Calc;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalcApplication extends Application {
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(CalcApplication.class.getResource("Calc.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("내가 만든 계산기");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}