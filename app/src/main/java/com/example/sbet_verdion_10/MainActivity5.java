package com.example.sbet_verdion_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    TextView editTextText, editTextText2, editTextText3, autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button button_one = (Button) findViewById(R.id.button4);

        editTextText2 = findViewById(R.id.textView23);
        editTextText = findViewById(R.id.textView24);
        editTextText3 = findViewById(R.id.textView37);
        autoCompleteTextView =findViewById(R.id.textView40);

        String number = getIntent().getStringExtra("numberUser");
        String username = getIntent().getStringExtra("nameUser");
        String card = getIntent().getStringExtra("numberCard");
        String money = getIntent().getStringExtra("money");

        editTextText.setText(username);
        editTextText2.setText(number);
        editTextText3.setText(card);
        autoCompleteTextView.setText(money);
        View.OnClickListener oclbutton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = editTextText.getText().toString();
                String m = editTextText2.getText().toString();
                String c = editTextText3.getText().toString();
                String money = autoCompleteTextView.getText().toString();
                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                intent.putExtra("numberUser", m);
                intent.putExtra("nameUser", n);
                intent.putExtra("numberCard", c);
                intent.putExtra("money", money);
                startActivity(intent);
            }
        };
        button_one.setOnClickListener(oclbutton);
    }
}