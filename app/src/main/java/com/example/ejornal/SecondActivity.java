package com.example.ejornal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity{
    TextView textView; Button BtnBack; EditText textEdit;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_second);

        textEdit=(EditText) findViewById(R.id.editHobby) ;

        TextView textView1 = findViewById(R.id.textView3);//Текстовое поле
        textView1.setText(R.string.logIn);

        ImageView imageView = findViewById(R.id.imageView2);//Картинка
        imageView.setImageResource(R.drawable.film);

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
            intent.putExtra("name", textEdit.getText().toString());
            setResult(RESULT_OK, intent);
            finish();
        }
    };
}