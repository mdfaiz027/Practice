package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    TextView main, sub;
    ImageView dropdown;
    List<Model> arraylist = new ArrayList<>();
    Model model;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = findViewById(R.id.main);
        sub = findViewById(R.id.sub);
        dropdown = findViewById(R.id.dropdown);
        recyclerView = findViewById(R.id.rv_item);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this,arraylist);
        recyclerView.setAdapter(adapter);

        load();
    }

    private void load() {
        model = new Model("Main1","Sub1", R.drawable.ic_baseline_keyboard_arrow_down_24);
        arraylist.add(model);

        for(int i=0; i<100; i++){
            arraylist.add(i, model);
        }
        adapter.notifyDataSetChanged();
    }
}