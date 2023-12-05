package com.example.sbet_verdion_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity7 extends AppCompatActivity {

    TextView editTextText, editTextText2, editTextText3, autoCompleteTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        Button button_three = (Button) findViewById(R.id.button3);

        autoCompleteTextView =findViewById(R.id.textView49);
        editTextText = findViewById(R.id.textView51);

        String name = getIntent().getStringExtra("nameUser");
        String money = getIntent().getStringExtra("money");
        autoCompleteTextView.setText(money);
        editTextText.setText(name);
        View.OnClickListener oclbutton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity7.this, MainActivity8.class);
                startActivity(intent);
            }
        };
        button_three.setOnClickListener(oclbutton);
    }
}