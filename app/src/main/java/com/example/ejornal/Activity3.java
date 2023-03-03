package com.example.ejornal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Button BtBack = (Button) findViewById(R.id.btnBack);

        View.OnClickListener onclBtBack=new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Activity3.this, MainActivity.class);

                startActivity(intent);
            }
        };
        BtBack.setOnClickListener(onclBtBack);
    }
}