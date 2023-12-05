package com.example.sbet_verdion_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    TextView editTextText, editTextText2, editTextText3, autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button button_one = (Button) findViewById(R.id.button);

        editTextText2 = findViewById(R.id.numberUser1);
        editTextText = findViewById(R.id.nameUser);
        editTextText3 = findViewById(R.id.textView25);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        String number = getIntent().getStringExtra("numberUser");
        String username = getIntent().getStringExtra("nameUser");
        String card = getIntent().getStringExtra("numberCard");

        editTextText.setText(username);
        editTextText2.setText(number);
        editTextText3.setText(card);
        View.OnClickListener oclbutton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = editTextText.getText().toString();
                String m = editTextText2.getText().toString();
                String c = editTextText3.getText().toString();
                String money = autoCompleteTextView.getText().toString();
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
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