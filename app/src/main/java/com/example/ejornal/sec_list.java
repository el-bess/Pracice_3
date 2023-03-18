package com.example.ejornal;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class sec_list extends Fragment {
    private static final String TAG = "tag";
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getContext(),"onCreate sec_fragment", Toast.LENGTH_LONG).show();
        Log.i("Fragment","onCreate sec_fragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Toast.makeText(getContext(),"onCreateView sec_fragment", Toast.LENGTH_LONG).show();
        Log.i("Fragment","onCreateView sec_fragment");
        return inflater.inflate(R.layout.fragment_sec_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toast.makeText(getContext(),"onViewCreated sec_fragment", Toast.LENGTH_LONG).show();
        Log.i("Fragment","onViewCreated sec_fragment");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Toast.makeText(getContext(),"onViewStateRestored sec_fragment", Toast.LENGTH_LONG).show();
        Log.i("Fragment","onViewStateRestored sec_fragment");
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getContext(),"onStart sec_fragment", Toast.LENGTH_LONG).show();
        Log.i("Fragment","onStart sec_fragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getContext(),"onResume sec_fragment", Toast.LENGTH_LONG).show();
        Log.i("Fragment","onResume sec_fragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getContext(),"onPause sec_fragment", Toast.LENGTH_LONG).show();
        Log.i("Fragment","onPause sec_fragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(getContext(),"onStop sec_fragment", Toast.LENGTH_LONG).show();
        Log.i("Fragment","onStop sec_fragment");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(getContext(),"onSaveInstanceState sec_fragment", Toast.LENGTH_LONG).show();
        Log.i("Fragment","onSaveInstanceState sec_fragment");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(getContext(),"onDestroyView sec_fragment", Toast.LENGTH_LONG).show();
        Log.i("Fragment","onDestroyView sec_fragment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getContext(),"onDestroy sec_fragment", Toast.LENGTH_LONG).show();
        Log.i("Fragment","onDestroy sec_fragment");
    }
}