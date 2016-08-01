package com.augmentis.ayp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.suitebuilder.TestMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

public class CalActivity extends AppCompatActivity {
    private String Test="";
    private String TAG ="TEST";
    private TextView primarytxt,secondarytxt;
    private String a="";
    private String b="";
    private String c="";
    protected Button result,clean;
    Calculator calculator = new Calculator();


    Button[] numberButtons;
    Button[] operatorButtons;


    int[] numberBtn = new int[]{
            R.id.button0,
            R.id.button1,
            R.id.button2,
            R.id.button3,
            R.id.button4,
            R.id.button5,
            R.id.button6,
            R.id.button7,
            R.id.button8,
            R.id.button9
    };

    int[] operatorBtn = new int[]{
            R.id.multiply_btn,
            R.id.minus_btn,
            R.id.divide_btn,
            R.id.plus_btn

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        primarytxt = (TextView) findViewById(R.id.primary_txt);
        secondarytxt = (TextView) findViewById(R.id.secondary_txt);
        result = (Button) findViewById(R.id.as_btn);
        clean = (Button) findViewById(R.id.c_btn);


        bindButton();

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                if(!primarytxt.getText().equals("")) {
                    calculator.pressEqual();
                    String v = String.valueOf(calculator.getResult());
                    primarytxt.setText(v);
                    secondarytxt.setText("");
                    secondarytxt.setText(v);
                }
            }
        });
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Test="";
                primarytxt.setText("0");
                secondarytxt.setText("");
                calculator.pressclean();
            }
        });

    }


    private void bindButton() {
        int l = numberBtn.length;
        numberButtons = new Button[l];
        for (int i = 0; i < l; i++) {
            numberButtons[i] = (Button) findViewById(numberBtn[i]);
            numberButtons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Button thisButton = (Button) v;
                    calculator.pressNumber(thisButton.getText().toString());
                    primarytxt.setText(calculator.temp);//num1

                }
            });
        }

        int k  = operatorBtn.length;
        operatorButtons = new Button[k];
        for(int j=0;j<k;j++){
            operatorButtons[j] = (Button) findViewById(operatorBtn[j]);
            operatorButtons[j].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Button thisButton1 = (Button) view;
                    calculator.pressOperator(thisButton1.getText().toString());
                    if(!primarytxt.getText().equals("")){
                        Log.d(TAG,"primary null");
                        a = String.valueOf(calculator.numberThree);
                        b = thisButton1.getText().toString();
                        Test += a+" "+b+" ";
                        secondarytxt.setText(Test);
                        primarytxt.setText("");
                    }else{
                        Log.d(TAG,"primary no null");
                        int n = Test.length();

                        String d=Test.substring(0,n-2);

                        b = thisButton1.getText().toString();
                        Test="";
                        Test += d+b+" ";
                        Log.d(TAG,Test);
                        secondarytxt.setText(Test);
                        primarytxt.setText("");
                    }
                }
            });
        }
    }
}

