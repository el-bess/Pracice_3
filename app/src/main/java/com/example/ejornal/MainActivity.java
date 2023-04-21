package com.example.ejornal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    MainActivity binding;
    public MainActivity(){
        super(R.layout.activity_main);
    }
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}

    //EditText editText;
    //TextView hobbyName;
    //@SuppressLint("MissingInflatedId")
