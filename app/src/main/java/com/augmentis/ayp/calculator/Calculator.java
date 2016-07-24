package com.augmentis.ayp.calculator;

import android.util.Log;

/**
 * Created by Nutdanai on 7/24/2016.
 */
public class Calculator {
    protected int numberOne,numberTwo,numberThree,result,countOperator,tod;
    protected String temp,operator,operatorPrimary,totalResult;
    protected boolean changeOperator;

    public Calculator() {
        numberOne=numberTwo=numberThree=result=countOperator=tod=0;
        temp=operator=operatorPrimary=totalResult="";
    }
    public void pressclean(){
        numberOne=numberTwo=numberThree=result=countOperator=tod=0;
        temp=operator=operatorPrimary=totalResult="";
    }
    public void pressNumber(String s) {
            temp+= s;
    }

    public void pressOperator(String o) {
        if (temp == "") {
            operator = o;
        } else {
            numberOne = Integer.valueOf(temp);
            numberThree = numberOne;
            if (countOperator > 0) {
                calculate();
            }
            temp = "";
            operator = o;
            tod = numberOne;
            countOperator++;
        }
    }

    public void calculate(){
        switch (operator){
            case "+": tod += numberOne; break;
            case "-": tod -= numberOne; break;
            case "x": tod *= numberOne; break;
            case "/": if (numberOne!=0){ tod /= numberOne;}else{
                System.out.println("can't divide by zero");} break;
        }
        numberOne=tod;
    }

    public void pressEqual() {
        numberTwo=Integer.valueOf(temp);
        if(operator.equals("+")){
            result = numberOne+numberTwo ;
        }else if(operator.equals("-")){
            result = numberOne-numberTwo ;
        }else if(operator.equals("x")){
            result = numberOne*numberTwo ;
        }else if(operator.equals("/")&&numberTwo!=0){
            result = numberOne/numberTwo ;
        }else{
            System.out.println("can't divide by zero");
        }
//        totalResult = String.valueOf(result);
    }

    public int getResult() {
        return result;
    }

}
