package com.example.ejornal;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView text_shcools;
    ImageView image_shcools;

    public ViewHolder(View view){
        super(view);
        text_shcools = view.findViewById(R.id.text_school);
        image_shcools = view.findViewById(R.id.image_school);
    }
}
