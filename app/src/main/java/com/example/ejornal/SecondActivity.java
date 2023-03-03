package com.example.ejornal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button BtnBack;
        BtnBack=(Button) findViewById(R.id.btnBack);
        BtnBack.setOnClickListener(onclBtBack);

        textView = (TextView) findViewById(R.id.showLogin);
        Intent intent = getIntent();

        String name = intent.getStringExtra("name");

        textView.setText(name);

    }
    View.OnClickListener onclBtBack=new View.OnClickListener() {
        @Override
        public void onClick(View v){
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent);
        }
    };
}