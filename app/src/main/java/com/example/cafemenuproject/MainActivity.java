package com.example.cafemenuproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cafe1 =(Button) findViewById(R.id.cafe1);
        Button cafe2 =(Button) findViewById(R.id.cafe2);

        cafe1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),
                        Cafe1.class);
                startActivity(intent);
            }
        });

        cafe2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),
                        Cafe2.class);
                startActivity(intent);
            }
        });
    }
}