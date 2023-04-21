package com.example.ejornal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.ejornal.databinding.FirstListBinding;

public class first_list extends Fragment {
    FirstListBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public first_list(){
        super(R.layout.first_list);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FirstListBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
    public void onViewCreated( View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btEnter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("bundleKey", "Navigation text");
                Navigation.findNavController(view).navigate(R.id.action_first_list_to_sec_list, bundle);
            }
        });

        binding.btAutor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("bundleKey", "Navigation text");
                Navigation.findNavController(view).navigate(R.id.action_first_list_to_third_list);
            }
        });
    }
}
