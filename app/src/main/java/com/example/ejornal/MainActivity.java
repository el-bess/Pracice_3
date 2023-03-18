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

public class MainActivity extends AppCompatActivity{
    public static final String TAG = "tag";
    EditText editText;
    TextView hobbyName;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.container_third, third_list.class, null)
                    .commit();
        }

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

        hobbyName=binding.showHobby;
        editText = binding.editName;//Ввод логина
        binding.btEnter.setOnClickListener(onclBtEnter);

        binding.btAutor.setOnClickListener(onclBtAutor);//Кнопка авторизироваться
    }
    View.OnClickListener onclBtEnter=new View.OnClickListener() {
        @Override
        public void onClick(View v){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("name", editText.getText().toString());
            startActivityForResult(intent,1);
        }
    };
    View.OnClickListener onclBtAutor=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, Activity3.class);
            startActivity(intent);
        }
    };
    protected void onActivityResult(int recCode, int resCode, Intent data) {

        super.onActivityResult(recCode, resCode, data);
        if (data == null){
            return;
        } String name = data.getStringExtra("name");
        hobbyName.setText("В прошлый раз вы выбрали это хоббби: "+name+". Что будет сегодня?");

    }

}