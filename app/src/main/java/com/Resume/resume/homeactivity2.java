package com.Resume.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class homeactivity2 extends AppCompatActivity {

    EditText name,address,contect,email;

    CheckBox dance,travel,music,riding;

    Button reset,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity2);

        name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        contect = findViewById(R.id.contect);
        email = findViewById(R.id.email);
        dance = findViewById(R.id.dance);
        travel = findViewById(R.id.travel);
        music = findViewById(R.id.music);
        riding = findViewById(R.id.riding);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(homeactivity2.this,thirdactivity3.class);

            }
        });
    }
}