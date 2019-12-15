package com.example.caculation_vpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class History extends AppCompatActivity {
ListView listView;
ArrayAdapter<String> adapter;
Button clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        listView=findViewById(R.id.list);
       clear=findViewById(R.id.clear);
        Intent intent=getIntent();
        Bundle bundle=intent.getBundleExtra("package");
        ArrayList<String> arrayList=bundle.getStringArrayList("arraylist");
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
clear.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        adapter.clear();
        adapter.notifyDataSetChanged();
    }
});
listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        adapter.remove(adapter.getItem(i));
        adapter.notifyDataSetChanged();
        return false;
    }
});
    }
}
