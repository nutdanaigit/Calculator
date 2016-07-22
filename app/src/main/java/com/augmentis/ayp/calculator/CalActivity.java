package com.augmentis.ayp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

public class CalActivity extends AppCompatActivity {
    private String tod = "0";
    private String TAG="TEST";
    private int total,number1,number2 = 0;
    private TextView primarytxt,secondarytxt;
    private String num1="";
    private String num2="";
    private String operate="";
    private Button result,clean;

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

        primarytxt.setText(tod);
        bindButton();

        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                primarytxt.setText("0");
                secondarytxt.setText("");
                num1="";
                num2="";
                number1=0;
                number2=0;
            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                if(num1!=""&&num2!=""){
                    Log.d(TAG,"hoole");
                    calculate();
                }
            }
        });
    }


    private void calculate(){
         number1 = Integer.parseInt(num2);
         number2 = Integer.parseInt(num1);
            Log.d(TAG,operate);
        if(operate.equals("+")){
            Log.d(TAG,"plus");
            total = number1+number2 ;
        }else if(operate.equals("-")){
            total = number1-number2 ;
        }else if(operate.equals("x")){
            total = number1*number2 ;
        }else if(operate.equals("/")){
            total = number1/number2 ;
        }else{
            //
        }

        String totalString = String.valueOf(total);
        Log.d(TAG,totalString);
        num1="";
        num2="";
        secondarytxt.setText("");
        primarytxt.setText(totalString);
        num1=totalString;
    }
    private void bindButton() {
        int l = numberBtn.length;
        numberButtons = new Button[l];
        for (int i = 0; i < l; i++) {
            numberButtons[i] = (Button) findViewById(numberBtn[i]);
            numberButtons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG,"press button");

                    Button thisButton = (Button) v;
                    num1 += thisButton.getText().toString();
                    primarytxt.setText(num1);//num1

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
                    Log.d(TAG,"thisbutton1");
                    Button thisButton1 = (Button) view;
                    operate = thisButton1.getText().toString();
                    Log.d(TAG,operate);
                    if(operate!=""){
                        num2=num1;
                        secondarytxt.setText(num2+" "+operate);
                        primarytxt.setText("");
                        num1="";
                    }

                }
            });
        }
    }




}

