package com.example.sbet_verdion_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextText, editTextText2, editTextText3;
    private Button button_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextText = findViewById(R.id.editTextText);
        editTextText2 = findViewById(R.id.editTextText2);
        editTextText3 = findViewById(R.id.editTextText3);


        String username = getIntent().getStringExtra("nameUser");


        editTextText.setText(username);
        Button button_one = (Button) findViewById(R.id.button_one);

        View.OnClickListener oclbutton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = editTextText2.getText().toString();
                String m = editTextText.getText().toString();
                String c = editTextText3.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("numberUser", m);
                intent.putExtra("nameUser", n);
                intent.putExtra("numberCard", c);
                startActivity(intent);
            }
        };
        button_one.setOnClickListener(oclbutton);
    }
}