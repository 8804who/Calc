package com.Calc;

public class Model {
    public static int calculate(String operator, int x, int y){
        if(operator.equals("+")){
            return x+y;
        }
        else if (operator.equals("-")){
            return x-y;
        }
        else if (operator.equals("*")){
            return x*y;
        }
        else{
            return x/y;
        }
    }
}
