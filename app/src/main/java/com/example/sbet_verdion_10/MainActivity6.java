package com.example.sbet_verdion_10;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.example.sbet_verdion_10.R;


public class MainActivity6 extends AppCompatActivity {

    TextView editTextText, editTextText2, editTextText3, autoCompleteTextView;
    public static int SPLASH_TIMER = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        autoCompleteTextView =findViewById(R.id.textView48);
        editTextText = findViewById(R.id.textView52);

        String money = getIntent().getStringExtra("money");
        String name = getIntent().getStringExtra("nameUser");

        autoCompleteTextView.setText(money);
        editTextText.setText(name);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                String m = autoCompleteTextView.getText().toString();
                String n = editTextText.getText().toString();
                Intent intent = new Intent(MainActivity6.this, MainActivity7.class);
                intent.putExtra("money", m);
                intent.putExtra("nameUser", n);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIMER);
    }
}