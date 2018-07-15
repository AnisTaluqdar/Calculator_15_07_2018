package com.abhi.www.abhione;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int num1, num2, sum, sub, div, mul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create object

        final EditText editText1 = (EditText) findViewById(R.id.et1);
        final EditText editText2 = (EditText) findViewById(R.id.et2);

        Button btnSum = (Button) findViewById(R.id.bt1);
        Button btnSub = (Button) findViewById(R.id.bt2);
        Button btnDiv = (Button) findViewById(R.id.bt3);
        Button btnMul = (Button) findViewById(R.id.bt4);

        final TextView result = (TextView) findViewById(R.id.tv1);




        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = new Integer(editText1.getText().toString());
                num2 = new Integer(editText2.getText().toString());

                sum = num1 + num2;

                result.setText(Integer.toString(sum));

            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = new Integer(editText1.getText().toString());
                num2 = new Integer(editText2.getText().toString());

                sub = num1 - num2;

                result.setText(Integer.toString(sub));

            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = new Integer(editText1.getText().toString());
                num2 = new Integer(editText2.getText().toString());

                div = num1 * num2;

                result.setText(Integer.toString(div));

            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = new Integer(editText1.getText().toString());
                num2 = new Integer(editText2.getText().toString());

                mul = num1 / num2;

                result.setText(Integer.toString(mul));

            }
        });





    }
}
