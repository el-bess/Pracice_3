package com.example.ejornal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity{

    FragmentManager fragmentManager;
    public MainActivity(){
        super(R.layout.activity_main);
    }
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null){
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().setReorderingAllowed(true).add(R.id.fragment_container_view, first_list.class, null).commit();
        }
    }
}

    //EditText editText;
    //TextView hobbyName;
    //@SuppressLint("MissingInflatedId")

   // @Override
    //protected void onCreate(Bundle savedInstanceState) {
    //    super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);


    //}

//}