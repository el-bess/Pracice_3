package com.example.ejornal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.ejornal.databinding.FragmentThirdListBinding;

import java.util.ArrayList;
import java.util.List;

public class third_list extends Fragment {
    FragmentThirdListBinding binding;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public third_list(){
        super(R.layout.fragment_third_list);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentThirdListBinding.inflate(inflater, container,false);
        return binding.getRoot();
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<String> school_arr = new ArrayList<String>();
        for (int i = 0; i < 300; i++){
            school_arr.add("Школа № " + (i+1));
        }
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        binding.recyclerView.setLayoutManager(layoutManager);

        MyCustomRecyclerViewAdapter recyclerViewAdapter = new MyCustomRecyclerViewAdapter(getActivity(), school_arr);
        binding.recyclerView.setAdapter(recyclerViewAdapter);
    }
}
