package com.Resume.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class thirdactivity3 extends AppCompatActivity {

    TextView txtreset,txtnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity3);

        txtnext=findViewById(R.id.txtnext);
        txtreset=findViewById(R.id.txtreset);

        txtnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(thirdactivity3.this,fourth4.class);
            }
        });
    }
}