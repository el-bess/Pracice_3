package com.example.ejornal.ui.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.ejornal.R;

import java.util.List;

public class MyCustomRecyclerViewAdapter extends RecyclerView.Adapter<MyCustomRecyclerViewAdapter.ViewHolder>{
    private LayoutInflater inflater;
    private List<String> shcools;
    private Context context;

    public MyCustomRecyclerViewAdapter(Context context, List<String> shcools) {
        this.inflater = LayoutInflater.from(context);
        this.shcools = shcools;
        this.context = context;
    }

    @Override
    public MyCustomRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.itime_sec, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyCustomRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.text_shcools.setText(shcools.get(position));
        holder.image_shcools.setImageResource(R.drawable.cap);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, shcools.get(holder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
                Log.i("RecyclerView", shcools.get(holder.getAdapterPosition()));
            }
        });
    }

    public int getItemCount() {
        return shcools.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView text_shcools;
        ImageView image_shcools;

        public ViewHolder(View view){
            super(view);
            text_shcools = view.findViewById(R.id.text_school);
            image_shcools = view.findViewById(R.id.image_school);
        }
    }

}
