package com.example.practice;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    List<Model> arraylist = new ArrayList<>();

    public Adapter(Context context, List<Model> arraylist) {
        this.context = context;
        this.arraylist = arraylist;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        holder.Main.setText(arraylist.get(position).getMain());
        holder.Sub.setText(arraylist.get(position).getSub());
        holder.dropdown.setImageResource(arraylist.get(position).getImage());

        holder.dropdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.Sub.setVisibility(View.VISIBLE);
            }
        });

    }
    
    @Override
    public int getItemCount() {
        return arraylist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView Main, Sub;
        ImageView dropdown;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Main = itemView.findViewById(R.id.main);
            Sub = itemView.findViewById(R.id.sub);
            dropdown = itemView.findViewById(R.id.dropdown);

        }
    }


}
