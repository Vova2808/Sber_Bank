package com.example.sbet_verdion_10;

import static com.example.sbet_verdion_10.R.id.numberUser1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView editTextText, editTextText2, editTextText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button button_one = (Button) findViewById(R.id.button2);

        editTextText = findViewById(R.id.numberUser1);
        editTextText2 = findViewById(R.id.nameUser);
        editTextText3 = findViewById(R.id.textView46);

        String number = getIntent().getStringExtra("numberUser");
        String username = getIntent().getStringExtra("nameUser");
        String card = getIntent().getStringExtra("numberCard");

        editTextText2.setText(username);
        editTextText.setText(number);
        editTextText3.setText(card);
        View.OnClickListener oclbutton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = editTextText2.getText().toString();
                String m = editTextText.getText().toString();
                String c = editTextText3.getText().toString();
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                intent.putExtra("numberUser", m);
                intent.putExtra("nameUser", n);
                intent.putExtra("numberCard", c);
                startActivity(intent);
            }
        };
        button_one.setOnClickListener(oclbutton);
    }
}