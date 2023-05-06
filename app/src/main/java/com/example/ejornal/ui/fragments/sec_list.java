package com.example.ejornal.ui.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ejornal.ui.adapters.MyCustomListViewAdapter;
import com.example.ejornal.R;
import com.example.ejornal.databinding.FragmentSecListBinding;

import java.util.ArrayList;
import java.util.List;

public class sec_list extends Fragment {
    FragmentSecListBinding binding;
    Button butt_not;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public sec_list() {
        super(R.layout.fragment_sec_list);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<String> hobby_arr = new ArrayList<String>();
        for (int i = 0; i < 300; i++) {
            hobby_arr.add("Кружки " + (i + 1));
        }

        MyCustomListViewAdapter listViewAdapter = new MyCustomListViewAdapter(getActivity(), R.layout.itime_sec, hobby_arr);
        binding.listView.setAdapter(listViewAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), hobby_arr.get(i), Toast.LENGTH_SHORT).show();

                Log.i("ListView", hobby_arr.get(i));
            }
        });

        String arguments = getArguments().getString("navigation");
        binding.showLogin.setText(arguments);


    }
}
