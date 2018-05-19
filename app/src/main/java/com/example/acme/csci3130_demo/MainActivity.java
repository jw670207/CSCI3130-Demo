/*
 * CSCI3130 Assignment1
 * Writer: Juliano Franz
 * Modified by Jaewoong Kang(B00779368)
 * Date: May 18th 2018
 * Detail: Basic UI for input text and display it on Textveiw
 * Version: 1.0
 * Referenced from https://developer.android.com/reference/android/support/constraint/ConstraintLayout
 */

package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private EditText et1;
    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        et1 = findViewById(R.id.et1);
        bt1 = findViewById(R.id.bt1);

        tv1.setText(R.string.defaut);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("");
                String input_Text = et1.getText().toString();
                tv1.setText(input_Text);
                et1.setText("");
            }
        });
    }


}
