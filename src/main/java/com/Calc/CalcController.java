package com.Calc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class CalcController {

    private String operator="";
    private int x=0;
    private int y=0;

    @FXML
    private Text result;

    @FXML
    public void operand(ActionEvent event) {
        result.setText(result.getText()+((Button) event.getSource()).getText());
    }

    @FXML
    public void operator(ActionEvent event) {
        if(((Button) event.getSource()).getText().equals("=")){
            result.setText(Model.calculate(operator,x,Integer.parseInt(result.getText()))+"");
        } else {
            operator=((Button) event.getSource()).getText();
            x=Integer.parseInt(result.getText());
            result.setText("");
        }
    }
}