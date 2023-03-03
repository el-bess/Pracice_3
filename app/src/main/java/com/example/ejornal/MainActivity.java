package com.example.ejornal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "tag";

    EditText editText;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BtEnter = (Button) findViewById(R.id.btEnter);//Кнопка войти
        editText = (EditText) findViewById(R.id.editName);//Ввод логина
        BtEnter.setOnClickListener(onclBtEnter);

        Button BtAutor = (Button) findViewById(R.id.btAutor);//Кнопка авторизироваться
        BtAutor.setOnClickListener(onclBtAutor);
    }
    View.OnClickListener onclBtEnter=new View.OnClickListener() {
        @Override
        public void onClick(View v){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("name", editText.getText().toString());
            Log.i(TAG,"Programno");
            startActivity(intent);
        }
    };
    public void showLog (View v){
        Log.i(TAG,"Declarativno");
    }
    View.OnClickListener onclBtAutor=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, Activity3.class);

            startActivity(intent);
        }
    };
}