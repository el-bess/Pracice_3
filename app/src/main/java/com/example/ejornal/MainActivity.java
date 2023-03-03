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

import com.example.ejornal.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "tag";

    EditText editText;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        editText = binding.editName;//Ввод логина
        binding.btEnter.setOnClickListener(onclBtEnter);

        binding.btAutor.setOnClickListener(onclBtAutor);//Кнопка авторизироваться
    }
    View.OnClickListener onclBtEnter=new View.OnClickListener() {
        @Override
        public void onClick(View v){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("name", editText.getText().toString());
            startActivity(intent);
        }
    };
    View.OnClickListener onclBtAutor=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, Activity3.class);
            startActivity(intent);
        }
    };
}