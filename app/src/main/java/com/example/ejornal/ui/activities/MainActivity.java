package com.example.ejornal.ui.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.ejornal.R;
import com.example.ejornal.ui.fragments.first_list;

public class MainActivity extends AppCompatActivity{
    FragmentManager fragmentManager;
    MainActivity binding;
    public MainActivity(){
        super(R.layout.activity_main);
    }
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null){
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().setReorderingAllowed(true)
                    .add(R.id.fragmentContainerView, first_list.class, null).commit();
        }
    }
}
