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

    EditText Skill1,Skill2,Skill3,Skill4,Skill5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth52);

        txtreset=findViewById(R.id.txtreset);
        txtnext=findViewById(R.id.txtnext);
        Skill1=findViewById(R.id.skill1);
        Skill2=findViewById(R.id.skill2);
        Skill3=findViewById(R.id.skill3);
        Skill4=findViewById(R.id.skill4);
        Skill5=findViewById(R.id.skill5);

        txtnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Skil1 = Skill1.getText().toString();
                String Skil2 = Skill2.getText().toString();
                String Skil3 = Skill3.getText().toString();
                String Skil4 = Skill4.getText().toString();
                String Skil5= Skill5.getText().toString();

                Intent intent =  new Intent();
                startActivity();

            }
        });
        txtreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Skill1.setText("");
                Skill2.setText("");
                Skill3.setText("");
                Skill4.setText("");
                Skill5.setText("");
            }
        });
    }
}