package com.Resume.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Fifth5Activity2 extends AppCompatActivity {

    TextView txtreset,txtnext;

    EditText skill1,skill2,skill3,skill4,skill5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth52);

        txtreset=findViewById(R.id.txtreset);
        txtnext=findViewById(R.id.txtnext);
        skill1=findViewById(R.id.skill1);
        skill2=findViewById(R.id.skill2);
        skill3=findViewById(R.id.skill3);
        skill4=findViewById(R.id.skill4);
        skill5=findViewById(R.id.skill5);

        txtnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Skil = skill1.getText().toString();
                String Skill = skill2.getText().toString();
                String Skilll = skill3.getText().toString();
                String Skillll = skill4.getText().toString();
                String Skilllll= skill5.getText().toString();

            }
        });

    }
}