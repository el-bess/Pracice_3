package com.example.ejornal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyCustomListViewAdapter extends ArrayAdapter<String> {
    private LayoutInflater inflater;
    private int layout;
    private List<String> schools;

    public MyCustomListViewAdapter(Context context, int resource, List<String> schools) {
        super(context, resource, schools);
        this.schools = schools;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(this.layout, parent, false);

        TextView text_school = view.findViewById(R.id.text_school);
        text_school.setText(schools.get(position));

        ImageView image_school = view.findViewById(R.id.image_school);
        image_school.setImageResource(R.drawable.cap);

        return view;
    }
}
